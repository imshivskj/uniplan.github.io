package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Student_activity_page extends AppCompatActivity {
    private Button Attendence,Classes,Notes,Events,More,Exams;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_activity_page);
        Attendence=findViewById(R.id.Attendence);
        Classes=findViewById(R.id.Classes);
        Notes=findViewById(R.id.Notes);
        Events=findViewById(R.id.Events);
        More=findViewById(R.id.More);
        Exams=findViewById(R.id.Exams);


        //Start Activity On clicking Button


        Attendence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Student_activity_page.this,Student_Attendence_page.class);
                startActivity(intent);
            }
        });
        Classes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student_activity_page.this, Student_Classes_page.class);
                startActivity(intent);
            }
        });
        Notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student_activity_page.this, Student_Notes_page.class);
                startActivity(intent);
            }
        });
        Exams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student_activity_page.this, Student_Exams_page.class);
                startActivity(intent);
            }
        });
        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student_activity_page.this, Student_Events_page.class);
                startActivity(intent);
            }
        });
        More.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Student_activity_page.this, Student_More_page.class);
                startActivity(intent);
            }
        });
    }
}