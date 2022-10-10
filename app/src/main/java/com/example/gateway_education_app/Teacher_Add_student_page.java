package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Teacher_Add_student_page extends AppCompatActivity {
    EditText student_roll_no,student_name,student_father_name,student_phone_no,student_email_id,student_password;
    Button add_student_button;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_add_student_page);
        student_roll_no=findViewById(R.id.student_roll_no);
        student_name=findViewById(R.id.student_name);
        student_father_name=findViewById(R.id.student_Father_name);
        student_email_id=findViewById(R.id.Student_email_id);
        student_phone_no=findViewById(R.id.Student_phone_no);
        student_password=findViewById(R.id.Student_password);
        add_student_button=findViewById(R.id.Add_student_button);


        //add student to database with the the add student button
        //1. first we take the input as a string.
        add_student_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String student_name_=student_name.getText().toString();
                String student_email_id_=student_email_id.getText().toString();
                String student_father_name_=student_father_name.getText().toString();
                String student_phone_no_=student_phone_no.getText().toString();
                String student_password_=student_password.getText().toString();
                String student_roll_no_=student_roll_no.getText().toString();


                if (!student_name_.isEmpty()){
                    student_name.setError(null);
                    if (!student_father_name_.isEmpty()){
                        student_father_name.setError(null);
                        if (!student_email_id_.isEmpty()){
                            student_email_id.setError(null);
                            if (!student_phone_no_.isEmpty()){
                                student_phone_no.setError(null);
                                if (!student_password_.isEmpty()){
                                    student_password.setError(null);
                                    if(!student_roll_no_.isEmpty()){
                                        student_roll_no.setError(null);


                                        //now we add firebase to the code

                                        //set path for send data to the database
                                        firebaseDatabase= FirebaseDatabase.getInstance();
                                        reference=firebaseDatabase.getReference("datauser");


                                        //create new variable which store value for the database


                                        String student_name_s=student_name.getText().toString();
                                        String student_email_id_s=student_email_id.getText().toString();
                                        String student_father_name_s=student_father_name.getText().toString();
                                        String student_phone_no_s=student_phone_no.getText().toString();
                                        String student_password_s=student_password.getText().toString();
                                        String student_roll_no_s=student_roll_no.getText().toString();

                                        //create a variable

                                        storing_student_data storing_student_data=new storing_student_data(student_name_s,student_father_name_s,student_email_id_s,student_phone_no_s,student_password_s,student_roll_no_s);

                                        reference.child(student_roll_no_s).setValue(storing_student_data);

                                        //give message that student added successfully//

                                        Toast.makeText(getApplicationContext(), "Student add to class successfully", Toast.LENGTH_SHORT).show();

                                        //go to student edit page //

                                        Intent intent=new Intent(getApplicationContext(),teacher_student_edit_page.class);
                                        startActivity(intent);
                                        finish();




                                    }
                                    else {
                                        student_roll_no.setError("Please fill the default password");
                                    }
                                }
                                else {
                                    student_password.setError("Please fill the credentials");

                                }
                            }
                            else {
                                student_phone_no.setError("Please fill the credentials");
                            }
                        }
                        else{
                            student_email_id.setError("Please fill the credentials");

                        }
                    }
                    else {
                        student_father_name.setError("Please fill the credentials");

                    }

                }
                else {
                    student_name.setError("Please fill the credentials");
                }


            }
        });


    }
}