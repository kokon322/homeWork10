package service.impl;

import dao.UserDao;
import dao.impl.UserDaoImpl;
import model.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao dao = new UserDaoImpl();

    @Override
    public User save(User user) {
        return dao.save(user);
    }

    @Override
    public List<User> getAll() {
        return dao.getAll();
    }
}
