/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java_projeto.Carro;

/**
 *
 * @author Parafuso de Oliveira
 */
public class Controlador_TelaClassificacao {

    
    public static ArrayList<String[]> getTabelaClassificacao(ArrayList<Carro> carros) {
         ArrayList<String[]> tabela = new ArrayList<>();
        
        int posicao = 1;
        for (Carro carro : carros) {
                String[] linha = new String[4];
                linha[0] = posicao + "º";
                linha[1] = carro.getPiloto();
                linha[2] = "Equipe";
                linha[3] = Integer.toString(carro.getPontosCorrida()); 
                tabela.add(linha); 
                
                switch(posicao){
                    case 1:
                        carro.setPontosCorrida(25);
                        carro.setPontuacao(25);
                        //equipe.setPontos();
                        break;
                    case 2:
                        carro.setPontosCorrida(18);
                        carro.setPontuacao(18);
                        //equipe.setPontos();
                        break;
                    case 3:
                        carro.setPontosCorrida(15);
                        carro.setPontuacao(15);
                        //equipe.setPontos();
                        break;
                    case 4:
                        carro.setPontosCorrida(12);
                        carro.setPontuacao(12);
                        //equipe.setPontos();
                        break;
                    case 5:
                        carro.setPontosCorrida(10);
                        carro.setPontuacao(10);
                        //equipe.setPontos();
                        break;
                    case 6:
                        carro.setPontosCorrida(8);
                        carro.setPontuacao(8);
                        //equipe.setPontos();
                        break;
                    case 7:
                        carro.setPontosCorrida(6);
                        carro.setPontuacao(6);
                        //equipe.setPontos();
                        break;
                    case 8:
                        carro.setPontosCorrida(4);
                        carro.setPontuacao(4);
                        //equipe.setPontos();
                        break;
                    case 9:
                        carro.setPontosCorrida(2);
                        carro.setPontuacao(2);
                        //equipe.setPontos();
                        break;
                    case 10:
                        carro.setPontosCorrida(1);
                        carro.setPontuacao(1);
                        //equipe.setPontos();
                        break;
                }
                posicao++;
        }
        return tabela;
    }
}
