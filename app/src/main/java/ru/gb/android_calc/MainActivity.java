package ru.gb.android_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    public static final String RESULT_KEY = "result_key";
    TextView resultTextView;
    Button calculateResultButton;
    Button divisionOperationButton;
    Button multiplyOperationButton;
    Button subtractionOperationButton;
    Button additionOperationButton;
    Button digitZero;
    Button digitOne;
    Button digitTwo;
    Button digitThree;
    Button digitFour;
    Button digitFive;
    Button digitSix;
    Button digitSeven;
    Button digitEight;
    Button digitNine;
    Button symbolDecimalPoint;
    Button backspace;
    Button clearTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_text_view);

        digitZero = findViewById(R.id.digit_zero_button);
        digitZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "0");
            }
        });

        digitOne = findViewById(R.id.digit_one_button);
        digitOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "1");
            }
        });

        digitTwo = findViewById(R.id.digit_two_button);
        digitTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "2");
            }
        });

        digitThree = findViewById(R.id.digit_three_button);
        digitThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "3");
            }
        });

        digitFour = findViewById(R.id.digit_four_button);
        digitFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "4");
            }
        });

        digitFive = findViewById(R.id.digit_five_button);
        digitFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "5");
            }
        });

        digitSix = findViewById(R.id.digit_six_button);
        digitSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "6");
            }
        });

        digitSeven = findViewById(R.id.digit_seven_button);
        digitSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "7");
            }
        });

        digitEight = findViewById(R.id.digit_eight_button);
        digitEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "8");
            }
        });

        digitNine = findViewById(R.id.digit_nine_button);
        digitNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + "9");
            }
        });

        symbolDecimalPoint = findViewById(R.id.decimal_point_button);
        symbolDecimalPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText(resultTextView.getText() + ".");
            }
        });

        clearTextView = findViewById(R.id.clear_button);
        clearTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultTextView.setText("");
            }
        });

    }

}

