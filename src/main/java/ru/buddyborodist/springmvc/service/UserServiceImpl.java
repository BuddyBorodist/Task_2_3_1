package ru.buddyborodist.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.buddyborodist.springmvc.dao.UserDao;
import ru.buddyborodist.springmvc.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public void deleteUserId(Long id) {
        userDao.deleteUserId(id);
    }

    @Override
    public User getUserId(Long id) {
        return userDao.getUserId(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}