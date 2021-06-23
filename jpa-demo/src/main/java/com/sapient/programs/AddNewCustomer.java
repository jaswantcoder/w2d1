package com.sapient.programs;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.sapient.entity.Customer;
import com.sapient.utils.JpaUtil;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class AddNewCustomer {
    public static void main(String[] args)
    {
        Customer cust = new Customer();
        cust.setName("Jaswant");
        cust.setCity("Aligarh");
        cust.setEmail("jaswant.arya@publicissapient.com");
        cust.setPhone("9237");
        log.debug("customer={}",cust);

        EntityManager em = JpaUtil.getEntityManager();
        EntityTransaction tx = em.getTransaction();
tx.begin();
try  {
    em.persist(cust);tx.commit();
    
} catch (Exception e) {
   tx.rollback();
}
    }
    
}
