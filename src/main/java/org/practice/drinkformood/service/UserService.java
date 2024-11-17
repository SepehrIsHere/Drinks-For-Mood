package org.practice.drinkformood.service;

import org.practice.drinkformood.entities.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save(User user);

    User update(User user);

    void delete(User user);

    void deleteById(Long id);

   User findById(Long id);

    User findByEmail(String email);

    List<User> findAll();
}
