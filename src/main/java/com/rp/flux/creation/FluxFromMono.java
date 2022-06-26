package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FluxFromMono {

    public static void main(String[] args) {
        Mono<String> mono = Mono.just("a");
        Flux<String> fluxFromMono = Flux.from(mono);
        fluxFromMono.subscribe(Util.onNext());
    }
}
