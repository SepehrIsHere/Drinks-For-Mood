package org.practice.drinkformood.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.practice.drinkformood.entities.enumerations.Mood;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
