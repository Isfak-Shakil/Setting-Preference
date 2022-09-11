package com.example.settingpreference;

import androidx.appcompat.app.AppCompatActivity;
import android.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction=getFragmentManager().beginTransaction();
        Pref_Frag pref_frag=new Pref_Frag();
        fragmentTransaction.replace(android.R.id.content,pref_frag);
        fragmentTransaction.commit();
    }
}