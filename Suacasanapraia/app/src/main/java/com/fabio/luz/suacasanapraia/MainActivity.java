package com.fabio.luz.suacasanapraia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText tvTipo;
    private EditText tvDiaria;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTipo = findViewById(R.id.tvTipo);
        tvDiaria = findViewById(R.id.tvDiaria);
        btnEnviar = findViewById(R.id.btnEnviar);


        String  texto = tvTipo.getText().toString();
        texto = tvDiaria.getText().toString();


        if (texto == null || texto.equals("")) {
            tvTipo.setError("Este campo é obrigatório");
            tvDiaria.setError("Este campo é obrigatório");

            if (tvTipo.getText().toString().equals("")){
                Toast.makeText(this, "Insira 1 ou 2", Toast.LENGTH_LONG).show();
            }

            if (tvDiaria.getText().toString().equals(null)){
                Toast.makeText(this, "Insira nº dias", Toast.LENGTH_LONG).show();
            }

        } else {
              Toast.makeText(this, "Valor invalido",Toast.LENGTH_SHORT).show();
        }





        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //capturar a tipo e diaria inserido no tvTipo pelo usuario
                int tipo = Integer.parseInt( tvTipo.getText().toString() );
                int diaria = Integer.parseInt( tvDiaria.getText().toString() );



                //criar a Intent que vai iniciar a segunda Activity
                Intent intent = new Intent(getApplicationContext(), segundaActivity.class );

                // Passar dados entre as intent
                intent.putExtra( "tipoInserido", tipo );
                intent.putExtra( "diariaInserida", diaria );


                //disparar Activity
                startActivity( intent );

            }
        });

    }

    // minimiza teclado

    public void minimizaTeclado(Button button){

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(button.getWindowToken(), 0);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }//fim do minimizaTeclado




}