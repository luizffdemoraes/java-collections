package br.com.alura.test;

import br.com.alura.model.Aluno;
import br.com.alura.model.Aula;
import br.com.alura.model.Curso;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.setAulas(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.setAulas(new Aula("Criando uma Aula", 20));
        javaColecoes.setAulas(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });
    }
}