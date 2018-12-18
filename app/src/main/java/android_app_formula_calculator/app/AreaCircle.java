package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AreaCircle extends AppCompatActivity {

    private EditText pullRadius;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_circle);

        // Call Edit Texts to Calculate
        pullRadius = (EditText) findViewById(R.id.circleRadEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton() {
        ImageButton backBtn = (ImageButton) findViewById(R.id.circleBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.circleCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = 3.14 * (Double.parseDouble(pullRadius.getText().toString()) *
                        Double.parseDouble(pullRadius.getText().toString()));
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        AreaCircle.this, answer, "Area");
                startActivity(toAnswerScreen);
            }
        });
    }
}
