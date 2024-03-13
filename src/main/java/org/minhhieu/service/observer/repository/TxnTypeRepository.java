package org.minhhieu.service.observer.repository;


import org.minhhieu.service.observer.TransactionType;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class TxnTypeRepository {
    private static final List<TransactionType> store;
    private static final AtomicLong idGen = new AtomicLong(7);

    static {
        store = new ArrayList<>();
        store.add(new TransactionType().setId(1L)
                .setName("NAPAS"));
        store.add(new TransactionType().setId(2L)
                .setName("MBANK"));
        store.add(new TransactionType().setId(3L)
                .setName("TECHCOMBANK"));
        store.add(new TransactionType().setId(4L)
                .setName("SACOMBANK"));
        store.add(new TransactionType().setId(5L)
                .setName("VIETTEL_MONEY"));
        store.add(new TransactionType().setId(6L)
                .setName("VIETINBANK"));
        store.add(new TransactionType().setId(7L)
                .setName("BIDV"));
    }

    public static List<TransactionType> findActivate() {
        return store;
    }

    public static void create(String typeName) {
        store.add(new TransactionType().setId(idGen.incrementAndGet())
                        .setName(typeName));
    }

}
