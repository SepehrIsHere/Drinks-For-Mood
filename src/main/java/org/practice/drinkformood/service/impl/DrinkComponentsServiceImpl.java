package org.practice.drinkformood.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.entities.DrinkComponents;
import org.practice.drinkformood.exception.DrinkComponentNotFoundException;
import org.practice.drinkformood.exception.DrinkComponentsOperationException;
import org.practice.drinkformood.repository.DrinkComponentsRepository;
import org.practice.drinkformood.service.DrinkComponentsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class DrinkComponentsServiceImpl implements DrinkComponentsService {
    private final DrinkComponentsRepository drinkComponentsRepository;

    @Override
    public DrinkComponents save(DrinkComponents drinkComponents) {
        try {
            return drinkComponentsRepository.save(drinkComponents);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while trying to save DrinkComponent");
        }
    }

    @Override
    public DrinkComponents update(DrinkComponents drinkComponents) {
        try {
            return drinkComponentsRepository.save(drinkComponents);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while trying to save DrinkComponent");
        }
    }

    @Override
    public void delete(DrinkComponents drinkComponents) {
        try {
            drinkComponentsRepository.delete(drinkComponents);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while trying to save DrinkComponent");
        }
    }

    @Override
    public void deleteById(Long id) {
        try {
            drinkComponentsRepository.deleteById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while trying to delete DrinkComponent");
        }
    }

    @Override
    public DrinkComponents findById(Long id) {
        try {
            return drinkComponentsRepository.findById(id).orElseThrow(() -> new DrinkComponentNotFoundException("DrinkComponent Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while finding drink by id");
        }
    }

    @Override
    public DrinkComponents findByName(String drinkComponents) {
        try {
            return drinkComponentsRepository.findByName(drinkComponents).orElseThrow(() -> new DrinkComponentNotFoundException("DrinkComponent Not Found"));
        } catch (Exception e) {
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while finding drink by name");
        }
    }

    @Override
    public List<DrinkComponents> findAll() {
        try{
            return drinkComponentsRepository.findAll();
        }catch (Exception e){
            e.printStackTrace();
            throw new DrinkComponentsOperationException("An error occured while finding all drinks");
        }
    }
}
