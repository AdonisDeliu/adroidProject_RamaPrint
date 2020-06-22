package com.fiek.ramaprint;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonWeb = findViewById(R.id.buttonWeb);
        Button buttonDesign = findViewById(R.id.buttonDesign);
        Button buttonReklam = findViewById(R.id.buttonReklam);
        Button buttonPrint = findViewById(R.id.buttonPrint);
        Button buttonKontakt = findViewById(R.id.buttonKontakt);
        Button buttonLokacioni = findViewById(R.id.buttonLokacioni);




        buttonWeb.setOnClickListener(v -> openWeb());

        buttonDesign.setOnClickListener(v -> openDesign());

        buttonReklam.setOnClickListener(v -> openReklam());

        buttonPrint.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Kliko mbi foto per me shume info!", Toast.LENGTH_LONG).show();
            openPrint();
        });

        buttonKontakt.setOnClickListener(v -> openKontakt());

        buttonLokacioni.setOnClickListener(v -> openLokacioni());


        
    }


    public void openWeb(){
            Intent intent = new Intent(this,Web.class);
            startActivity(intent);
    }
    public void openDesign(){
        Intent intent = new Intent(this,Design.class);
        startActivity(intent);
    }
    public void openReklam(){
        Intent intent = new Intent(this,Reklam.class);
        startActivity(intent);
    }
    public void openPrint(){
        Intent intent = new Intent(this,Print.class);
        startActivity(intent);
    }
    public void openKontakt(){
        Intent intent = new Intent(this,Kontakt.class);
        startActivity(intent);
    }
    public void openLokacioni(){
        Intent intent = new Intent(this,lokacioni.class);
        startActivity(intent);
    }

}
