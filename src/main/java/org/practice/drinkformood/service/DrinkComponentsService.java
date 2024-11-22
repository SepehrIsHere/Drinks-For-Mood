package org.practice.drinkformood.service;

import org.practice.drinkformood.dto.DrinkComponentsDto;
import org.practice.drinkformood.entities.DrinkComponents;

import java.util.List;

public interface DrinkComponentsService {
    DrinkComponents save(DrinkComponents drinkComponents);

    DrinkComponents update(DrinkComponents drinkComponents);

    void delete(DrinkComponents drinkComponents);

    void deleteById(Long id);

    DrinkComponents findById(Long id);

    DrinkComponents findByName(String drinkComponents);

    List<DrinkComponents> findAll();

    DrinkComponents register(DrinkComponentsDto drinkComponentsDto);
}
