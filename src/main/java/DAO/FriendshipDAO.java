package DAO;

import Entities.Cat;
import Entities.Friendship;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLException;

public class FriendshipDAO implements DAO<Friendship>{
    @Override
    public void add(Friendship object) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Friendship.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession())
        {
            session.beginTransaction();

            session.save(object);

            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(int objectid) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Friendship.class);
        configuration.configure();

        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
             Session session = sessionFactory.openSession())
        {
            session.beginTransaction();

            session.delete(session.get(Friendship.class, objectid));


            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Friendship object) {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Friendship.class);
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
    public Friendship getObjectByID(int id) {
        return null;
    }
}
