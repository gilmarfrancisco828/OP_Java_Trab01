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
public class Controlador_TelaClassificacaoCampeonatoEquipes {

    public static ArrayList<String[]> getTabelaClassificacao(ArrayList<Equipe> equipes) {
        ArrayList<String[]> tabela = new ArrayList<>();
        int posicao = 1;
        
        //Ordenar equipesClassificadas pelos PontosCorrida
        ArrayList<Equipe> lista = new ArrayList<Equipe>(equipes);
        lista.sort(Comparator.comparing(Equipe::getPontuacao));
        for (Equipe eq : lista) {
            System.out.println("#eq " + eq.getNome());
        }

        int tam = lista.size() - 1;
        Equipe e = null;
        while (tam >= 0) {
            e = lista.remove(tam);
            String[] linha = new String[4];
            linha[0] = posicao + "º";
            linha[1] = e.getNome();
            linha[2] = Integer.toString(e.getPontuacao());
            tabela.add(linha);
            posicao++;
            tam--;
        }

        return tabela;
    }
}
