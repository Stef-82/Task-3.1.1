package springboot.task_3_1_1.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import springboot.task_3_1_1.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager entityManager;

    public List<User> getAllUsers() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("SELECT user FROM User user", User.class).getResultList();
    }

    @Override
    public void addUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(user);
    }

    @Override
    public User getUser(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(User.class, id);
    }

    @Override
    public void updateUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.update(user);
    }

    @Override
    public void deleteUser(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.delete(user);
    }
}

