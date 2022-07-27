package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void add (User user) {
        userDao.add(user);
    }

    @Transactional
    @Override
    public void delete (long id) {
        userDao.delete(id);
    }

    @Transactional
    @Override
    public User change (User user) {
        return userDao.change(user);
    }
    @Transactional
    @Override
    public List<User> listUsers () {
        return userDao.listUsers();
    }
    @Transactional
    @Override
    public User findUserById (long id) {
        return userDao.findUserById(id);
    }
}
