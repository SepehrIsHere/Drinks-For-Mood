package org.practice.drinkformood.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkComponentsDto {
    private String name;
    private String description;
    private double calorie;
}
