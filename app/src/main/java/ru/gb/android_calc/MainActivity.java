package ru.gb.android_calc;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    public static final String RESULT_KEY = "result_key";
    public static final String RECREATING_CONFIGURATION_KEY = "RECREATING_CONFIGURATION_KEY";
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
    Button openSecondActivity;
    private CalculatedResult calculatedResult = new CalculatedResult();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = findViewById(R.id.result_text_view);

        digitZero = findViewById(R.id.digit_zero_button);
        digitZero.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "0"));

        digitOne = findViewById(R.id.digit_one_button);
        digitOne.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "1"));

        digitTwo = findViewById(R.id.digit_two_button);
        digitTwo.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "2"));

        digitThree = findViewById(R.id.digit_three_button);
        digitThree.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "3"));

        digitFour = findViewById(R.id.digit_four_button);
        digitFour.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "4"));

        digitFive = findViewById(R.id.digit_five_button);
        digitFive.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "5"));

        digitSix = findViewById(R.id.digit_six_button);
        digitSix.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "6"));

        digitSeven = findViewById(R.id.digit_seven_button);
        digitSeven.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "7"));

        digitEight = findViewById(R.id.digit_eight_button);
        digitEight.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "8"));

        digitNine = findViewById(R.id.digit_nine_button);
        digitNine.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "9"));

        symbolDecimalPoint = findViewById(R.id.decimal_point_button);
        symbolDecimalPoint.setOnClickListener(view -> resultTextView.setText(resultTextView.getText() + "."));

        clearTextView = findViewById(R.id.clear_button);
        clearTextView.setOnClickListener(view -> resultTextView.setText(""));

        openSecondActivity = findViewById(R.id.open_second_activity_button);
        openSecondActivity.setOnClickListener(view -> openSecondActivity());
    }

    private void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        convertTextViewValueToDouble();
        intent.putExtra(RESULT_KEY, calculatedResult);
        startActivity(intent);
    }

    private void convertTextViewValueToDouble() {
        try {
            String rawValue = resultTextView.getText().toString();
            double value = Double.parseDouble(rawValue);
            calculatedResult.setCalculatedResult(value);
        } catch (Exception e) {
            Log.e("MainActivity", e.toString());
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle instanceState) {
        super.onSaveInstanceState(instanceState);
        convertTextViewValueToDouble();
        instanceState.putParcelable(RECREATING_CONFIGURATION_KEY, calculatedResult);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        calculatedResult = savedInstanceState.getParcelable(RECREATING_CONFIGURATION_KEY);
        resultTextView.setText(String.valueOf(calculatedResult.getCalculatedResult()));
    }
}
