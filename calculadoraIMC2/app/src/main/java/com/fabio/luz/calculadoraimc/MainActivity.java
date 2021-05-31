package com.fabio.luz.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textPeso;
    EditText textAltura;
    Button btnCalcular;
    TextView textImc;
    TextView textSituacao;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textAltura = findViewById(R.id.textAltura);
        textPeso = findViewById(R.id.textPeso);
        btnCalcular = findViewById(R.id.btnCalcular);
        textSituacao = findViewById(R.id.textSituacao);
        textImc = findViewById(R.id.textImc);

    }

    public void calcularIMC (View view) {

        double imc, peso, altura;

        peso = Double.parseDouble(textPeso.getText().toString() );
        altura = Double.parseDouble(textAltura.getText().toString() );

        imc = peso / ( altura * altura );

        textImc.setText("IMC : " + imc );
        textSituacao.setText( apontarSituacao(imc));

        textAltura.setText("");
        textPeso.setText("");

        minimizaTeclado( btnCalcular );

        } // fim do calcularImc()

    public String apontarSituacao ( double imc) {
        String situacao = "Situacao: ";

        //lógica if..else aninhada

        if ( imc < 18.5 ) {
            situacao += "Abaixo do peso";

        } else {
            if ( imc < 25 ) {
                situacao += "Peso normal";

            } else {
                if ( imc < 30 ) {
                    situacao += "Sobrepeso";

                } else {
                    if ( imc < 35 ) {
                        situacao += "Obesidade grau 1";

                    } else {
                        if ( imc < 40 ) {
                            situacao += "Obesidade grau 2";

                        } else {
                            situacao += "Obesidade grau 3";

                        }
                    }
                }
            }
        }
        return situacao;


    } // fim do apontarSituacao

    // minimiza teclado

    public void minimizaTeclado(Button button){

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(button.getWindowToken(), 0);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }//fim do minimizaTeclado


}