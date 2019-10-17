package com.example.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvResult = findViewById(R.id.textView2);

        if(getIntent().getStringExtra("NAMA") !=null){
            Intent intent = getIntent();
            String nama = intent.getStringExtra("NAMA");
            int umur = intent.getIntExtra("UMUR",12);

            tvResult.setText(nama+"\n"+umur);
        }

        if(getIntent().getParcelableExtra("PERSON") != null){
            Person person = getIntent().getParcelableExtra("PERSON");
            String nama = person.getName();
            int umur = person.getAge();
            String status = person.getStatus();

            tvResult.setText(nama + "\n" + umur +"\n"+status);
        }


    }
}
