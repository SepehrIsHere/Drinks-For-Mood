package org.practice.drinkformood.service.impl;

import lombok.RequiredArgsConstructor;
import org.practice.drinkformood.entities.enumerations.Mood;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class QuestionsService {
    protected void assignScoreForEnergyQuestions(String question, String answer, Map<Mood, Integer> moodScore) {
        switch (question) {
            case "How energetic do you feel right now\n1.Low Energy\n2.Netrual\n3.High eneryg":
                if (answer.equalsIgnoreCase("Low Energy")) {
                    addPoints(moodScore, Mood.SAD, 2);
                    addPoints(moodScore, Mood.DEPRESSED, 2);
                } else if (answer.equalsIgnoreCase("Netrual")) {
                    addPoints(moodScore, Mood.CHILL, 1);
                } else if (answer.equalsIgnoreCase("High Energy")) {
                    addPoints(moodScore, Mood.HAPPY, 2);
                    addPoints(moodScore, Mood.ANGRY, 2);
                }
                break;
            case "What have you been doing recently ?\nRelaxing\nWorking\nExercising\nSocializing":
                if (answer.equalsIgnoreCase("Relaxing")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                    addPoints(moodScore, Mood.DRUNK, 2);
                } else if (answer.equalsIgnoreCase("Cold")) {
                    addPoints(moodScore, Mood.TIRED, 2);
                    addPoints(moodScore, Mood.EXHAUSTED, 2);
                } else if (answer.equalsIgnoreCase("Exercising")) {
                    addPoints(moodScore, Mood.TIRED, 3);
                } else if (answer.equalsIgnoreCase("Socializing")) {
                    addPoints(moodScore, Mood.HAPPY, 2);
                    addPoints(moodScore, Mood.TIRED, 2);
                }
                break;
            case "Do you feel like you need a pick-me-up?":
                if (answer.equalsIgnoreCase("Yes")) {
                    addPoints(moodScore, Mood.SAD, 2);
                    addPoints(moodScore, Mood.DEPRESSED, 2);
                } else if (answer.equalsIgnoreCase("No")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                    addPoints(moodScore, Mood.DRUNK, 2);
                }
                break;
        }
    }

    protected void assignScoreForEmotionalQuestions(String question, String answer, Map<Mood, Integer> moodScore) {
        switch (question) {
            case "How would you describe your current mood?\nHappy\nCalm\nStressed\nSad\nExcited\nNeutral":
                if (answer.equalsIgnoreCase("Happy")) {
                    addPoints(moodScore, Mood.HAPPY, 2);
                } else if (answer.equalsIgnoreCase("Calm")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                } else if (answer.equalsIgnoreCase("Stressed")) {
                    addPoints(moodScore, Mood.PISSED, 3);
                    addPoints(moodScore, Mood.ANGRY, 2);
                } else if (answer.equalsIgnoreCase("Sad")) {
                    addPoints(moodScore, Mood.SAD, 3);
                    addPoints(moodScore, Mood.DEPRESSED, 2);
                } else if (answer.equalsIgnoreCase("Excited")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 1);
                } else if (answer.equalsIgnoreCase("Neutral")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                }
                break;
            case "Do you feel like celebrating or unwinding?":
                if (answer.equalsIgnoreCase("Celebrating")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 2);
                } else if (answer.equalsIgnoreCase("Unwinding")) {
                    addPoints(moodScore, Mood.CHILL, 3);
                    addPoints(moodScore, Mood.SAD, 1);
                }
                break;
            case "What’s your current state of mind?\nFocused\nDreamy\nRestless\nPeaceful":
                if (answer.equalsIgnoreCase("Focused")) {
                    addPoints(moodScore, Mood.FOCUSED, 2);
                    addPoints(moodScore, Mood.CHILL, 1);
                } else if (answer.equalsIgnoreCase("Dreamy")) {
                    addPoints(moodScore, Mood.CHILL, 3);
                    addPoints(moodScore, Mood.HAPPY, 1);
                } else if (answer.equalsIgnoreCase("Restless")) {
                    addPoints(moodScore, Mood.TIRED, 3);
                } else if (answer.equalsIgnoreCase("Peaceful")) {
                    addPoints(moodScore, Mood.CHILL, 3);
                    addPoints(moodScore, Mood.HAPPY, 2);
                }
                break;
        }
    }

    protected void assignScoreForSocialQuestions(String question, String answer, Map<Mood, Integer> moodScore) {
        switch (question) {
            case "Are you having this drink alone or with others?":
                if (answer.equalsIgnoreCase("Alone")) {
                    addPoints(moodScore, Mood.SAD, 3);
                    addPoints(moodScore, Mood.CHILL, 2);
                } else if (answer.equalsIgnoreCase("With others")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 2);
                }
                break;
            case "Would you prefer a quiet moment or something to energize a gathering?":
                if (answer.equalsIgnoreCase("Quiet")) {
                    addPoints(moodScore, Mood.SAD, 2);
                    addPoints(moodScore, Mood.CHILL, 3);
                } else if (answer.equalsIgnoreCase("Something")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 2);
                }
                break;
            case "Is this drink for a special occasion?":
                if (answer.equalsIgnoreCase("Yes")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 3);
                } else if (answer.equalsIgnoreCase("No")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                    addPoints(moodScore, Mood.SAD, 3);
                }
                break;
        }
    }

    protected void assignScoreForTasteQuestions(String question, String answer, Map<Mood, Integer> moodScore) {
        switch (question) {
            case "Which taste appeals to you most right now?\nSweet\nSour\nBitter\nSavory\nFruity\nCreamy":
                if (answer.equalsIgnoreCase("Sweet")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.CHILL, 2);
                } else if (answer.equalsIgnoreCase("Sour")) {
                    addPoints(moodScore, Mood.PISSED, 3);
                    addPoints(moodScore, Mood.ANGRY, 2);
                } else if (answer.equalsIgnoreCase("Bitter")) {
                    addPoints(moodScore, Mood.SAD, 2);
                    addPoints(moodScore, Mood.DEPRESSED, 3);
                } else if (answer.equalsIgnoreCase("Savory")) {
                    addPoints(moodScore, Mood.DRUNK, 3);
                    addPoints(moodScore, Mood.CHILL, 2);
                } else if (answer.equalsIgnoreCase("Fruity")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 1);
                } else if (answer.equalsIgnoreCase("Creamy")) {
                    addPoints(moodScore, Mood.CHILL, 2);
                    addPoints(moodScore, Mood.SAD, 3);
                }
                break;
            case "Do you want a drink that’s familiar or adventurous?":
                if (answer.equalsIgnoreCase("Familiar")) {
                    addPoints(moodScore, Mood.SAD, 2);
                    addPoints(moodScore, Mood.CHILL, 3);
                } else if (answer.equalsIgnoreCase("Adventurous")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.DRUNK, 2);
                }
                break;
            case "Would you enjoy a drink that’s refreshing or indulgent?":
                if (answer.equalsIgnoreCase("Refreshing")) {
                    addPoints(moodScore, Mood.HAPPY, 3);
                    addPoints(moodScore, Mood.CHILL, 2);
                } else if (answer.equalsIgnoreCase("Indulgent")) {
                    addPoints(moodScore, Mood.SAD, 3);
                    addPoints(moodScore, Mood.DRUNK, 2);
                }
        }
    }

    private void addPoints(Map<Mood, Integer> moodScore, Mood mood, int points) {
        moodScore.put(mood, points);
    }
}
