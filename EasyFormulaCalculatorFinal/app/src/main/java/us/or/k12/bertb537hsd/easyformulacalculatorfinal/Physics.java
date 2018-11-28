package us.or.k12.bertb537hsd.easyformulacalculatorfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Physics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics);

        configurePhysicsBackbutton();
        configurePhysicsVelocitybutton();
        configurePhysicsMomentumbutton();
    }
    private void configurePhysicsBackbutton() {
        ImageButton backBtn = (ImageButton) findViewById(R.id.physicsBackImageButton);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    private void configurePhysicsVelocitybutton(){
        Button velocityBtn = (Button) findViewById(R.id.physicsVelocityButton);
        velocityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toVelocityInput = new Intent(Physics.this, PhysicsVelocity.class);
                startActivity(toVelocityInput);
            }
        });
    }
    private void configurePhysicsMomentumbutton(){
        Button MomentumBtn = (Button) findViewById(R.id.physicsMomentumButton);
        MomentumBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toMomentum = new Intent(Physics.this, PhysicsMomentum.class);
                startActivity(toMomentum);
            }
        });
    }
}
