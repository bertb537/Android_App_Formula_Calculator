package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class ZScore extends AppCompatActivity {

    // Initializing EditTexts to Pull
    private EditText pullSampleMean;
    private EditText pullPopMean;
    private EditText pullSD;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zscore);

        // Call Edit Texts to Calculate
        pullSampleMean = (EditText) findViewById(R.id.sampleMeanEditText);
        pullPopMean = (EditText) findViewById(R.id.popMeanEditText);
        pullSD = (EditText) findViewById(R.id.statsSDEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton() {
        ImageButton backBtn = (ImageButton) findViewById(R.id.zScoreBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton() {
        Button calcBtn = (Button) findViewById(R.id.zScoreCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = (Double.parseDouble(pullSampleMean.getText().toString()) -
                        Double.parseDouble(pullPopMean.getText().toString())) /
                        Double.parseDouble(pullSD.getText().toString());
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        ZScore.this, answer, "Z-Score");
                startActivity(toAnswerScreen);
            }
        });
    }
}
