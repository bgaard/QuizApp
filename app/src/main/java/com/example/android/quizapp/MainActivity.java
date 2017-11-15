package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public void checkAnswers(View v) {
        // Local integer to track the number of correct answers (resetting to 0 every time submit-button is pressed)
        int numberOfCorrectAnswers = 0;

        // Starting with all the RadioGroups
        // Question 1: RadioButton
        RadioGroup question_1 = (RadioGroup) findViewById(R.id.question_1_radio_group);
        int selectedID1 = question_1.getCheckedRadioButtonId();
        RadioButton radioButton1 = (RadioButton) findViewById(selectedID1);
        String answer_1 = "";
        if (radioButton1 != null) {
            answer_1 = String.valueOf(radioButton1.getText());
        }

        // Question 2: RadioButton
        RadioGroup question_2 = (RadioGroup) findViewById(R.id.question_2_radio_group);
        int selectedID2 = question_2.getCheckedRadioButtonId();
        RadioButton radioButton2 = (RadioButton) findViewById(selectedID2);
        String answer_2 = "";
        if (radioButton2 != null) {
            answer_2 = String.valueOf(radioButton2.getText());
        }

        // Question 3: RadioButton
        RadioGroup question_3 = (RadioGroup) findViewById(R.id.question_3_radio_group);
        int selectedID3 = question_3.getCheckedRadioButtonId();
        RadioButton radioButton3 = (RadioButton) findViewById(selectedID3);
        String answer_3 = "";
        if (radioButton3 != null) {
            answer_3 = String.valueOf(radioButton3.getText());
        }

        // Question 4: RadioButton
        RadioGroup question_4 = (RadioGroup) findViewById(R.id.question_4_radio_group);
        int selectedID4 = question_4.getCheckedRadioButtonId();
        RadioButton radioButton4 = (RadioButton) findViewById(selectedID4);
        String answer_4 = "";
        if (radioButton4 != null) {
            answer_4 = String.valueOf(radioButton4.getText());
        }

        // Question 6: RadioButton
        RadioGroup question_6 = (RadioGroup) findViewById(R.id.question_6_radio_group);
        int selectedID6 = question_6.getCheckedRadioButtonId();
        RadioButton radioButton6 = (RadioButton) findViewById(selectedID6);
        String answer_6 = "";
        if (radioButton6 != null) {
            answer_6 = String.valueOf(radioButton6.getText());
        }

        // Question 7: RadioButton
        RadioGroup question_7 = (RadioGroup) findViewById(R.id.question_7_radio_group);
        int selectedID7 = question_7.getCheckedRadioButtonId();
        RadioButton radioButton7 = (RadioButton) findViewById(selectedID7);
        String answer_7 = "";
        if (radioButton7 != null) {
            answer_7 = String.valueOf(radioButton7.getText());
        }

        // Checking all the check-box questions
        // Question 5: CheckBoxes
        CheckBox CheckBox_Question_5_1 = (CheckBox) findViewById(R.id.question_5_option_1);
        List<String> answers_5 = new ArrayList<String>();
        if (CheckBox_Question_5_1.isChecked()) {
            answers_5.add(String.valueOf(CheckBox_Question_5_1.getText()));
        }

        CheckBox CheckBox_Question_5_2 = (CheckBox) findViewById(R.id.question_5_option_2);
        if (CheckBox_Question_5_2.isChecked()) {
            answers_5.add(String.valueOf(CheckBox_Question_5_2.getText()));
        }

        CheckBox CheckBox_Question_5_3 = (CheckBox) findViewById(R.id.question_5_option_3);
        if (CheckBox_Question_5_3.isChecked()) {
            answers_5.add(String.valueOf(CheckBox_Question_5_3.getText()));
        }

        CheckBox CheckBox_Question_5_4 = (CheckBox) findViewById(R.id.question_5_option_4);
        if (CheckBox_Question_5_4.isChecked()) {
            answers_5.add(String.valueOf(CheckBox_Question_5_4.getText()));
        }

        // Sorting the list
        Collections.sort(answers_5);

        // Question 8: CheckBoxes
        CheckBox CheckBox_Question_8_1 = (CheckBox) findViewById(R.id.question_8_option_1);
        List<String> answers_8 = new ArrayList<String>();
        if (CheckBox_Question_8_1.isChecked()) {
            answers_8.add(String.valueOf(CheckBox_Question_8_1.getText()));
        }

        CheckBox CheckBox_Question_8_2 = (CheckBox) findViewById(R.id.question_8_option_2);
        if (CheckBox_Question_8_2.isChecked()) {
            answers_8.add(String.valueOf(CheckBox_Question_8_2.getText()));
        }

        CheckBox CheckBox_Question_8_3 = (CheckBox) findViewById(R.id.question_8_option_3);
        if (CheckBox_Question_8_3.isChecked()) {
            answers_8.add(String.valueOf(CheckBox_Question_8_3.getText()));
        }

        CheckBox CheckBox_Question_8_4 = (CheckBox) findViewById(R.id.question_8_option_4);
        if (CheckBox_Question_8_4.isChecked()) {
            answers_8.add(String.valueOf(CheckBox_Question_8_4.getText()));
        }

        // Sorting the list
        Collections.sort(answers_8);

        // Question 9: CheckBoxes
        CheckBox CheckBox_Question_9_1 = (CheckBox) findViewById(R.id.question_9_option_1);
        List<String> answers_9 = new ArrayList<String>();
        if (CheckBox_Question_9_1.isChecked()) {
            answers_9.add(String.valueOf(CheckBox_Question_9_1.getText()));
        }

        CheckBox CheckBox_Question_9_2 = (CheckBox) findViewById(R.id.question_9_option_2);
        if (CheckBox_Question_9_2.isChecked()) {
            answers_9.add(String.valueOf(CheckBox_Question_9_2.getText()));
        }

        CheckBox CheckBox_Question_9_3 = (CheckBox) findViewById(R.id.question_9_option_3);
        if (CheckBox_Question_9_3.isChecked()) {
            answers_9.add(String.valueOf(CheckBox_Question_9_3.getText()));
        }

        CheckBox CheckBox_Question_9_4 = (CheckBox) findViewById(R.id.question_9_option_4);
        if (CheckBox_Question_9_4.isChecked()) {
            answers_9.add(String.valueOf(CheckBox_Question_9_4.getText()));
        }

        // Sorting the list
        Collections.sort(answers_9);

        // Answers from EditText views
        // Question 10: EditText
        EditText EditText_Question_10 = (EditText) findViewById(R.id.question_10_option_1);
        String answer_10 = EditText_Question_10.getText().toString();

        // Generating Answers:
        String correctAnswer_1 = getString(R.string.correct_answer_one);
        String correctAnswer_2 = getString(R.string.correct_answer_two);
        String correctAnswer_3 = getString(R.string.correct_answer_three);
        String correctAnswer_4 = getString(R.string.correct_answer_four);

        List<String> correctAnswer_5 = new ArrayList<String>();
        correctAnswer_5.add(getString(R.string.correct_answer_five_one));
        correctAnswer_5.add(getString(R.string.correct_answer_five_two));
        correctAnswer_5.add(getString(R.string.correct_answer_five_three));
        Collections.sort(correctAnswer_5);

        String correctAnswer_6 = getString(R.string.correct_answer_six);
        String correctAnswer_7 = getString(R.string.correct_answer_seven);

        List<String> correctAnswer_8 = new ArrayList<String>();
        correctAnswer_8.add(getString(R.string.correct_answer_eight_one));
        correctAnswer_8.add(getString(R.string.correct_answer_eight_two));
        Collections.sort(correctAnswer_8);

        List<String> correctAnswer_9 = new ArrayList<String>();
        correctAnswer_9.add(getString(R.string.correct_answer_nine_one));
        correctAnswer_9.add(getString(R.string.correct_answer_nine_two));
        correctAnswer_9.add(getString(R.string.correct_answer_nine_three));
        Collections.sort(correctAnswer_9);

        String correctAnswer_10 = getString(R.string.correct_answer_ten);

        // Checking question 1
        if (answer_1.equals(correctAnswer_1)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 2
        if (answer_2.equals(correctAnswer_2)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 3
        if (answer_3.equals(correctAnswer_3)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 4
        if (answer_4.equals(correctAnswer_4)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 5
        if (answers_5.equals(correctAnswer_5)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 6
        if (answer_6.equals(correctAnswer_6)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 7
        if (answer_7.equals(correctAnswer_7)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 8
        if (answers_8.equals(correctAnswer_8)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 9
        if (answers_9.equals(correctAnswer_9)) {
            numberOfCorrectAnswers++;
        }

        // Checking question 10
        if (answer_10.equals(correctAnswer_10)) {
            numberOfCorrectAnswers++;
        }

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

    private String checkRadioButton(int a) {
        // NOT WORKING :-/
        String id_pass = "R.id.question_" + String.valueOf(a) + "_radio_group";
        int id = this.getResources().getIdentifier(id_pass, "id", getPackageName());

        RadioGroup question = (RadioGroup) findViewById(id);
        int selectedID = question.getCheckedRadioButtonId();
        RadioButton radioButton = (RadioButton) findViewById(selectedID);
        String answer = "";
        if (radioButton != null) {
            answer = String.valueOf(radioButton.getText());
        }
        return answer;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
