package ru.gb.android_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultTextView;
    Button calculateResultButton;
    Button divisionOperationButton;
    Button multiplyOperationButton;
    Button subtractionOperationButton;
    Button additionOperationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}