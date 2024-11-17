package org.practice.drinkformood.service;

import org.practice.drinkformood.entities.Drink;

import java.util.List;
import java.util.Optional;

public interface DrinkService {
    Drink save(Drink drink);

    Drink update(Drink drink);

    void delete(Drink drink);

    void deleteById(Long id);

    Drink findById(Long id);

    Drink findByName(String name);

    List<Drink> findAll();
}
