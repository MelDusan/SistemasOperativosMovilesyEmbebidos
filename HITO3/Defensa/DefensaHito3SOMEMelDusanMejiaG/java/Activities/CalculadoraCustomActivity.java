package com.example.h3examensomemeldmejiag.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.h3examensomemeldmejiag.R;

public class CalculadoraCustomActivity extends AppCompatActivity implements View.OnClickListener{
    public double numeros[]=new double[21], resultado, num, anterior, aux;
    public Button cero, uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, fibo;
    public Boolean decimal=false,parentesis=false,rest=false,sum=false,div=false,multi=false,pot=false, raiz=false,tange=false,cos=false,seno=false,pocen=false, factorial=false;
    public TextView display, ptxvusername, ptxvseleccion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_custom);
        initializeComponents();
    }
    private  void initializeComponents(){
        display=findViewById(R.id.txvResultado);
        //Mis button del 1 al 10 ids
        cero= findViewById(R.id.btn0);
        cero.setOnClickListener(this);
        uno=findViewById(R.id.btn1);
        uno.setOnClickListener(this);
        dos=(Button) findViewById(R.id.btn2);
        dos.setOnClickListener(this);
        tres=(Button) findViewById(R.id.btn3);
        tres.setOnClickListener(this);
        cuatro=(Button) findViewById(R.id.btn4);
        cuatro.setOnClickListener(this);
        //Demas operaciones
        Button limpiar=(Button) findViewById(R.id.btnlimpiar);
        limpiar.setOnClickListener(this);
        Button seno=(Button) findViewById(R.id.btnseno);
        seno.setOnClickListener(this);
        Button tangente=(Button) findViewById(R.id.btntangente);
        tangente.setOnClickListener(this);
        Button multi=(Button) findViewById(R.id.btnmultiplicar);
        multi.setOnClickListener(this);
        Button div=(Button) findViewById(R.id.btndividir);
        div.setOnClickListener(this);
        Button resta=(Button) findViewById(R.id.btnrestar);
        resta.setOnClickListener(this);
        Button igual=(Button) findViewById(R.id.btnigual);
        igual.setOnClickListener(this);
        Button factorial=(Button) findViewById(R.id.btnfactorial);
        factorial.setOnClickListener(this);
        Button suma=(Button) findViewById(R.id.btnsumar);
        suma.setOnClickListener(this);
        Button poten=(Button) findViewById(R.id.btnpotencia2);
        poten.setOnClickListener(this);
        Button poten3=(Button) findViewById(R.id.btnpotencia3);
        poten3.setOnClickListener(this);
        Button fibbo=(Button) findViewById(R.id.btnfibo);
        fibbo.setOnClickListener(this);
        Button salir=(Button) findViewById(R.id.btnCloseApp);
        salir.setOnClickListener(this);
        ptxvseleccion=findViewById(R.id.txvSeleccion);
        String seleccion = getIntent().getStringExtra("SELECTAPP");
        String msg1 = seleccion;
        ptxvseleccion.setText(msg1);
        ptxvusername=findViewById(R.id.txvUsername);
        String username = getIntent().getStringExtra("USERNAME");
        String msg2 = "Bienvenido: " + username;
        ptxvusername.setText(msg2);
    }
    @Override
    public void onClick(View v) {
        int seleccion=v.getId();
        String a=display.getText().toString();
        try{
            switch (seleccion) {
                case R.id.btn0:
                    display.setText(a + "0");
                    break;
                case R.id.btn1:
                    display.setText(a + "1");
                    break;
                case R.id.btn2:
                    display.setText(a + "2");
                    break;
                case R.id.btn3:
                    display.setText(a + "3");
                    break;
                case R.id.btn4:
                    display.setText(a + "4");
                    break;
                case R.id.btnrestar:
                    rest = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btnsumar:
                    sum = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btnmultiplicar:
                    multi = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btndividir:
                    div = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btntangente:
                    tange = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    resultado = Math.tan(numeros[0] * Math.PI / 180);
                    display.setText(String.valueOf(resultado));
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btnseno:
                    seno = true;
                    numeros[0] = Double.parseDouble(a);
                    display.setText("");
                    resultado = Math.sin(numeros[0] * Math.PI / 180);
                    display.setText(String.valueOf(resultado));
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btnigual:
                    numeros[1] = Double.parseDouble(a);
                    if (sum == true) {
                        for (int i = 0; i < 21; i++) {
                            resultado = numeros[0] + numeros[1];
                        }
                        display.setText(String.valueOf(resultado));
                    } else if (rest == true) {
                        for (int i = 0; i < 21; i++) {
                            resultado = numeros[0] - numeros[1];
                        }
                        display.setText(String.valueOf(resultado));
                    } else if (multi == true) {
                        for (int i = 0; i < 21; i++) {
                            resultado = numeros[0] * numeros[1];
                        }
                        display.setText(String.valueOf(resultado));
                    } else if (div == true) {
                        if(numeros[0]==0){
                            Toast.makeText(this,"Math ERROR", Toast.LENGTH_LONG).show();
                        }else
                            for (int i = 0; i < 21; i++) {
                                resultado = numeros[0] / numeros[1];
                            }
                        display.setText(String.valueOf(resultado));
                    }
                    div=false;
                    raiz=false;
                    pot=false;
                    pocen=false;
                    seno=false;
                    cos=false;
                    parentesis=false;
                    rest=false;
                    sum=false;
                    tange=false;
                    factorial=false;
                    decimal=false;
                    parentesis=false;
                    rest=false;
                    sum=false;
                    multi=false;
                    break;
                case R.id.btnlimpiar:
                    display.setText("");
                    decimal=false;
                    parentesis=false;
                    break;
                case R.id.btnpotencia2:
                    pot = true;
                    numeros[0] = Double.parseDouble(a);
                    //numeros[1]=Double.parseDouble(a);
                    resultado = Math.pow(numeros[0], 2);
                    display.setText(String.valueOf(resultado));
                    decimal = false;
                    parentesis = false;
                    break;
                case R.id.btnpotencia3:
                    pot = true;
                    numeros[0] = Double.parseDouble(a);
                    resultado = Math.pow(numeros[0], 3);
                    display.setText(String.valueOf(resultado));
                    decimal = false;
                    parentesis = false;
                    break;
                case  R.id.btnfactorial:
                    factorial=true;
                    numeros[0]=Double.parseDouble(a);
                    resultado=1;
                    for(int i=2;i<=numeros[0];i++){
                        resultado=resultado*i;
                    }
                    display.setText(String.valueOf(resultado));
                    break;
                case  R.id.btnfibo:
                    numeros[0]=Double.parseDouble(a);
                    resultado=1;
                    for(int i=0;i<=numeros[0];i++){
                        resultado=resultado + numeros[0];
                    }
                    display.setText(String.valueOf(resultado));
                    break;
                case  R.id.btnCloseApp:
                    System.exit(0);
                    break;
            }
        }catch (Exception e){
            display.setText("SintaxError");
        }
    }
}
