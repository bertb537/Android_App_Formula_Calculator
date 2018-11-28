package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class StatsFormulaSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats_formula_select);

        configureBackbutton();
        configureZScorebutton();
        configureIQRbutton();
    }
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.statsBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void configureZScorebutton(){
        Button zScoreBtn = (Button) findViewById(R.id.statsZScoreButton);
        zScoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toZScore = new Intent(StatsFormulaSelect.this, ZScore.class);
                startActivity(toZScore);
            }
        });
    }
    private void configureIQRbutton() {
        Button iqrBtn = (Button) findViewById(R.id.iqrButton);
        iqrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toIQR = new Intent(StatsFormulaSelect.this, StatsIQR.class);
                startActivity(toIQR);
            }
        });
    }
}
