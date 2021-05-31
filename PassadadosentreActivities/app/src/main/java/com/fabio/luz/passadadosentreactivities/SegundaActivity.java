package com.fabio.luz.passadadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvIdadeR;
    private TextView tvSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvIdadeR = findViewById(R.id.tvIdadeR);
        tvSituacao = findViewById(R.id.tvSituacao);

        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        int idade = dados.getInt("idadeInserida");

        //Inserindo a idade recuperada da intent pelo bundle na TextView
        tvIdadeR.setText(String.valueOf( idade ));

        if( idade < 18) {
            tvSituacao.setText("Você é menor de idade");
        } else {
            tvSituacao.setText("Você é maior de idade");
        }
    }
}