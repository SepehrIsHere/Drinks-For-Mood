package org.practice.drinkformood.service.impl;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.entities.User;
import org.practice.drinkformood.exception.UserNotFoundException;
import org.practice.drinkformood.exception.UserOperationException;
import org.practice.drinkformood.repository.UserRepository;
import org.practice.drinkformood.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User save(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to save a user");
        }
    }

    @Override
    public User update(User user) {
        try {
            return userRepository.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to update a user");
        }
    }

    @Override
    public void delete(User user) {
        try {
            userRepository.delete(user);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to delete a user");
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to delete a user");
        }
    }

    @Override
    public User findById(Long id) {
        try {
            return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException("User Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to find a user");
        }
    }

    @Override
    public User findByEmail(String email) {
        try {
            return userRepository.findByEmail(email).orElseThrow(() -> new UserNotFoundException("User Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to find a user");
        }
    }

    @Override
    public List<User> findAll() {
        try {
            return userRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            throw new UserOperationException("An error occured while trying to find all users");
        }
    }
}
