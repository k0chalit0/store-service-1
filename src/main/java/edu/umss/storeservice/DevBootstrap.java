package edu.umss.storeservice;
/**
 * @author: Jose Iriarte
 */
import edu.umss.storeservice.model.*;
import edu.umss.storeservice.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private BillRepository billRepository;

    public DevBootstrap(BillRepository billRepository) {
        this.billRepository = billRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        /*Bill bill = new Bill();
        bill.setBillCode("bill1");
        bill.setNit("111122223333");
        bill.setDeleted(false);
        bill.setTotalPay(100);
        billRepository.save(bill);
        */

        List<Bill> billList = billRepository.findAll();

        Bill billItem = billRepository.findById(1L);
        billItem.getBillCode();

        Boolean isDeleted = billRepository.deleteById(3L);
        if(isDeleted){
            System.out.println("Bill deleted");
        }
    }

}
