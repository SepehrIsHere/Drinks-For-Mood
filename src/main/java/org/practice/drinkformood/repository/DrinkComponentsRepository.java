package org.practice.drinkformood.repository;

import org.practice.drinkformood.entities.DrinkComponents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrinkComponentsRepository extends JpaRepository<DrinkComponents, Long> {
    @Query("SELECT d FROM DrinkComponents d WHERE d.name = :name")
    Optional<DrinkComponents> findByName(String name);
}
