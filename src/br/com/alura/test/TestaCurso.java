package br.com.alura.test;

import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.setAulas(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.setAulas(new Aula("Criando uma Aula", 20));
        javaColecoes.setAulas(new Aula("Modelando com coleções", 24));

        List<Aula> aulas = javaColecoes.getAulas();
        System.out.println(javaColecoes.getAulas());
    }
}
