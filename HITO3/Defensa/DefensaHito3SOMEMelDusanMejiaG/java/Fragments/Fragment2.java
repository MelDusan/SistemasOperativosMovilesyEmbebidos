package com.example.h3examensomemeldmejiag.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.h3examensomemeldmejiag.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    private TextView ptxvNext, ptxvSkip;
    private ViewPager viewPager;
    private View view;
    public Fragment2() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _inicialize();
        //add click event to text Next and prev text
        _addClickNextAndPrev();
        //return
        return view;
    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_2, container, false);
    }

    public void _inicialize(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        ptxvNext = view.findViewById(R.id.txvNext);
        ptxvSkip =  view.findViewById(R.id.txvSkip);
    }
    public void _addClickNextAndPrev(){
        ptxvNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }});
        ptxvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
    }
}
