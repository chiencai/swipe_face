package com.example.kl.home.Adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.kl.home.Model.Class;
import com.example.kl.home.Model.RollCall;
import com.example.kl.home.R;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class RollCallAdapter extends RecyclerView.Adapter<RollCallAdapter.ViewHolder>{

    @NonNull

    private ClassListAdapter.transPageListener mTransPageListener;//adapter跳轉fragment
    public List<RollCall> StudentList;
    public Context context;



    public RollCallAdapter(Context context,List<RollCall> StudentList) {

        this.StudentList = StudentList;
        this.context =context;

    }


    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rollcall_item, parent, false);
        return new RollCallAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.rollcall_name.setText(StudentList.get(position).getStudent_name());
        holder.rollcall_id.setText(StudentList.get(position).getStudent_id());
        holder.rollcall_school.setText(StudentList.get(position).getStudent_school());
        holder.rollcall_department.setText(StudentList.get(position).getStudent_department());
        holder.rollcall_email.setText(StudentList.get(position).getStudent_email());
        StorageReference gsReference = FirebaseStorage.getInstance().getReferenceFromUrl(StudentList.get(position).getImage_url());
        Glide.with(holder.rollcall_image.getContext())
                .load(gsReference)
                .into(holder.rollcall_image);

    }

    @Override
    public int getItemCount() {
        return StudentList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        View mView;
        public ImageView rollcall_image;
        public TextView rollcall_name;
        public TextView rollcall_id;
        public TextView rollcall_school;
        public TextView rollcall_department;
        public TextView rollcall_email;

        public ViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            rollcall_image = (ImageView) mView.findViewById(R.id.rollcall_image);
            rollcall_name = (TextView) mView.findViewById(R.id.rollcall_name);
            rollcall_id = (TextView) mView.findViewById(R.id.rollcall_id);
            rollcall_school = (TextView) mView.findViewById(R.id.rollcall_school);
            rollcall_department = (TextView) mView.findViewById(R.id.rollcall_department);
            rollcall_email = (TextView) mView.findViewById(R.id.rollcall_email);

        }

    }






}


