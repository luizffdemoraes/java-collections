package br.com.alura.test;

import java.util.*;
import java.util.Map.Entry;


public class TesteMap {
    public static void main(String[] args) {

        /*
        Segundo o JavaDoc, um Map também pode ser visto como se fossem de 3 coleções:
        The Map interface provides three collection views, which allow a map's contents to be viewed as a set of keys, collection of values, or set of key-value mappings.
        Ou seja, temos uma coleção de chaves, uma coleção de valores, e uma coleção das associações. O interessante é que podemos acessar cada uma das coleções. Vamos tentar?
        No editor abaixo já temos um Map preparado que associa o nome do aluno com a idade.
        Para acessar apenas as chaves use o método keySet() do Map. Para acessar os valores existe o método values().
        Tente iterar (foreach) em cima das chaves e valores separadamente!
         */

        Map<String, Integer> nomesParaIdade = new HashMap<>();
        nomesParaIdade.put("Paulo", 31);
        nomesParaIdade.put("Adriano", 25);
        nomesParaIdade.put("Alberto", 33);
        nomesParaIdade.put("Guilherme", 26);
        // ...

        Set<String> chaves = nomesParaIdade.keySet();
        for (String nome : chaves) {
            System.out.println(nome);
        }

        Collection<Integer> valores = nomesParaIdade.values();
        for (Integer idade : valores) {
            System.out.println(idade);
        }

        Set<Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
        for (Entry<String, Integer> associacao : associacoes) {
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }
    }
}
