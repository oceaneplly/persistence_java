package com.example.tp1.jpaDao;

import com.example.tp1.entities.E_Competition;
import com.example.tp1.entities.E_Course;
import jakarta.persistence.EntityManager;

public class JpaDaoCompetition extends JpaDao<E_Competition> implements DaoCompetition {
    private static JpaDaoCompetition instance;

    private JpaDaoCompetition (EntityManager entityManager) {
        super(entityManager);
    }

    public static JpaDaoCompetition getInstance (EntityManager entityManager) {
        if(instance == null) {
            instance = new JpaDaoCompetition(entityManager);
        }
        return instance;
    }

    public void create(E_Competition competition) {
        super.create(competition);
    }

    @Override
    public Object find(Class c, int id) {
        return super.find(c, id);
    }

    public Object find(int id) {
        return super.find(E_Competition.class,id);
    }

    @Override
    public void update(Object obj) {
        super.update(obj);
    }

    public void delete(E_Competition obj) {
        super.delete(obj);
    }

    @Override
    public int nombreCourses(int id) {
        return 0;
    }
}
