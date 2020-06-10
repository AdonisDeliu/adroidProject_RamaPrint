package com.fiek.ramaprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonWeb;
    private Button buttonDesign;
    private Button buttonReklam;
    private Button buttonPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWeb = (Button) findViewById(R.id.buttonWeb);
        buttonDesign = (Button) findViewById(R.id.buttonDesign);
        buttonReklam = (Button) findViewById(R.id.buttonReklam);
        buttonPrint = (Button) findViewById(R.id.buttonPrint);


        buttonWeb.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                openWeb();
            }
        });

        buttonDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDesign();
            }
        });

        buttonReklam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openReklam();
            }
        });

        buttonPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrint();
            }
        });



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

}
