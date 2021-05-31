package com.fabio.luz.app01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etPrato;
    Button btnPedido;
    TextView tvPedido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // vínculo entre XML e JAVA para estrutura da Activity

        //Vinculando objetos Java com Views XML
        etPrato = findViewById(R.id.etPrato);
        btnPedido = findViewById(R.id.btnPedido);
        tvPedido = findViewById(R.id.tvPedido);
    }

    //capturar o texto de etprato e inserir em tvPedido

    public void buscarPratoSelecionado(View view){
       String prato = etPrato.getText().toString();
       tvPedido.setText(prato);
    }

}