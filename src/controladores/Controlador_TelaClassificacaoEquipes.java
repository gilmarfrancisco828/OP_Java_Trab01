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
public class Controlador_TelaClassificacaoEquipes {

    
    public static ArrayList<String[]> getTabelaClassificacao(ArrayList<Carro> carros, ArrayList<Equipe> equipes) {
         ArrayList<String[]> tabela = new ArrayList<>();
        
        int posicao = 1;
        ArrayList<Equipe> equipesClassificadas = new ArrayList<>();
        for (Carro carro : carros) {
            for(Equipe e : equipes){
                for(int i = 0; i < 2; i++){
                    if(carro.getId() == e.getCarro(i).getId() && !equipesClassificadas.contains(e)){
                        equipesClassificadas.add(e);
                    }
                }
            }
        }
        
        //Ordenar equipesClassificadas pelos PontosCorrida
        ArrayList<Equipe> lista = new ArrayList<Equipe>(equipesClassificadas);
        lista.sort(Comparator.comparing(Equipe::getPontosCorrida));
        for(Equipe eq : lista){
            System.out.println("#eq "+eq.getNome());
        }
        
        int tam = lista.size() - 1;
        Equipe e = null;
        while(tam >= 0){
            e = lista.remove(tam);
            String[] linha = new String[4];
            linha[0] = posicao + "º";
            linha[1] = e.getNome();
            linha[2] = Integer.toString(e.getPontosCorrida());
            tabela.add(linha); 
            e.zeraPontosCorrida();
            posicao++;
            tam--;
        }
        
        return tabela;
    }
}
