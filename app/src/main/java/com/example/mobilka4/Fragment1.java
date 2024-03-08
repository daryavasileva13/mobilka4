package com.example.mobilka4;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment1 extends Fragment {
    private static final String TAG = "MyApp";
    private int defaultValue = 0;

    public Fragment1() {
        super(R.layout.fragment1);
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Toast.makeText(getContext(), "onCreateView", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onCreateView");

        return inflater.inflate(R.layout.fragment1, container, false);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        //Toast.makeText(getContext(), "onViewCreated", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onViewCreated");


        Button button1 = view.findViewById(R.id.button1);
        Button button2 = view.findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment2();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFragment3();
            }
        });

    }


    public void openFragment2() {
        Fragment nextFragment = new Fragment2();

        Bundle bundle = new Bundle();

        nextFragment.setArguments(bundle);

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, nextFragment)
                .commit();
    }
    public void openFragment3() {
        Fragment nextFragment = new Fragment3();

        Bundle bundle = new Bundle();

        nextFragment.setArguments(bundle);

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container_view, nextFragment)
                .commit();
    }



}