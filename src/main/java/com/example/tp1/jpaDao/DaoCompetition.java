package com.example.tp1.jpaDao;

public interface DaoCompetition<T> extends DaO<T> {
    @Override
    void create(T obj);

    @Override
    T find(Class c, int id);

    @Override
    void update(T obj);

    @Override
    void delete(T obj);

    int nombreCourses(int id);
}
