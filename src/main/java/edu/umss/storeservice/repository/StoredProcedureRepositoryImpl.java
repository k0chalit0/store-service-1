package edu.umss.storeservice.repository;

import com.sun.xml.bind.v2.model.core.ID;
import edu.umss.storeservice.model.ModelBase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class StoredProcedureRepositoryImpl<T extends ModelBase> implements CrudRepository<T, Long> {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<T> findAll(){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery querySP = entityManager.createNamedStoredProcedureQuery("GetAll"+typeName);
        querySP.execute();

        return (List<T>) querySP.getResultList();
    }

    @Transactional
    public T findById(ID id){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery  querySP = entityManager.createNamedStoredProcedureQuery("Get"+typeName+"ById");
        querySP.setParameter("id", id);

        querySP.execute();

        return (T) querySP.getSingleResult();
    }

    @Transactional
    public Boolean deleteById(ID id){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery  querySP = entityManager.createNamedStoredProcedureQuery("Delete"+typeName+"ById");
        querySP.setParameter("id", id);

        querySP.execute();

        return (Boolean) querySP.getOutputParameterValue("result");
    }

    @Transactional
    public Boolean save(T modelData){
        String typeName = (((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0]).getTypeName();
        typeName = typeName.substring(typeName.lastIndexOf('.') + 1);

        StoredProcedureQuery  querySP = entityManager.createNamedStoredProcedureQuery("Save"+typeName+"");
        querySP.setParameter("modelData", modelData);

        querySP.execute();

        return (Boolean) querySP.getOutputParameterValue("result");
    }
}
