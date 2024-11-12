package com.example.myapplication002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText peso,estatura;
    Spinner sexo;
    TextView IMC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sexo = findViewById(R.id.spr_Sexo);
        IMC = findViewById(R.id.Txt_Mostrar);
        peso=findViewById(R.id.TxN_Peso);
        estatura = findViewById(R.id.Txn_Estatura);

        


    }
}