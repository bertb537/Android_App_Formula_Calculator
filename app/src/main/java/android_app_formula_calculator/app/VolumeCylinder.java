package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class VolumeCylinder extends AppCompatActivity {
    // Initializing EditTexts to Pull
    private EditText pullRadius;
    private EditText pullHeight;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_cylinder);

        // Call Edit Texts to Calculate
        pullRadius = (EditText) findViewById(R.id.cylinderRadEditText);
        pullHeight = (EditText) findViewById(R.id.cylinderHeightEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.cylinderBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.cylinderCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = (Double.parseDouble(pullRadius.getText().toString()) *
                        Double.parseDouble(pullRadius.getText().toString())) *
                        Double.parseDouble(pullHeight.getText().toString()) *
                        (3.14);
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        VolumeCylinder.this, answer, "Volume");
                startActivity(toAnswerScreen);
            }
        });
    }
}
