package org.minhhieu.service.observer.transaction;

import org.minhhieu.service.observer.repository.TxnTypeRepository;

public class TxnTypeService {

    public TxnTypeService() {

    }

    public void create(String typeName) {
        TxnTypeRepository.create(typeName);
        TxnTypeObserver.inform();
    }
}
