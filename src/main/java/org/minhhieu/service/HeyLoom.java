package org.minhhieu.service;

import jdk.internal.vm.Continuation;
import jdk.internal.vm.ContinuationScope;

public class HeyLoom {
    public static void main(String[] args) {

        Thread.startVirtualThread(() -> {
            System.out.println("Arise a virtual thread");
        });

        var scope = new ContinuationScope("my-scope");

        var continuation = new Continuation(scope, () -> {

        });



    }


}
