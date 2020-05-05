package com.example.h3procesualmeldmejiag.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.h3procesualmeldmejiag.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    private TextView ptxvNext;
    private ViewPager viewPager;
    private View view;
    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);

        _initialize();

        _addClickTextNext();

        return view;
    }
    public void _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_1,container, false);
    }
    public void _initialize(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        ptxvNext = view.findViewById(R.id.txvNext);
    }
    public void _addClickTextNext(){
        ptxvNext.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                viewPager.setCurrentItem(1);
            }
        });
    }
}
