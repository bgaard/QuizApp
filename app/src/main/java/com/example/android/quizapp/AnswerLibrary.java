package com.example.android.quizapp;

import android.content.res.Resources;

/**
 * NOT USED (FOR NOW)!
 */

public class AnswerLibrary {
    private String correctAnswers[][] = {
            {Resources.getSystem().getString(R.string.correct_answer_one)},
            {Resources.getSystem().getString(R.string.correct_answer_two)},
            {Resources.getSystem().getString(R.string.correct_answer_three)},
            {Resources.getSystem().getString(R.string.correct_answer_four)},
            {Resources.getSystem().getString(R.string.correct_answer_five_one), Resources.getSystem().getString(R.string.correct_answer_five_two), Resources.getSystem().getString(R.string.correct_answer_five_three)},
            {Resources.getSystem().getString(R.string.correct_answer_six)},
            {Resources.getSystem().getString(R.string.correct_answer_seven)},
            {Resources.getSystem().getString(R.string.correct_answer_eight_one), Resources.getSystem().getString(R.string.correct_answer_eight_two)},
            {Resources.getSystem().getString(R.string.correct_answer_nine_one), Resources.getSystem().getString(R.string.correct_answer_nine_two), Resources.getSystem().getString(R.string.correct_answer_nine_three)},
            {Resources.getSystem().getString(R.string.correct_answer_ten)},
    };

    private String correctAnswersLong[] = {
            Resources.getSystem().getString(R.string.correct_answer_one_long),
            Resources.getSystem().getString(R.string.correct_answer_two_long),
            Resources.getSystem().getString(R.string.correct_answer_three_long),
            Resources.getSystem().getString(R.string.correct_answer_four_long),
            Resources.getSystem().getString(R.string.correct_answer_five_long),
            Resources.getSystem().getString(R.string.correct_answer_six_long),
            Resources.getSystem().getString(R.string.correct_answer_seven_long),
            Resources.getSystem().getString(R.string.correct_answer_eight_long),
            Resources.getSystem().getString(R.string.correct_answer_nine_long),
            Resources.getSystem().getString(R.string.correct_answer_ten_long)
    };

    public String[] getCorrectAnswer (int a) {
        String[] correctAnswer = correctAnswers[a];
        return correctAnswer;
    }

    public String getLongAnswer (int a) {
        String longAnswer = correctAnswersLong[a];
        return longAnswer;
    }
}
