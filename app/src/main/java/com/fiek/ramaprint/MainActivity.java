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
    private Button buttonPrint;
    private Button buttonReklam;
    private Button buttonLocationn;
    private Button buttonContact;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonWeb = (Button) findViewById(R.id.buttonWeb);
        buttonDesign = (Button) findViewById(R.id.buttonDesign);
        buttonPrint = (Button) findViewById(R.id.buttonPrint);
        buttonReklam = (Button) findViewById(R.id.buttonReklam);
        buttonLocationn = (Button) findViewById(R.id.buttonLocationn);
        buttonContact = (Button) findViewById(R.id.buttonContact);



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

        buttonPrint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrint();
            }
        });

        buttonReklam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { openReklam();
            }
        });
        buttonLocationn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLocationn();
            }
        });
        buttonContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openContact();
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
        public void openPrint(){
            Intent intent = new Intent(this,Print.class);
            startActivity(intent);
    }
        public void openReklam(){
            Intent intent = new Intent(this,Reklam.class);
            startActivity(intent);
    }
    public void openLocationn(){
        Intent intent = new Intent(this,Locationn.class);
        startActivity(intent);
    }
    public void openContact(){
        Intent intent = new Intent(this,Contact.class);
        startActivity(intent);
    }


}
