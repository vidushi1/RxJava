package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FromIterable {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1,2,3,4,5,6,7);
        Flux.fromIterable(number)
                .log()
                .subscribe(Util.onNext());
    }
}
