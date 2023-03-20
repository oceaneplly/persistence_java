package com.example.tp1.jpaDao;

import java.util.List;

public interface DaO<T> {
    public void create(T obj) ;
    public T find(Class c, int id) ;
    public List<T> findAll(Class c);
    public void update(T obj) ;
    public void delete(T obj) ;
    public boolean deleteAll() ;
    public void close();
}
