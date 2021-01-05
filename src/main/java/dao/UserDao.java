package dao;

import model.User;

import java.util.List;

public interface UserDao {
    User save(User user);

    List<User> getAll();
}
// Create , read, update, delete. CRUD...