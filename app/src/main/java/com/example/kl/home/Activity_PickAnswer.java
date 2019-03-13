package com.example.kl.home;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Activity_PickAnswer extends AppCompatActivity  {

    private String classId;
    private Button btn_pa_random_pick , btn_pa_low_attendence , btn_pa_low_interaction;

    private FragmentManager fragmentManager;
    private FragmentTransaction transaction;
    private String TAG = "PickAnswer";
    OnFragmentSelectedListener mCallback;//Fragment傳值

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pick_answer);


        Intent Intent = getIntent(); /* 取得傳入的 Intent 物件 */
        Bundle bundle = Intent.getExtras();
        classId = bundle.getString("classId");
        Toast.makeText(Activity_PickAnswer.this, "Now : " + classId,
                Toast.LENGTH_SHORT).show();
        Log.d(TAG,"Now:" +classId );
        btn_pa_random_pick = (Button) findViewById(R.id.btn_pa_random_pick);
        btn_pa_low_attendence = (Button) findViewById(R.id.btn_pa_low_attendence);
        btn_pa_low_interaction = (Button) findViewById(R.id.btn_pa_low_interaction);

        btn_pa_random_pick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_PickAnswerDetail fragment_pickAnswerDetail = new Fragment_PickAnswerDetail();
                Bundle args = new Bundle();
                args.putString("classId", classId);
                args.putString("type" , "0");
                fragment_pickAnswerDetail.setArguments(args);
                Log.d(TAG, " btn_pa_random_pick:"+classId);
                getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container_pick ,fragment_pickAnswerDetail).commit();
            }
        });


        btn_pa_low_attendence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_PickAnswerDetail fragment_pickAnswerDetail = new Fragment_PickAnswerDetail();
                Bundle args = new Bundle();
                args.putString("classId", classId);
                args.putString("type" , "1");
                fragment_pickAnswerDetail.setArguments(args);
                Log.d(TAG, " btn_pa_random_pick:"+classId);
                getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container_pick ,fragment_pickAnswerDetail).commit();
            }
        });



        btn_pa_low_interaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment_PickAnswerDetail fragment_pickAnswerDetail = new Fragment_PickAnswerDetail();
                Bundle args = new Bundle();
                args.putString("classId", classId);
                args.putString("type" , "2");
                fragment_pickAnswerDetail.setArguments(args);
                Log.d(TAG, " btn_pa_random_pick:"+classId);
                getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.container_pick ,fragment_pickAnswerDetail).commit();
            }
        });



    }


}
