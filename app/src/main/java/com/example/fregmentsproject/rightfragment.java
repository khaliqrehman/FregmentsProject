package com.example.fregmentsproject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class rightfragment extends Fragment {

private TextView textView;

    public rightfragment() {
        // Required empty public constructor
    }


    public static rightfragment newInstance() {
        rightfragment fragment = new rightfragment();

        return fragment;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_rightfragment, container, false);
        textView=view.findViewById(R.id.textview);
        return view;
    }

    public void setTextView(String massage) {
        textView.setText(massage);
    }
}