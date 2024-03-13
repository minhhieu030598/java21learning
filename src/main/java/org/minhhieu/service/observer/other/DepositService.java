package org.minhhieu.service.observer.other;

import org.minhhieu.service.observer.TransactionType;
import org.minhhieu.service.observer.repository.TxnTypeRepository;
import org.minhhieu.service.observer.transaction.TxnTypeObserver;

import java.util.Map;
import java.util.stream.Collectors;

public class DepositService {
    private Map<String, Long> txnTypeMap;

    public DepositService() {
        this.txnTypeMap = convertTrxTypes();
        TxnTypeObserver.add(() -> txnTypeMap = convertTrxTypes());
    }

    private Map<String, Long> convertTrxTypes() {
        var txnTypes = TxnTypeRepository.findActivate();
        return txnTypes.stream()
                .collect(Collectors.toMap(TransactionType::getName, TransactionType::getId));
    }

    public void print() {
        System.out.println(STR."DepositService: \{txnTypeMap}");
    }
}
