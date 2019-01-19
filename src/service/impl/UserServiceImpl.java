package service.impl;

import dao.UserDAO;
import dao.impl.UserDAOImpl;
import entity.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public User save(User param) {
        return userDAO.save(param);
    }

    @Override
    public User update(User param) {
        return userDAO.update(param);
    }

    @Override
    public int delete(User param) {
        return userDAO.delete(param);
    }

    @Override
    public User findById(int id) {
        return userDAO.findById(id);
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }
}
