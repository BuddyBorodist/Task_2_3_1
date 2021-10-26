package ru.buddyborodist.springmvc.service;

import ru.buddyborodist.springmvc.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser (User user);

    void deleteUserId(Long id);

    User getUserId (Long id);

    void updateUser (User user);
}