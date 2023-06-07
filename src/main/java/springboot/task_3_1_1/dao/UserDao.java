package springboot.task_3_1_1.dao;

import springboot.task_3_1_1.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void addUser(User user);

    User getUser(int id);

    void updateUser(User user);

    void deleteUser(User user);
}

