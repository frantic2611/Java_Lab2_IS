package DAO;

import Entities.Cat;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CatDAO implements DAO<Cat> {
    @Override
    public void add(Cat cat) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Cat.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession())
        {
            session.beginTransaction();

            session.save(cat);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(int id) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Cat.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession())
        {
            session.beginTransaction();
            session.delete(session.get(Cat.class, id));

            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Cat cat) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Cat.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory()) {
            Session session = sessionFactory.openSession();
            session.beginTransaction();

            session.update(cat);

            session.getTransaction().commit();
        }
    }

    @Override
    public Cat getObjectByID(int id) {
        return null;
    }

}
