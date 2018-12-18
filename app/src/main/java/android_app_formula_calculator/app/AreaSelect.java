package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class AreaSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_select);

        configureBackbutton();
        configureAreaSquarebutton();
        configureAreaCirclebutton();
    }
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.areaBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void configureAreaSquarebutton() {
        Button squareBtn = (Button) findViewById(R.id.squareButton);
        squareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSquareInput = new Intent(AreaSelect.this, AreaSquare.class);
                startActivity(toSquareInput);
            }
        });
    }
    private void configureAreaCirclebutton() {
        Button squareBtn = (Button) findViewById(R.id.circleButton);
        squareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCircleInput = new Intent(AreaSelect.this, AreaCircle.class);
                startActivity(toCircleInput);
            }
        });
    }
}
