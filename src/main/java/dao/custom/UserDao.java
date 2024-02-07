package dao.custom;

import dao.CrudDao;
import entity.User;

public interface UserDao extends CrudDao<User> {
    User searchUser(String id);
}
