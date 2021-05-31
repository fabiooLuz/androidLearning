package com.curvello.fabricio.apprecyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.curvello.fabricio.apprecyclerview.R;
import com.curvello.fabricio.apprecyclerview.adapter.Adapter;
import com.curvello.fabricio.apprecyclerview.model.Disciplina;
import com.example.recyclerview.util.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private final List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvRecyclerView = findViewById(R.id.rvRecyclerView);

        //Listagem de Disciplinas
        this.criarDisciplinas();

        //Configurar o Adapter
        Adapter adapter = new Adapter( disciplinas );

        //Configurar o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rvRecyclerView.setLayoutManager( layoutManager );
        rvRecyclerView.setHasFixedSize( true );
        //inserindo uma linha entre cada item
        rvRecyclerView.addItemDecoration( new DividerItemDecoration( this, LinearLayout.VERTICAL ));

        rvRecyclerView.setAdapter( adapter );

        //evento de click
        rvRecyclerView.addOnItemTouchListener(
            new RecyclerItemClickListener(
                    getApplicationContext(),
                    rvRecyclerView,
                    new RecyclerItemClickListener.OnItemClickListener() {
                        @Override
                        public void onItemClick(View view, int position) {
                            Disciplina d = disciplinas.get( position );

                            //Clique simples: Toast exibindo DIA e SALA
                            Toast.makeText(MainActivity.this, d.getDiaSemana() + " - " + d.getSala(),
                                    Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onLongItemClick(View view, int position) {
                            Disciplina d = disciplinas.get( position );

                            //Clique longo: Toast exibindo Disciplina e Professor
                            Toast.makeText(MainActivity.this, d.getNomeDisciplina() + " - " + d.getProfessor(),
                                    Toast.LENGTH_LONG).show();

                        }

                        @Override
                        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                        }
                    }
            )

        );
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