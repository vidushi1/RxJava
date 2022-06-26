package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

import java.time.Duration;

public class FromInterval {

    public static void main(String[] args) {
      Flux.interval(Duration.ofSeconds(4)).subscribe(Util.onNext());
      Util.sleepSeconds(5);
    }
}
