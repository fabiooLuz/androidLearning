package com.fabio.luz.suacasanapraia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;

public class segundaActivity extends AppCompatActivity {

    private TextView textTipo;
    private TextView textDiaria;
    private TextView textTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textTipo = findViewById(R.id.textTipo);
        textDiaria = findViewById(R.id.textDiaria);
        textTotal = findViewById(R.id.textTotal);

        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        int tipo = dados.getInt("tipoInserido");
        int diaria = dados.getInt("diariaInserida");


        //Inserindo o tipo e diaria recuperadas da intent pelo bundle na TextView
        textTipo.setText(String.valueOf(" Você escolheu a casa tipo: " + tipo ));
        textDiaria.setText( String.valueOf( "Total de : " + diaria + " Dia(s)" ));

        switch ( tipo){
           case 1:
              textTotal.setText(String.valueOf("R$ : " + diaria * 160));
            break;

               case 2:
                 textTotal.setText(String.valueOf("R$ : " + diaria * 240));
               break;

             }


    }


    public void minimizaTeclado(Button button){

        InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(button.getWindowToken(), 0);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

    }//fim do minimizaTeclado


}