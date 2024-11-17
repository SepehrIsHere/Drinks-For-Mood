package org.practice.drinkformood.repository;

import jakarta.validation.constraints.NotNull;
import org.practice.drinkformood.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    @Query("SELECT d FROM Drink d WHERE d.name = :name")
    Optional<Drink> findByName(@Param("name") String name);

}
