package org.practice.drinkformood.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.practice.drinkformood.entities.enumerations.Category;

import java.time.LocalDateTime;
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

    @Column
    private String totalCalorie;

    @Enumerated(EnumType.STRING)
    private Category category;

    @PrePersist
    protected void onCreate() {
        if(totalCalorie == null || totalCalorie.isEmpty()) {
            for(DrinkComponents component : drinkComponents) {
                totalCalorie += component.getCalorie();
            }
        }
    }
}
