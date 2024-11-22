package org.practice.drinkformood.dto;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DrinkDto {
    private String name;
    private List<DrinkComponentsDto> drinkComponentsDtoList;
    private String recipe;
}
