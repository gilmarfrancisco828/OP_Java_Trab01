/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java.util.Comparator;
import java_projeto.Carro;
import java_projeto.Equipe;

/**
 *
 * @author Parafuso de Oliveira
 */
public class Controlador_TelaClassificacaoCampeonato {

    public static ArrayList<String[]> getTabelaClassificacao(ArrayList<Equipe> equipes) {
        ArrayList<String[]> tabela = new ArrayList<>();
        ArrayList<Carro> carrosClassificados = new ArrayList<>();
        int posicao = 1;

        for (Equipe e : equipes) {
            for (int i = 0; i < 2; i++) {
                carrosClassificados.add(e.getCarro(i));
            }
        }
        //Ordenar carrosClassificados pela pontuacao
        ArrayList<Carro> lista = new ArrayList<Carro>(carrosClassificados);
        lista.sort(Comparator.comparing(Carro::getPontuacao));
        for (Carro c : lista) {
            System.out.println("#carro " + c.getId());
        }

        int tam = lista.size() - 1;
        Carro c = null;
        Equipe eq = null;
        while (tam >= 0) {
            c = lista.remove(tam);
            for (Equipe e : equipes) {
                for (int i = 0; i < 2; i++) {
                    if (c.getId() == e.getCarro(i).getId()) {
                        eq = e;
                    }
                }
            }
            
            String[] linha = new String[4];
            linha[0] = posicao + "º";
            linha[1] = c.getPiloto();
            linha[2] = eq.getNome();
            linha[3] = Integer.toString(c.getPontuacao());
            tabela.add(linha);
            posicao++;
            tam--;
        }
        return tabela;
    }
}
