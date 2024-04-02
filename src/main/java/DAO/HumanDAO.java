package DAO;

import Entities.Human;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class HumanDAO implements DAO<Human> {
    @Override
    public void add(Human human) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Human.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(human);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(int humanId) {
        Configuration config = new Configuration();
        config.addAnnotatedClass(Human.class);
        config.configure();

        try (SessionFactory sessionFactory = config.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();
            session.delete(session.get(Human.class, humanId));

            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Human object) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Human.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession())
        {
            session.beginTransaction();

            session.update(object);

            session.getTransaction().commit();
        }
    }

    @Override
    public Human getObjectByID(int id) {
        return null;
    }
}
