package ru.buddyborodist.springmvc.dao;

import org.springframework.transaction.annotation.Transactional;
import ru.buddyborodist.springmvc.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveUser (User user);

    void deleteUserId(Long id);

    User getUserId (Long id);

    void updateUser (User user);
}


