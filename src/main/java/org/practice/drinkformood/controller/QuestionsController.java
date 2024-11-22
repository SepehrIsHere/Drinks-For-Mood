package org.practice.drinkformood.controller;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.service.DrinkSurveyService;
import org.practice.drinkformood.service.impl.QuestionsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/survey")
@RequiredArgsConstructor
public class QuestionsController {
    private final QuestionsService questionsService;
    private final DrinkSurveyService drinkSurveyService;

    
}
