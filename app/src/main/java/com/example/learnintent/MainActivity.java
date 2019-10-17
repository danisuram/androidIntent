package com.example.learnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pindahActivity(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void pindahActivitydgnData(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("NAMA", "Dani Surya Ramadhan");
        intent.putExtra("UMUR", 22);
        startActivity(intent);
    }

    public void pindahActivitydgnObj(View view) {
        Person person = new Person();
        person.setName("Dani Surya Ramadhan");
        person.setAge(23);
        person.setStatus("Mahasiswa");

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("PERSON", person);
        startActivity(intent);
    }

    public void pindahAplikasi(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:089999999999"));
        startActivity(intent);
    }
}
