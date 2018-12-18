package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ContentSelect1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_select1);

        configureAreatbutton();
        configureVolumebutton();
        configurePhysicsbutton();
        configureStatsbutton();
    }
    private void configureAreatbutton(){
        Button areaBtn = (Button) findViewById(R.id.areaButton);
        areaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Launch Area Button
                Intent toArea = new Intent(ContentSelect1.this, AreaSelect.class);
                startActivity(toArea);
            }
        });
    }
    private void configureVolumebutton(){
        Button volumeBtn = (Button) findViewById(R.id.volumeButton);
        volumeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toVolume = new Intent(ContentSelect1.this, VolumeSelect.class);
                startActivity(toVolume);
            }
        });
    }
    private void configurePhysicsbutton(){
        Button physicsBtn = (Button) findViewById(R.id.physicsButton);
        physicsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPhysics = new Intent(ContentSelect1.this, Physics.class);
                startActivity(toPhysics);
            }
        });
    }
    private void configureStatsbutton(){
        Button statsBtn = (Button) findViewById(R.id.statisticsButton);
        statsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toStats = new Intent(ContentSelect1.this, StatsFormulaSelect.class);
                startActivity(toStats);
            }
        });
    }
}


