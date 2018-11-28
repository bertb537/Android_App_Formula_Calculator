package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class PhysicsMomentum extends AppCompatActivity {

    // Initializing EditTexts to Pull
    private EditText pullMass;
    private EditText pullVelocity;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_momentum);

        // Call Edit Texts to Calculate
        pullMass = (EditText) findViewById(R.id.physicsMassEditText);
        pullVelocity = (EditText) findViewById(R.id.physicsVelocityEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.momentumBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.momentumCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = Double.parseDouble(pullMass.getText().toString()) *
                        Double.parseDouble(pullVelocity.getText().toString());
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        PhysicsMomentum.this, answer, "Momentum");
                startActivity(toAnswerScreen);
            }
        });
    }
}
