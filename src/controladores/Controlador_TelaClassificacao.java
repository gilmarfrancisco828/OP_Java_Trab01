/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java_projeto.Carro;
import java_projeto.Corrida;
import java_projeto.Equipe;
import javax.swing.JLabel;

/**
 *
 * @author Parafuso de Oliveira
 */
public class Controlador_TelaClassificacao {

    public static void setTituloClassificaoCorrida(Corrida c, JLabel titulo) {
        titulo.setText("Classificação: Grande Prêmio de " + c.getCidade());
    }
    
    public static ArrayList<String[]> getTabelaClassificacao(ArrayList<Carro> carros, ArrayList<Equipe> equipes) {
         ArrayList<String[]> tabela = new ArrayList<>();
        
        int posicao = 1;
        Equipe equipe = null;
        for (Carro carro : carros) {
                equipe = carro.getEquipe();
                String[] linha = new String[4];
                linha[0] = posicao + "º";
                linha[1] = carro.getPiloto();
                linha[2] = equipe.getNome();
                
                
                switch(posicao){
                    case 1:
                        carro.setPontuacao(25);
                        equipe.setPontuacao(25);
                        equipe.setPontosCorrida(25);
                        linha[3] = "25";
                        break;
                    case 2:
                        carro.setPontuacao(18);
                        equipe.setPontuacao(18);
                        equipe.setPontosCorrida(18);
                        linha[3] = "18";
                        break;
                    case 3:
                        carro.setPontuacao(15);
                        equipe.setPontuacao(15);
                        equipe.setPontosCorrida(15);
                        linha[3] = "15";
                        break;
                    case 4:
                        carro.setPontuacao(12);
                        equipe.setPontuacao(12);
                        equipe.setPontosCorrida(12);
                        linha[3] = "12";
                        break;
                    case 5:
                        carro.setPontuacao(10);
                        equipe.setPontuacao(10);
                        equipe.setPontosCorrida(10);
                        linha[3] = "10";
                        break;
                    case 6:
                        carro.setPontuacao(8);
                        equipe.setPontuacao(8);
                        equipe.setPontosCorrida(8);
                        linha[3] = "8";
                        break;
                    case 7:
                        carro.setPontuacao(6);
                        equipe.setPontuacao(6);
                        equipe.setPontosCorrida(6);
                        linha[3] = "6";
                        break;
                    case 8:
                        carro.setPontuacao(4);
                        equipe.setPontuacao(4);
                        equipe.setPontosCorrida(4);
                        linha[3] = "4";
                        break;
                    case 9:
                        carro.setPontuacao(2);
                        equipe.setPontuacao(2);
                        equipe.setPontosCorrida(2);
                        linha[3] = "2";
                        break;
                    case 10:
                        carro.setPontuacao(1);
                        equipe.setPontuacao(1);
                        equipe.setPontosCorrida(1);
                        linha[3] = "1";
                        break;
                }

                tabela.add(linha); 
                posicao++;
        }
        return tabela;
    }
}
