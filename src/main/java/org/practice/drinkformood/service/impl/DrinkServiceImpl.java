package org.practice.drinkformood.service.impl;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.entities.Drink;
import org.practice.drinkformood.exception.DrinkNotFoundException;
import org.practice.drinkformood.exception.DrinkOperationException;
import org.practice.drinkformood.repository.DrinkRepository;
import org.practice.drinkformood.service.DrinkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DrinkServiceImpl implements DrinkService {
    private final DrinkRepository drinkRepository;

    @Override
    public Drink save(Drink drink) {
        try {
            return drinkRepository.save(drink);

        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while saving drink");
        }
    }

    @Override
    public Drink update(Drink drink) {
        try {
            return drinkRepository.save(drink);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while updating drink");
        }
    }

    @Override
    public void delete(Drink drink) {
        try {
            drinkRepository.delete(drink);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while deleting drink");
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            drinkRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while deleting drink");
        }
    }

    @Override
    public Drink findById(Long id) {
        try {
            return drinkRepository.findById(id).orElseThrow(() -> new DrinkNotFoundException("Drink Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while finding drink");
        }
    }

    @Override
    public Drink findByName(String name) {
        try {
            return drinkRepository.findByName(name).orElseThrow(() -> new DrinkNotFoundException("Drink Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while finding drink");
        }
    }

    @Override
    public List<Drink> findAll() {
        try{
            return drinkRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            throw new DrinkOperationException("An error occured while finding drink");
        }
    }
}
