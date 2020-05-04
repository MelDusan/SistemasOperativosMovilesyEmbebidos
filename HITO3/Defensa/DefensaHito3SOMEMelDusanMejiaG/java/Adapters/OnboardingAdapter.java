package com.example.h3examensomemeldmejiag.Adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.h3examensomemeldmejiag.Fragments.Fragment1;
import com.example.h3examensomemeldmejiag.Fragments.Fragment2;
import com.example.h3examensomemeldmejiag.Fragments.Fragment3;
import com.example.h3examensomemeldmejiag.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OnboardingAdapter extends FragmentPagerAdapter {
    public  OnboardingAdapter(FragmentManager fm){
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment3();

            default:
                return null;
        }
    }


    @Override
    public int getCount() {
        return 3;
    }
}
