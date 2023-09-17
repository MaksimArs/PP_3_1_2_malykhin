package com.exampel_springboot.pp_3_1_2_malykhin.dao;

import com.exampel_springboot.pp_3_1_2_malykhin.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;
    @Override
    //@SuppressWarnings("unchecked")
    public List<User> getAllUsers() {
        return em.createQuery("FROM User ").getResultList();
    }

    @Override
    //@SuppressWarnings("unchecked")
    public User getUserById(int id) {
        return em.find(User.class, id);
    }

    @Override
    public void save(User user) {
        em.persist(user);

    }

    @Override
    public void update(User updatedUser) {
        em.merge(updatedUser);
        em.flush();
    }

    @Override
    public void delete(int id) {
        em.remove(getUserById(id));

    }
}
