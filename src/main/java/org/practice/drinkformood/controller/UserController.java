package org.practice.drinkformood.controller;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.config.MapperUtil;
import org.practice.drinkformood.dto.UserDto;
import org.practice.drinkformood.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final MapperUtil mapperUtil;

    @PostMapping("/add")
    public ResponseEntity<UserDto> register(@RequestBody UserDto userDto) {
        userService.register(userDto);
        return ResponseEntity.ok(userDto);
    }

    @PostMapping("/me/{email}")
    public ResponseEntity<UserDto> me(@PathVariable String email) {
        UserDto userDto = mapperUtil.convertToDto(userService.findByEmail(email));
        return ResponseEntity.ok(userDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteUser(@RequestParam Long userId) {
        userService.deleteById(userId);
        return ResponseEntity.ok("Delete user with id  " + userId);
    }

    @PatchMapping("/update")
    public ResponseEntity<String> updateUser(@RequestBody UserDto userDto) {
        userService.update(mapperUtil.convertToEntity(userDto));
        return ResponseEntity.ok("update user with " + userDto.getFirstName() + userDto.getLastName());
    }

    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return userService.findAll()
                .stream()
                .map(mapperUtil::convertToDto)
                .toList();
    }
}
