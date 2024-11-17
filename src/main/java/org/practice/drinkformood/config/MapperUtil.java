package org.practice.drinkformood.config;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.practice.drinkformood.dto.DrinkComponentsDto;
import org.practice.drinkformood.dto.DrinkDto;
import org.practice.drinkformood.dto.UserDto;
import org.practice.drinkformood.entities.Drink;
import org.practice.drinkformood.entities.DrinkComponents;
import org.practice.drinkformood.entities.User;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperUtil {
    private final ModelMapper modelMapper;

    public UserDto convertToDto(User user) {
        return modelMapper.map(user, UserDto.class);
    }

    public User convertToEntity(UserDto userDto) {
        return modelMapper.map(userDto, User.class);
    }

    public DrinkDto convertToDto(Drink drink) {
        return modelMapper.map(drink, DrinkDto.class);
    }

    public Drink convertToEntity(DrinkDto drinkDto) {
        return modelMapper.map(drinkDto, Drink.class);
    }

    public DrinkComponentsDto convertToDto(DrinkComponents drinkComponents) {
        return modelMapper.map(drinkComponents, DrinkComponentsDto.class);
    }

    public DrinkComponents convertToEntity(DrinkComponentsDto drinkComponentsDto) {
        return modelMapper.map(drinkComponentsDto, DrinkComponents.class);
    }
}
