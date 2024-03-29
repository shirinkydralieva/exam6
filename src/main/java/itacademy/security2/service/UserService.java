package itacademy.security2.service;

import itacademy.security2.entity.Role;
import itacademy.security2.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    User getUser(String username);

    List<User> getUsers();

    void setStatus(String username,  String status);
}
