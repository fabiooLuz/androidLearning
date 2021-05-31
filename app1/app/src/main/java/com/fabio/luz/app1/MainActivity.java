package com.fabio.luz.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //objetos correspondentes as Views do xml que vou precisar manipular
    EditText textPrato;
    Button btnPedido;
    TextView textPedido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Vínculo entre xml e java para a estrutura da Activity

        textPrato = findViewById(R.id.textPrato);
        btnPedido = findViewById(R.id.btnPedido);
        textPedido = findViewById(R.id.textPedido);

    }

    public void buscarPrato(View view){
        String prato = textPrato.getText().toString();
        textPedido.setText( "Seu pedido: " + prato);
    }


}