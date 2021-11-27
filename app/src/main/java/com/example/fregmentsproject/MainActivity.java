package com.example.fregmentsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements LeftFragInterface {
    public FragmentManager fragman;
    public FragmentTransaction fragtrans;
    public rightfragment rightfrag;
    public leftfragment leftfrag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {

            fragman = getSupportFragmentManager();
            fragtrans = fragman.beginTransaction();
            leftfrag = leftfragment.newInstance();
            rightfrag = rightfragment.newInstance();
            fragtrans.replace(R.id.framelayout1, leftfrag);
            fragtrans.replace(R.id.framelayout2, rightfrag);
            fragtrans.commitNow();
        }
    }

    @Override
    public void sendmassage(String massage) {
        rightfrag.setTextView(massage);

    }
}