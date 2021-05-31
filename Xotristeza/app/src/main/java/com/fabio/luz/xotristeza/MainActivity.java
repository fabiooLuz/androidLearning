package com.fabio.luz.xotristeza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView imvsmile;
    TextView tvNumero;
    Button btnFeliz;

    int contador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imvsmile = findViewById(R.id.imvSmile);
        tvNumero = findViewById(R.id.tvNumero);
        btnFeliz = findViewById(R.id.btnFeliz);



        btnFeliz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contador ++;
                //Log.d("TESTE CONTADOR ", "OnClick" + contador);
                tvNumero.setText( String.valueOf(contador) ); // converte para string



                switch ( contador ) {
                    case 10:
                        imvsmile.setImageResource(R.drawable.smile02);

                        break;

                    case 20:
                        imvsmile.setImageResource(R.drawable.smile03);

                        break;

                    case 30:
                        imvsmile.setImageResource(R.drawable.smile04);

                        break;

                    case 40:
                        imvsmile.setImageResource(R.drawable.smile05);

                        break;

                    case 50:
                        imvsmile.setImageResource(R.drawable.smile06);

                        break;

                    case 60:
                        imvsmile.setImageResource(R.drawable.smile07);

                        break;

                    case 70:
                        imvsmile.setImageResource(R.drawable.smile08);

                        break;

                    case 80:
                        imvsmile.setImageResource(R.drawable.smile09);

                        break;

                    case 90:
                        imvsmile.setImageResource(R.drawable.smile10);

                        break;

                    case 100:
                        imvsmile.setImageResource(R.drawable.smile11);

                        break;


                }
            }
        });


    }
    public void zerarTudo(View view ){
        contador = 0;
        tvNumero.setText(String.valueOf( contador));
        imvsmile.setImageResource(R.drawable.smile01);
    }
}