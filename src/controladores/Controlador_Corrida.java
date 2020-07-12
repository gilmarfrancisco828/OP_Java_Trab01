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

/**
 *
 * @author Matheus
 */
public class Controlador_Corrida {
    
    public static Corrida criaCorrida(float distancia_pista, int dificuldade_pista, float probabilidade_chuva, String cidade){
        Corrida corrida = new Corrida(distancia_pista, dificuldade_pista, probabilidade_chuva, cidade);
        return corrida;
    }
    public static ArrayList<Corrida> gerarCorridas(){
        ArrayList<Corrida> corridas = new ArrayList<>();
        corridas.add(new Corrida(4.3f, 2, 0.305f, "Grande Prêmio da Áustria"));
        corridas.add(new Corrida(4.42f, 2, 0.2f, "Grande Prêmio da Estíria"));
        /*corridas.add(new Corrida(5.9f, 2, 0.225f, "Grande Prêmio da Hungria"));
        corridas.add(new Corrida(6.0f, 2, 0.255f, "Grande Prêmio da Grâ-Bretanha"));
        corridas.add(new Corrida(4.66f, 2, 0.255f, "Grande Prêmio do 70º Aniversário"));
        corridas.add(new Corrida(4.65f, 2, 0.1f, "Grande Prêmio da Espanha"));
        corridas.add(new Corrida(7.01f, 3, 0.29f, "Grande Prêmio da Bélgica"));
        corridas.add(new Corrida(10.0f, 2, 0.2f, "Grande Prêmio da Itália"));
        */
            
        
        return corridas;
    }
    public static void avancar(ArrayList<Carro> carros){
        for (Carro carro : carros) {
            carro.mover();
        }
    }
    
    
}

