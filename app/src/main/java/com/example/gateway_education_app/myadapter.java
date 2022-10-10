package com.example.gateway_education_app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<storing_student_data,myadapter.myviewholder> {
    public myadapter(FirebaseRecyclerOptions<storing_student_data> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(myviewholder myviewholder, int i, storing_student_data storing_student_data) {

        myviewholder.name.setText(storing_student_data.getName());
        myviewholder.father_name.setText(storing_student_data.getFather_name());
        myviewholder.roll_no.setText(storing_student_data.getRoll_no());
        myviewholder.phone_no.setText(storing_student_data.getPhone_no());
        myviewholder.email.setText(storing_student_data.getEmail());

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list,parent,false);

        return  new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder{

       de.hdodenhof.circleimageview.CircleImageView img1;
       TextView name,father_name,roll_no,phone_no,email;

       public myviewholder(@NonNull View itemView) {
           super(itemView);
           name=itemView.findViewById(R.id.name);
           father_name=itemView.findViewById(R.id.father_name);
           roll_no=itemView.findViewById(R.id.roll_no);
           phone_no=itemView.findViewById(R.id.phone_no);
           email=itemView.findViewById(R.id.email);
           System.out.println("Fire>"+roll_no.getText());
       }
   }

}
