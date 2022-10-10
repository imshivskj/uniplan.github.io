package com.example.gateway_education_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class Teacher_show_student_list extends AppCompatActivity {

    RecyclerView recview;
    myadapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techer_show_student_list);

        recview=(RecyclerView) findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<storing_student_data> options = new FirebaseRecyclerOptions.Builder<storing_student_data>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("datauser"), storing_student_data.class)
                        .build();

        adapter=new myadapter(options);
        recview.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }


}