package hiber.service;

import hiber.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> createUsers();

    public User takeCar(String model, int series);
}