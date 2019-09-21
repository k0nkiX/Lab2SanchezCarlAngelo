package com.sanchez.lab2sanchezcarlangelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ShareActionProvider;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        course1 = findViewById(R.id.course1);
        course2 = findViewById(R.id.course2);
        course3 = findViewById(R.id.course3);
        course4 = findViewById(R.id.course4);
        course5 = findViewById(R.id.course5);
        course6 = findViewById(R.id.course6);
        course7 = findViewById(R.id.course7);
        course8 = findViewById(R.id.course8);
    }

    public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit()
        String courseA = course1.getText().toString();
        String courseB = course2.getText().toString();
        String courseC = course3.getText().toString();
        String courseD = course4.getText().toString();
        String courseE = course5.getText().toString();
        String courseF = course6.getText().toString();
        String courseG = course7.getText().toString();
        String courseH = course8.getText().toString();
        editor.putString("courseA", courseA);
        editor.putString("courseB", courseB);
        editor.putString("courseC", courseC);
        editor.putString("courseD", courseD);
        editor.putString("courseE", courseE);
        editor.putString("courseF", courseF);
        editor.putString("courseG", courseG);
        editor.putString("courseH", courseH);
        editor.commit();
        Toast.makeText(this, "Courses Saved", Toast.LENGTH_LONG).show();


    }

    public void validate(View view){
        Intent i = null;
        if (view.getId() == R.id.next) {
            i = new Intent(this, validate.class);
            startActivity(i);

    }
}
