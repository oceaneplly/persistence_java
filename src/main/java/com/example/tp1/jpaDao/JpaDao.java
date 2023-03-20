package com.example.tp1.jpaDao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.Query;

import java.util.List;

public abstract class JpaDao<T> implements DaO{

    protected final EntityManager entityManager;

    protected JpaDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void create(Object obj) {
        entityManager.getTransaction().begin();
        entityManager.merge(obj);
        entityManager.getTransaction().commit();
    }

    @Override
    public Object find(Class c, int id) {
        Object object = entityManager.find(c, id);
        if (object == null) {
            throw new EntityNotFoundException("Can't find "+ c +"for ID "
                    + id);
        }
        return object;
    }

    @Override
    public List<T> findAll(Class c) {
        final String strQuery = "SELECT e FROM " + c.getSimpleName() +" e";
        System.out.println(strQuery);
        Query query = entityManager.createQuery(strQuery);
        List<T> results = query.getResultList();
        return results;
    }

    @Override
    public void update(Object obj) {
        entityManager.getTransaction().begin();
        entityManager.merge(obj);
        entityManager.getTransaction().commit();
    }

    @Override
    public void delete(Object obj) {
        entityManager.getTransaction().begin();
        entityManager.remove(obj);
        entityManager.getTransaction().commit();
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public void close() {

    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
