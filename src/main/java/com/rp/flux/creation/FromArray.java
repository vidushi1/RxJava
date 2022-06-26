package com.rp.flux.creation;

import com.rp.Util;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class FromArray {

  public static void main(String[] args) {
    Integer[] number = {1,2,3,4,5,6,7};
    Flux.fromArray(number)
            .subscribe(Util.onNext());
  }
}