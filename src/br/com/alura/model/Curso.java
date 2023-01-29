package br.com.alura.model;

import br.com.alura.model.Aula;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

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
        return Collections.unmodifiableList(aulas);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(int numero) {
        /*
        for (Aluno aluno : alunos) {
            if (aluno.getNumeroMatricula() == numero) {
                return aluno;
            }
        }
        throw new NoSuchElementException("Matricula " + numero
                + " não encontrada");

         */
        if (!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException();
        return this.matriculaParaAluno.get(numero);
    }
}
