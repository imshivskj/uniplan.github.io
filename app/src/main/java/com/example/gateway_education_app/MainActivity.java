package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button faculty_button,student_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        faculty_button=findViewById(R.id.faculty_button);
        student_button=findViewById(R.id.student_button);
        student_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Student_login_page.class);
                startActivity(intent);
            }

        });faculty_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Teachers_loginpage.class);
                startActivity(intent);
            }
        });
    }

}