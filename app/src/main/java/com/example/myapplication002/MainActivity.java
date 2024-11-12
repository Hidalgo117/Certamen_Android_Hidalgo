package com.example.myapplication002;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  //LINK https://github.com/Hidalgo117/Certamen_Android_Hidalgo
    EditText peso,estatura;
    Spinner sexo;
    TextView IMC,INFO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //variables
        sexo = findViewById(R.id.spr_Sexo);
        IMC = findViewById(R.id.Txt_Mostrar);
        INFO = findViewById(R.id.txt_info);
        peso=findViewById(R.id.TxN_Peso);
        estatura = findViewById(R.id.Txn_Estatura);

    }

    public void calcular(){
        Double estatura2 = Double.parseDouble(estatura.getText().toString())/100.0;
        Double peso2 = Double.parseDouble(peso.getText().toString());

        //calculo
        Double valor = peso2/estatura2*estatura2;

        //if para los rangos
        if(valor < 18.5){
            INFO.setText("Delgado\n Come con más frecuencia.Empieza poco a poco a hacer 5 a 6 comidas más pequeñas durante el día\n" +
                    "Elige alimento con muchos nutrientes\n" +
                    "Agrega aderezos\n" +
                    "Prueba licuados y batidos de frutas\n" +
                    "Controla que bebes y cuando\n" +
                    "Haz ejercicio");
        } else if (valor >= 18.5 && valor <= 24.9) {
            INFO.setText("Aceptable");
        } else if (valor >= 25.0 && valor <= 29.9) {
            INFO.setText("Sobrepeso\n" +
                    "Haga 30minutos de ejercicio aeróbico 5 veces por semana\n" +
                    "Logre un equilibrio entre el consumo de calorias y la actividad fisica\n" +
                    "Limite las grasas saturadas a no mas del 7% de las calorias totales\n" +
                    "Tenga una alimentación baja en colesterol con carnes magras, frutas, verduras y cereales integrales");
        } else if (valor >= 30 && valor <= 34.9) {
            INFO.setText("Obeso/a\n" +
                    "Haga 30minutos de ejercicio aeróbico 5 veces por semana\n" +
                    "Logre un equilibrio entre el consumo de calorias y la actividad fisica\n" +
                    "Limite las grasas saturadas a no mas del 7% de las calorias totales\n" +
                    "Tenga una alimentación baja en colesterol con carnes magras, frutas, verduras y cereales integrales");
        }


        //setteo de imc
        IMC.setText(valor.toString());
    }
}