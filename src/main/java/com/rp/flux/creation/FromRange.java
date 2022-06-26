package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

import java.util.stream.Stream;

public class FromRange {

    public static void main(String[] args) {
        Flux.range(3,10).subscribe(Util.onNext());
    }
}
