package com.fabio.luz.passadadosentreactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnEnviar;
    private EditText tvIdade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEnviar = findViewById(R.id.btnEnviar);
        tvIdade = findViewById(R.id.tvIdade);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //capturar a idade inserida no tvIdade pelo usuario

                int idade = Integer.parseInt( tvIdade.getText().toString() );

                //criar a Intent que vai iniciar a segunda Activity

                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                // Passar dados entre as intent
                intent.putExtra("idadeInserida", idade);



                startActivity( intent ); //disparo ele
            }
        });


    }
}