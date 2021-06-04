package com.fabio.luz.apprecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.fabio.luz.apprecyclerview.R;
import com.fabio.luz.apprecyclerview.model.Disciplina;

import java.util.List;

public class Adapter extends RecyclerView.Adapter <Adapter.MyViewHolder>{

    private List<Disciplina> listaDisciplinas;

    public Adapter( List<Disciplina> lista){
        this.listaDisciplinas = lista;
    }

    @NonNull
    @org.jetbrains.annotations.NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
        // método para criar a visualização dos itens da lista
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);



        return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull Adapter.MyViewHolder holder, int position) {
        // Método para exibir os itens da lista
        Disciplina d = listaDisciplinas.get( position);
        holder.tvDisciplina.setText(d.getNomeDisciplina());
        holder.tvProfessor.setText(d.getProfessor());
        holder.tvDiasemana.setText(d.getDiaSemana());
        holder.tvSala.setText(d.getSala());

    }

    @Override
    public int getItemCount() {
        //Quantidade de itens a ser exibidos
        return listaDisciplinas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvDisciplina;
        TextView tvProfessor;
        TextView tvDiasemana;
        TextView tvSala;

        public MyViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
            super(itemView);

            tvDisciplina = itemView.findViewById(R.id.tvDisciplina);
            tvProfessor = itemView.findViewById(R.id.tvProfessor);
            tvDiasemana = itemView.findViewById(R.id.tvDiasemana);
            tvSala = itemView.findViewById(R.id.tvSala);
        }
    }
}
