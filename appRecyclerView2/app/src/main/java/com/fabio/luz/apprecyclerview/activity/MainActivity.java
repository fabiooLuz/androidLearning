package com.fabio.luz.apprecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.fabio.luz.apprecyclerview.R;
import com.fabio.luz.apprecyclerview.adapter.Adapter;
import com.fabio.luz.apprecyclerview.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvRecyclerView;
    private List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerView = findViewById(R.id.rvRecyclerView);
        //Configurar o adapter

        Adapter adapter = new Adapter( disciplinas );

        //Configurar o recyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvRecyclerView.setLayoutManager( layoutManager);
        rvRecyclerView.setHasFixedSize( true );

        rvRecyclerView.setAdapter( adapter );

    }

    public void criarDisciplinas() {

        Disciplina d = new Disciplina("Lógica de Programação","Juan Baptista","SEG","LAB 05" );

        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","Wellington Avila","SEG","SALA 107" );

        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );

        disciplinas.add(d);

        d = new Disciplina("Banco de Dados I","Fabrício Curvello","QUA","LAB 05");

        disciplinas.add(d);

        d = new Disciplina("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");

        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");

        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");

        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","Juan Baptista","QUI","LAB 04");

        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","Wellington Avila","SEX","SALA 109");

        disciplinas.add(d);

        d = new Disciplina("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");

        disciplinas.add(d);

    }


}