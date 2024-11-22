package org.practice.drinkformood.service.impl;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.entities.enumerations.Mood;
import org.practice.drinkformood.exception.SurveyOperationException;
import org.practice.drinkformood.service.DrinkService;
import org.practice.drinkformood.service.DrinkSurveyService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class DrinkSurveyServiceImpl implements DrinkSurveyService {
    private final DrinkService drinkService;
    private final QuestionsService questionsService;
    private final Map<Mood, Integer> moodScore = new HashMap<>();

    @Override
    public List<Mood> findOutMood(Map<Mood, Integer> moodScore) {
        try {
            return moodScore.entrySet()
                    .stream()
                    .sorted(Map.Entry.<Mood, Integer>comparingByValue().reversed())
                    .limit(3)
                    .map(Map.Entry::getKey)
                    .toList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new SurveyOperationException("An error occured while trying to find out your mood");
        }
    }



}
