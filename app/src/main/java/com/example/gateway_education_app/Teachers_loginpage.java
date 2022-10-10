package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Teachers_loginpage extends AppCompatActivity {
    private EditText teacher_id,teacher_password;
    private Button teacher_login_button;
    private TextView url;
    private String Teacher_username="Teacher";
    private String Teacher_password="123";
    boolean isvalid=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_loginpage);
        teacher_id=findViewById(R.id.student_login_id);
        teacher_password=findViewById(R.id.student_password);
        url=findViewById(R.id.url);
        teacher_login_button=findViewById(R.id.student_login_button);
        teacher_login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String teacher_input_id=teacher_id.getText().toString();
                String teacher_input_password=teacher_password.getText().toString();
                isvalid=validate(teacher_input_id,teacher_input_password);
                if (!isvalid){
                    Toast.makeText(Teachers_loginpage.this, "Wrong Username or Password", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent=new Intent(Teachers_loginpage.this,Teacher_activity_page.class);
                    startActivity(intent);
                }
            }
        });url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://gateway.edu.in/");
            }

            private void gotourl(String s) {
                Uri uri= Uri.parse(s);
                startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });



    }private boolean validate(String name,String password) {
        if (name.equals(Teacher_username) && password.equals(Teacher_password)) {
            return true;
        }
        return false;
    }
}