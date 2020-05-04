package com.example.h3examensomemeldmejiag.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.h3examensomemeldmejiag.Activities.CalculadoraBasicaActivity;
import com.example.h3examensomemeldmejiag.Activities.CalculadoraCientificaActivity;
import com.example.h3examensomemeldmejiag.Activities.CalculadoraCustomActivity;
import com.example.h3examensomemeldmejiag.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment3 extends Fragment implements View.OnClickListener{
    private TextView textPrev;
    private ViewPager viewPager;
    private View view;
    private Button btnselect1, btnselect2, btnselect3, btndesc1, btndesc2,btndesc3, btningresar;
    private EditText petxSelectApp, petxUsername;
    public Fragment3() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        _initializeInflater(inflater, container);
        _initializeVariables();
        return  view;
    }
    private void  _initializeInflater(LayoutInflater inflater, ViewGroup container){
        view = inflater.inflate(R.layout.fragment_3, container, false);
    }
    private void _initializeVariables(){
        viewPager = getActivity().findViewById(R.id.viewPagerContainer);
        btnselect1 = view.findViewById(R.id.btnSelectBasica);
        btnselect1.setOnClickListener(this);
        btnselect2 = view.findViewById(R.id.btnSelectCientifica);
        btnselect2.setOnClickListener(this);
        btnselect3 = view.findViewById(R.id.btnSelectCustom);
        btnselect3.setOnClickListener(this);
        petxSelectApp = view.findViewById(R.id.etxSelectApp);
        petxSelectApp.setOnClickListener(this);
        petxUsername = view.findViewById(R.id.etxUsername);
        petxUsername.setOnClickListener(this);
        btndesc1 = view.findViewById(R.id.btnDescBasica);
        btndesc1.setOnClickListener(this);
        btndesc2 = view.findViewById(R.id.btnDescCientifica);
        btndesc2.setOnClickListener(this);
        btndesc3 = view.findViewById(R.id.btnDescCustom);
        btndesc3.setOnClickListener(this);
        btningresar = view.findViewById(R.id.btnIngresar);
        btningresar.setOnClickListener(this);
    }
    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnDescBasica:
                Toast.makeText(getActivity(), "Esta es una calculadora Basica", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDescCientifica:
                Toast.makeText(getActivity(), "Esta es una calculadora Cientifica", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnDescCustom:
                Toast.makeText(getActivity(), "Esta es una calculadora Custom", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnSelectBasica:
                petxSelectApp.setText("basica");
                break;
            case R.id.btnSelectCientifica:
                petxSelectApp.setText("cientifica");
                break;
            case R.id.btnSelectCustom:
                petxSelectApp.setText("custom");
                break;
            case R.id.btnIngresar:
                String selectapp_string = petxSelectApp.getText().toString();
                String username_string = petxUsername.getText().toString();
                if (selectapp_string.equals("") || username_string.equals("")) {
                    Toast.makeText(getActivity(), "Please add selectapp/username", Toast.LENGTH_SHORT).show();
                } else switch (selectapp_string) {
                    case ("cientifica"):
                        Intent intent1 = new Intent(getActivity(), CalculadoraBasicaActivity.class);
                        intent1.putExtra("USERNAME", username_string);
                        intent1.putExtra("SELECTAPP", selectapp_string);
                        startActivity(intent1);
                        getActivity().finish();
                        break;
                    case ("basica"):
                        Intent intent = new Intent(getActivity(), CalculadoraCientificaActivity.class);
                        intent.putExtra("USERNAME", username_string);
                        intent.putExtra("SELECTAPP", selectapp_string);
                        startActivity(intent);
                        getActivity().finish();
                        break;
                    case ("custom"):
                        Intent intent3 = new Intent(getActivity(), CalculadoraCustomActivity.class);
                        intent3.putExtra("USERNAME", username_string);
                        intent3.putExtra("SELECTAPP", selectapp_string);
                        startActivity(intent3);
                        getActivity().finish();
                        break;
                }
        }
    }
}
