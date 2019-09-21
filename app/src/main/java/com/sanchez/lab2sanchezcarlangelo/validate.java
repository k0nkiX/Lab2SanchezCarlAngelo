package com.sanchez.lab2sanchezcarlangelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class validate extends AppCompatActivity {
    EditText course1, course2, course3, course4, course5, course6, course7, course8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_validate);
    }

    public void validate(View v){
        SharedPreferences sp = getSharedPreferences("myData", MODE_PRIVATE);

        String CourseFirst = sp.getString("courseA", null);
        String CourseSecond = sp.getString("courseB", null);
        String CourseThird= sp.getString("courseC", null);
        String CourseFourth = sp.getString("courseD", null);
        String CourseFifth= sp.getString("courseE", null);
        String CourseSixth = sp.getString("courseF", null);
        String CourseSeventh = sp.getString("courseG", null);
        String CourseEight = sp.getString("courseH", null);

        if (user.equals(userSP) && pwd.equals(pwdSP)) {
            Toast.makeText(this,"User is valid", Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(this, "User is invalid", Toast.LENGTH_LONG).show();
        }


    }


    public void mainactivity(View view){
        Intent i = null;
        if (view.getId() == R.id.next) {
            i = new Intent(this, mainactivity().class);
            startActivity(i);

        }

}
