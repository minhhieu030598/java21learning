package org.minhhieu.service.observer;

import org.minhhieu.service.observer.other.AuctionService;
import org.minhhieu.service.observer.other.DepositService;
import org.minhhieu.service.observer.other.PaymentService;
import org.minhhieu.service.observer.transaction.TxnTypeService;

public class ObserverEntry {
    public static void main(String[] args) {
        TxnTypeService txnTypeService = new TxnTypeService();
        AuctionService auctionService = new AuctionService();
        DepositService depositService = new DepositService();
        PaymentService paymentService = new PaymentService();

        auctionService.print();
        depositService.print();
        paymentService.print();

        txnTypeService.create("LIENVIETPOSTBANK");
        auctionService.print();
        depositService.print();
        paymentService.print();

        txnTypeService.create("AGRIBANK");
        auctionService.print();
        depositService.print();
        paymentService.print();
    }
}
