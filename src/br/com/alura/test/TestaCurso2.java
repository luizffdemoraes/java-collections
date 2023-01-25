package br.com.alura.test;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as colecoes do Java",
                "Paulo Silveira");

        javaColecoes.setAulas(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.setAulas(new Aula("Criando uma Aula", 20));
        javaColecoes.setAulas(new Aula("Modelando com colecoes", 24));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);
        System.out.println(javaColecoes.getTempoTotal());

    }
}
