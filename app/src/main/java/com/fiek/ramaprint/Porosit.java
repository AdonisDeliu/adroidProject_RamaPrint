package com.fiek.ramaprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Porosit extends AppCompatActivity {

    EditText t1,t2,t3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_porosit);

        t1=(EditText)findViewById(R.id.t1);
        t2=(EditText)findViewById(R.id.t2);
        t3=(EditText)findViewById(R.id.t3);

        Button buttonVlereso = findViewById(R.id.buttonVlereso);
        buttonVlereso.setOnClickListener(v -> openVlereso());
    }

        public void addRecord (View view)
        {
            DbManager db=new DbManager(this);

            String res=db.addRecord(t1.getText().toString(), t2.getText().toString(),t3.getText().toString());

            Toast.makeText(this,res,Toast.LENGTH_LONG).show();

            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    public void openVlereso(){
        Intent intent = new Intent(this, Vleresimi.class);
        startActivity(intent);
    }


}
