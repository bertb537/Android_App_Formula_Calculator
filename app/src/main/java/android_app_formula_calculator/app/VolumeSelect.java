package android_app_formula_calculator.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class VolumeSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_select);

        configureBackbutton();
        configureVolumeConeButton();
        configureVolumeCylinderbutton();
    }
    private void configureBackbutton(){
        ImageButton backBtn = (ImageButton) findViewById(R.id.volumeBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void configureVolumeConeButton() {
        Button coneBtn = (Button) findViewById(R.id.coneButton);
        coneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toConeVolume = new Intent(VolumeSelect.this, VolumeCone.class);
                startActivity(toConeVolume);
            }
        });
    }
    private void configureVolumeCylinderbutton(){
        Button volumeCylinderBtn = (Button) findViewById(R.id.cylinderButton);
        volumeCylinderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toCylinder = new Intent(VolumeSelect.this, VolumeCylinder.class);
                startActivity(toCylinder);
            }
        });
    }
}
