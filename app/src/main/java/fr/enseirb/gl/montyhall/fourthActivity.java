package fr.enseirb.gl.montyhall;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class fourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void switchChoice (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void keepChoice (View view){
        Intent intent = new Intent(this, fifthActivity.class);
        startActivity(intent);
    }
}
