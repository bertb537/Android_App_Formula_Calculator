package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhysicsVelocity extends AppCompatActivity {

    // Initializing EditTexts to Pull
    private EditText pullDistance;
    private EditText pullTime;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_velocity);

        // Call Edit Texts to Calculate
        pullDistance = (EditText) findViewById(R.id.velocityDistanceEditText);
        pullTime = (EditText) findViewById(R.id.velocityTimeEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.velocityBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.velocityCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = Double.parseDouble(pullDistance.getText().toString()) /
                        Double.parseDouble(pullTime.getText().toString());
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        PhysicsVelocity.this, answer, "Velocity");
                startActivity(toAnswerScreen);
            }
        });
    }
}
