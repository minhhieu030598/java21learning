package org.minhhieu.service.observer.other;

import org.minhhieu.service.observer.TransactionType;
import org.minhhieu.service.observer.repository.TxnTypeRepository;
import org.minhhieu.service.observer.transaction.TxnTypeObserver;

import java.util.Map;
import java.util.stream.Collectors;


public class AuctionService {
    private Map<Long, String> txnTypeMap;


    public AuctionService() {
        this.txnTypeMap = convertTrxTypes();
        TxnTypeObserver.add(() -> txnTypeMap = convertTrxTypes());
    }

    private Map<Long, String> convertTrxTypes() {
        var txnTypes = TxnTypeRepository.findActivate();
        return txnTypes.stream()
                .collect(Collectors.toMap(TransactionType::getId, TransactionType::getName));
    }

    public void print() {
        System.out.println(STR."AuctionService: \{txnTypeMap}");
    }
}
