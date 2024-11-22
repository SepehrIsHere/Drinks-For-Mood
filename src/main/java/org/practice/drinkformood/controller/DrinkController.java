package org.practice.drinkformood.controller;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.config.MapperUtil;
import org.practice.drinkformood.dto.DrinkDto;
import org.practice.drinkformood.service.DrinkService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/drink")
@RequiredArgsConstructor
public class DrinkController {
    private final DrinkService drinkService;
    private final MapperUtil mapperUtil;

    @PostMapping("/save")
    public ResponseEntity<DrinkDto> save(@RequestBody DrinkDto drinkDto) {
        drinkService.register(drinkDto);
        return ResponseEntity.ok(drinkDto);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam Long id) {
        drinkService.deleteById(id);
        return ResponseEntity.ok("Deleted drink with id " + id);
    }

    @PatchMapping("/update")
    public ResponseEntity<String> update(@RequestParam Long id) {
        drinkService.update(drinkService.findById(id));
        return ResponseEntity.ok("Updated drink with id " + id);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<DrinkDto>> getAll() {
        List<DrinkDto> drinkDtos = drinkService.findAll()
                .stream()
                .map(mapperUtil::convertToDto)
                .toList();
        return ResponseEntity.ok(drinkDtos);
    }
}
