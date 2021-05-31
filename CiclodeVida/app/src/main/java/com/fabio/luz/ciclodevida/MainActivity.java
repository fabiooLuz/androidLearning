package com.fabio.luz.ciclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "EXECUTOU onCREATE", Toast.LENGTH_LONG).show();
        Log.i("Teste ciclo", "----- Executou onCreate()-----");


    }

    @Override
    protected void onStart() {
        super.onStart();

        Toast.makeText(this, "EXECUTOU onStart", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onStart", "----- Executou onStart -----");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "EXECUTOU onResume", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onResume", "----- Executou onResume -----");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Toast.makeText(this, "EXECUTOU onPause", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onPause", "----- Executou onPause -----");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "EXECUTOU onStop", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onStop", "----- Executou onStop -----");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "EXECUTOU onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onDestroy", "----- Executou onDestroy -----");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "EXECUTOU onRestart", Toast.LENGTH_SHORT).show();
        Log.i("Teste ciclo onRestart", "----- Executou onRestart -----");
    }
}