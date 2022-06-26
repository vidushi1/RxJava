package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

public class FromStream {

    public static void main(String[] args) {
        Integer[] number = {1,2,3,4,5,6,7};
        Flux.fromStream( Stream.of(number))
                .subscribe(Util.onNext());
    }
}
