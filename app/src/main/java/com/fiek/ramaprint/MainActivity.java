package com.fiek.ramaprint;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextTo = findViewById(R.id.edit_text_to);
        mEditTextSubject = findViewById(R.id.edit_text_subject);
        mEditTextMessage = findViewById(R.id.edit_text_message);
//        Button buttonSend = findViewById(R.id.button_send);
        Button buttonWeb = findViewById(R.id.buttonWeb);
        Button buttonDesign = findViewById(R.id.buttonDesign);
        Button buttonReklam = findViewById(R.id.buttonReklam);
        Button buttonPrint = findViewById(R.id.buttonPrint);
        Button buttonKontakt = findViewById(R.id.buttonKontakt);
        Button buttonLokacion = findViewById(R.id.buttonLokacion);




        buttonWeb.setOnClickListener(v -> openWeb());

        buttonDesign.setOnClickListener(v -> openDesign());

        buttonReklam.setOnClickListener(v -> openReklam());

        buttonPrint.setOnClickListener(v -> {
            Toast.makeText(getApplicationContext(), "Kliko mbi foto per me shume info!", Toast.LENGTH_LONG).show();
            openPrint();
        });

        buttonKontakt.setOnClickListener(v -> openKontakt());

        buttonLokacion.setOnClickListener(v -> openLokacion());

//        buttonSend.setOnClickListener(v -> sendMail());
    }

//    private void sendMail() {
//        String recipientList = mEditTextTo.getText().toString();
//        String [] recipients = recipientList.split( ",");
//
//        String subject = mEditTextSubject.getText().toString();
//        String message = mEditTextMessage.getText().toString();
//
//        Intent intent = new Intent (Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
//        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
//        intent.putExtra(Intent.EXTRA_TEXT, message);
//
//        intent.setType ("message/rfc822");
//        startActivity(Intent.createChooser(intent, "Zgjidh nje email client"));
//    }

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
    public void openLokacion(){
        Intent intent = new Intent(this,Lokacion.class);
        startActivity(intent);
    }
}
