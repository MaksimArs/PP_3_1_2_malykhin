package com.exampel_springboot.pp_3_1_2_malykhin.service;

import com.exampel_springboot.pp_3_1_2_malykhin.dao.UserDao;
import com.exampel_springboot.pp_3_1_2_malykhin.model.User;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);

    }

    @Override
    @Transactional
    public void update(User updatedUser) {
        userDao.update(updatedUser);
    }

    @Override
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
