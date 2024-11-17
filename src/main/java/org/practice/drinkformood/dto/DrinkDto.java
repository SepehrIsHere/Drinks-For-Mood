package org.practice.drinkformood.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public record DrinkDto(String name, List<DrinkComponentsDto> drinkComponentsDtoList,String description) {
}
