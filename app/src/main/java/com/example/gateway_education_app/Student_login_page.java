package com.example.gateway_education_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class Student_login_page extends AppCompatActivity {
    private EditText ename;
    private EditText epassword;
    private Button   elogin;


    private TextView Url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_login_page);
        ename=findViewById(R.id.student_login_id);
        epassword= findViewById(R.id.student_password);
        elogin= findViewById(R.id.student_login_button);

        Url=findViewById(R.id.url);

        elogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input_name=ename.getText().toString();
                String input_password=epassword.getText().toString();
                if (input_name.isEmpty()){
                    ename.setError("This field must be filled");
                    if (input_password.isEmpty()){
                        epassword.setError("This field must be filled");

                    }
                }
                final String input_name_data=ename.getText().toString();
                final String input_password_data=epassword.getText().toString();

                FirebaseDatabase firebaseDatabase=FirebaseDatabase.getInstance();
                DatabaseReference databaseReference=FirebaseDatabase.getInstance().getReference("datauser");
                Query check_roll_no= databaseReference.orderByChild("roll_no").equalTo(input_name_data);
                check_roll_no.addListenerForSingleValueEvent(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {

                        if (snapshot.exists()){
                            ename.setError(null);
                            String check_password=snapshot.child(input_name_data).child("password").getValue(String.class);
                            if (check_password.equals(input_password_data)){
                                epassword.setError(null);
                                Toast.makeText(getApplicationContext(),"Login Successfully",Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(Student_login_page.this,Student_activity_page.class);
                                startActivity(intent);
                                finish();
                            }
                            else {
                                epassword.setError("Wrong Password");
                            }
                        }
                        else {
                            ename.setError("Username Does Not Exist");
                        }

                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });

            }
        });
        Url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotourl("https://gateway.edu.in/");
            }
        });


    }
    private void gotourl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }


    }