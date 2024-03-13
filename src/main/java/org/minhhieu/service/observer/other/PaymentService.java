package org.minhhieu.service.observer.other;

import org.minhhieu.service.observer.repository.TxnTypeRepository;
import org.minhhieu.service.observer.transaction.TxnTypeObserver;

public class PaymentService {
    private Integer size;

    public PaymentService() {
        this.size = getTxnTypeSize();
        TxnTypeObserver.add(() -> size = getTxnTypeSize());
    }

    private Integer getTxnTypeSize() {
        return TxnTypeRepository.findActivate().size();
    }

    public void print() {
        System.out.println(STR."PaymentService: size \{size}");
    }

}
