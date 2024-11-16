package org.practice.drinkformood.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@SuperBuilder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Drink extends BaseEntity {

    @Column(nullable = false,unique = true)
    private String name;

    @Column
    private Double cost;

    @OneToMany
    private List<DrinkComponents> drinkComponents;

    @Column(nullable = false)
    private String recipe;
}
