package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class teacher_student_edit_page extends AppCompatActivity {
    private Button Add_student_button,show_student;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_student_edit_page);

        //ADD STUDENT PAGE
        Add_student_button=findViewById(R.id.Add_student_button);
        show_student=findViewById(R.id.show_student);
        Add_student_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(teacher_student_edit_page.this,Teacher_Add_student_page.class);
                startActivity(intent);
            }
        });
        // SHOW STUDENT PAGE//
        show_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(teacher_student_edit_page.this,Teacher_show_student_list.class);
                startActivity(intent);
            }
        });

    }
}