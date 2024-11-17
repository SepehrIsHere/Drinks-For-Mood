package org.practice.drinkformood.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.practice.drinkformood.entities.enumerations.Mood;

@Getter
@Setter
public record UserDto(String firstName, String lastName, String email, String password, Mood latestMood) {
}
