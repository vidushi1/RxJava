package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

public class MonoFromFlux {

    public static void main(String[] args) {

      Flux.range(1,10)
              .filter(i->i>3)
              .next()
              .subscribe(Util.onNext(),
                      Util.onError()
                      ,Util.onComplete());
    }
}
