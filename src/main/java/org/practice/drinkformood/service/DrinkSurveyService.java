package org.practice.drinkformood.service;

import org.practice.drinkformood.entities.enumerations.Mood;

import java.util.List;
import java.util.Map;

public interface DrinkSurveyService {
    List<Mood> findOutMood(Map<Mood,Integer> moodScore);
}
