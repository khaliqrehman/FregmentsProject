package com.example.fregmentsproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class leftfragment extends Fragment {
private Button button1 ,button2;
private LeftFragInterface leftFragInterface;



    public leftfragment() {
        // Required empty public constructor
    }




    public static leftfragment newInstance() {
        leftfragment fragment = new leftfragment();

        return fragment;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        leftFragInterface=(LeftFragInterface) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_leftfragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button1= view.findViewById(R.id.button1);
        button2= view.findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              leftFragInterface.sendmassage("Zabi ghat kony, Ufffff zalima kona da warsara");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                leftFragInterface.sendmassage("Lala deer kha kas dai khu bass......");
            }
        });
    }
}