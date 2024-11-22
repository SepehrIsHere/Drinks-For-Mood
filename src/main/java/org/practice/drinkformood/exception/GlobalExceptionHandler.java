package org.practice.drinkformood.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(DrinkComponentsOperationException.class)
    public ResponseEntity<String> handleDrinkComponentsOperationException(DrinkComponentsOperationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(DrinkOperationException.class)
    public ResponseEntity<String> handleDrinkOperationException(DrinkOperationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(DrinkComponentNotFoundException.class)
    public ResponseEntity<String> handleDrinkComponentNotFoundException(DrinkComponentNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(DrinkNotFoundException.class)
    public ResponseEntity<String> handleDrinkNotFoundException(DrinkNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(SurveyOperationException.class)
    public ResponseEntity<String> handleSurveyOperationException(SurveyOperationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> handleUserNotFoundException(UserNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

    @ExceptionHandler(UserOperationException.class)
    public ResponseEntity<String> handleUserOperationException(UserOperationException e) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
    }
}
