package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class StatsIQR extends AppCompatActivity {

    // Initializing EditTexts to Pull
    private EditText pullQ1;
    private EditText pullQ3;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_iqr);

        // Call Edit Texts to Calculate
        pullQ1 = (EditText) findViewById(R.id.firstQuartileEditText);
        pullQ3 = (EditText) findViewById(R.id.thirdQuartileEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.iqrBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.iqrCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = Double.parseDouble(pullQ3.getText().toString()) -
                        Double.parseDouble(pullQ1.getText().toString());
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        StatsIQR.this, answer, "IQR");
                startActivity(toAnswerScreen);
            }
        });
    }
}
