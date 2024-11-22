package org.practice.drinkformood.controller;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.config.MapperUtil;
import org.practice.drinkformood.dto.DrinkComponentsDto;
import org. practice.drinkformood.service.DrinkComponentsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/components")
@RequiredArgsConstructor
public class DrinkComponentsController {
private final DrinkComponentsService drinkComponentsService;
private final MapperUtil mapperUtil;

    @PostMapping("/save")
    public ResponseEntity<DrinkComponentsDto> save(@RequestBody DrinkComponentsDto drinkComponentsDto) {
        drinkComponentsService.register(drinkComponentsDto);
        return ResponseEntity.ok(drinkComponentsDto);
    }

    @PatchMapping("/update")
    public ResponseEntity<String> update(@RequestParam Long id) {
        drinkComponentsService.update(drinkComponentsService.findById(id));
        return ResponseEntity.ok("DrinkComponent with id " + id + " updated");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam Long id) {
        drinkComponentsService.deleteById(id);
        return ResponseEntity.ok("DrinkComponent with id " + id + " deleted");
    }

    @GetMapping
    public ResponseEntity<List<DrinkComponentsDto>> findAll() {
       List<DrinkComponentsDto> drinkComponentsDtos =  drinkComponentsService.findAll()
               .stream()
               .map(mapperUtil::convertToDto)
               .toList();
        return ResponseEntity.ok(drinkComponentsDtos);
    }
}
