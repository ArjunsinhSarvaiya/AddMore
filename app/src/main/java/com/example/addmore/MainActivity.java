package com.example.addmore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt;
    Button btn_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_submit=findViewById(R.id.btn_submit);
        edt=findViewById(R.id.edt);

        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edt.getText().toString().trim().equals("")){
                    edt.setError("Please Enter Number OF EditText");
                }else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("number",edt.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });
    }
}