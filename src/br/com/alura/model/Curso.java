package br.com.alura.model;

import br.com.alura.model.Aula;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public void setAulas(Aula aulas) {
        this.aulas.add(aulas);
    }

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return aulas;
    }
}
