package com.exampel_springboot.pp_3_1_2_malykhin.dao;



import com.exampel_springboot.pp_3_1_2_malykhin.model.User;

import java.util.List;

public interface UserDao {
    public List<User> getAllUsers();
    public User getUserById(int id);
    public void save(User user);
    public void update(User updatedUser);
    public void delete(int id);
}
