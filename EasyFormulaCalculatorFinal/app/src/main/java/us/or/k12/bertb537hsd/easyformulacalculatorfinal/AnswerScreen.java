package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class AnswerScreen extends AppCompatActivity {

    private static final String EXTRA_ANSWER = "us.or.k12.bertb537hsd.easyformulacalculatorfinal - the answer";
    public static final String EXTRA_CATEGORY = "us.or.k12.bertb537hsd.easyformulacalculatorfinal - the category";

    // Saving Answer and Category Variables
    private Double answer;
    private String category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_screen);

        // Extracting Data From Intent
        extractAnswerFromIntent();

        // Create Answer Text
        configureAnswerScreenBackbutton();
        configureNewFormulabutton();
        createPretext();
        createAnswer();
    }
    private void configureAnswerScreenBackbutton() {
        Button backBtn = (Button) findViewById(R.id.answerScreenBackButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void configureNewFormulabutton(){
        Button startOverBtn = (Button) findViewById(R.id.answerScreenStartOverButton);
        startOverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCategorySelect = new Intent(AnswerScreen.this, ContentSelect1.class);
                startActivity(toCategorySelect);
            }
        });
    }

    // Switching from Area Square Screen to Answer Screen with the Answer
    public static Intent pullAnswer(Context context, Double answer, String category) {
        Intent fromCurrentScreen = new Intent(context, AnswerScreen.class);
        fromCurrentScreen.putExtra(EXTRA_ANSWER, answer);
        fromCurrentScreen.putExtra(EXTRA_CATEGORY, category);
        return fromCurrentScreen;
    }
    private void extractAnswerFromIntent() {
        Intent extractAnswer = getIntent();
        answer = extractAnswer.getDoubleExtra(EXTRA_ANSWER, 0);
        category = extractAnswer.getStringExtra(EXTRA_CATEGORY);
    }
    private void createPretext(){
        EditText preTxt = (EditText) findViewById(R.id.pretextEditText);
        preTxt.setText("The " + category + " is ");
    }
    private void createAnswer(){
        EditText answerTxt = (EditText) findViewById(R.id.answerEditText);
        answerTxt.setText(answer.toString());
    }
}
