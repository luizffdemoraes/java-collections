package br.com.alura.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAlunos {

    public static void main(String[] args) {

        //Conjunto
        // O método sort só funciona com List
        // Vantagens do uso do HashSet
        // A primeira vantagem é que ele não aceita elementos repetidos.
        // Mas a grande vantagem de se utilizar o conjunto é a velocidade de performance,
        // quando utilizamos métodos que procuram objetos dentro de uma coleção (por exemplo, o método contains).
        Set<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);

        System.out.println(alunos.size());

        for (String aluno : alunos) {
            System.out.println(aluno);
        }

        alunos.forEach(aluno -> {
            System.out.println(aluno);
        });

        System.out.println(alunos);

        List<String> alunosEmLista = new ArrayList<>(alunos);
    }
}

