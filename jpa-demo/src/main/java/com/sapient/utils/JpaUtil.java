package com.sapient.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class JpaUtil {
    private JpaUtil() {
    }

    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TRAINING");
      
        return factory.createEntityManager();
    }
}
