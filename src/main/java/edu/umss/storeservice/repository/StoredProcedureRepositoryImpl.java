package edu.umss.storeservice.repository;

import edu.umss.storeservice.model.ModelBase;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.List;

public abstract class StoredProcedureRepositoryImpl<T extends ModelBase> {
    @Autowired
    private EntityManager entityManager;

    public List<T> findAll(){
        StoredProcedureQuery spQuery =
                entityManager.createNamedStoredProcedureQuery("getAllUsers");
        return spQuery.getResultList();
    }
}
