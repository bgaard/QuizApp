package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void checkAnswers(View v) {
        // Local integer to track the number of correct answers (resetting to 0 every time submit-button is pressed)
        int numberOfCorrectAnswers = 0;


        // Lets check question 1 for now:
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.question_1_radio_group);
        int selectedID1 = questionOne.getCheckedRadioButtonId();
        Log.v("Selected ID: ",String.valueOf(selectedID1));

        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.question_1_radio_group);
        int selectedID2 = questionOne.getCheckedRadioButtonId();
        Log.v("Selected ID: ",String.valueOf(selectedID2));


        // Calling the toast, to display number of correct answers
        displayToast(numberOfCorrectAnswers);
    }

    /**
     * Displays the number of correct answers the user has.
     */
    private void displayToast(int numberOfCorrectAnswers) {
        // Show number of correct answers when the submit-button is clicked.
        Context context = getApplicationContext();
        CharSequence text = getString(R.string.number_of_correct_answers, String.valueOf(numberOfCorrectAnswers));
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
