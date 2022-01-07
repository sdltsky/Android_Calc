package ru.gb.android_calc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class SecondActivity extends AppCompatActivity {

    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        resultTextView = findViewById(R.id.second_activity_text_view);

        CalculatedResult calculatedResult = getIntent().getParcelableExtra(MainActivity.RESULT_KEY);
        resultTextView.setText("" + calculatedResult.getCalculatedResult());

    }

}

