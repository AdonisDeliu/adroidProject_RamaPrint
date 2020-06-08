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
//    private Button buttonLocationn;
//    private Button buttonContactt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWeb = (Button) findViewById(R.id.buttonWeb);
        buttonDesign = (Button) findViewById(R.id.buttonDesign);
        buttonReklam = (Button) findViewById(R.id.buttonReklam);
        buttonPrint = (Button) findViewById(R.id.buttonPrint);
//        buttonLocationn = (Button) findViewById(R.id.buttonLocationn);
//        buttonContactt = (Button) findViewById(R.id.buttonContactt);




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


//        buttonLocationn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openLocationn();
//            }
//        });
//
//        buttonContactt.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openContactt();
//            }
//        });


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
//    public void openLocationn(){
//        Intent intent = new Intent(this,Locationn.class);
//        startActivity(intent);
//    }
//    public void openContactt(){
//        Intent intent = new Intent(this,Contactt.class);
//        startActivity(intent);
//    }
}
