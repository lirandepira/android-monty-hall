package fr.enseirb.gl.montyhall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openDoor1 (View view){
        Intent intent = new Intent(this, secondActivity.class);
        startActivity(intent);
    }

    public void openDoor2 (View view){
        Intent intent = new Intent(this, thirdActivity.class);
        startActivity(intent);
    }

    public void openDoor3 (View view){
        Intent intent = new Intent(this, fourthActivity.class);
        startActivity(intent);
    }

    public void about (View view){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://en.wikipedia.org/wiki/Monty_Hall_problem"));
        startActivity(i);
    }
}
