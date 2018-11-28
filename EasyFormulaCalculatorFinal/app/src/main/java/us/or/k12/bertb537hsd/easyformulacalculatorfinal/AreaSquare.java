package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AreaSquare extends AppCompatActivity {

    // Initializing EditTexts to Pull
    private EditText pullLength;
    private EditText pullWidth;
    private Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_square);

        // Call Edit Texts to Calculate
        pullLength = (EditText) findViewById(R.id.squareLenEditText);
        pullWidth = (EditText) findViewById(R.id.squareWidEditText);

        // Activity Interface
        configureBackbutton();
        configureCalculatebutton();
    }
    // Go Back
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.squareBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    // Make Calculation and Go to Calculate Screen
    private void configureCalculatebutton(){
        Button calcBtn = (Button) findViewById(R.id.squareCalculatebutton);
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Make Calculation
                Double calculation = Double.parseDouble(pullLength.getText().toString()) *
                        Double.parseDouble(pullWidth.getText().toString());
                answer = calculation;

                // Sending the answer, category (AREA of this SQUARE, VELOCITY, Z-SCORE)
                Intent toAnswerScreen = AnswerScreen.pullAnswer(
                        AreaSquare.this, answer, "Area");
                startActivity(toAnswerScreen);
            }
        });
    }
}
