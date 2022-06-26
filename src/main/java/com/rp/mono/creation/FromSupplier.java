package com.rp.mono.creation;

import com.rp.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class FromSupplier {

    public static void main(String[] args) {
        wayOne();
        wayTwo();
        Mono<String> mono = Mono.fromSupplier(()->getName());
      mono.subscribe(Util.onNext());
    }

    static void wayOne() {
        Mono<String> mono = Mono.fromSupplier(()->getName());
        mono.subscribe(Util.onNext());
    }


    static void wayTwo() {
        Supplier supplier = () -> getName();
        Mono<String> mono = Mono.fromSupplier(supplier);
        mono.subscribe(Util.onNext());
    }


    static void wayThree() {
        Callable<String> clb = () -> getName();
    }


    static String getName(){
      System.out.println("Generating name...");
      return Util.getFaker().name().fullName();
    }
}
