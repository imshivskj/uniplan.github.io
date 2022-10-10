package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Teacher_activity_page extends AppCompatActivity {
    private Button student_page_for_teacher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_activity_page);
        student_page_for_teacher=findViewById(R.id.student_information_for_teacher);
        student_page_for_teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Teacher_activity_page.this,teacher_student_edit_page.class);
                startActivity(intent);
            }
        });
    }
}