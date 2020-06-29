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
    
    public static Corrida criaCorrida(float distancia_pista, int numero_voltas, int dificuldade_pista, float probabilidade_chuva, String cidade){
        Corrida corrida = new Corrida(distancia_pista, numero_voltas, dificuldade_pista, probabilidade_chuva, cidade);
        return corrida;
    }
    public static ArrayList<Corrida> gerarCorridas(){
        ArrayList<Corrida> corridas = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            Corrida c = new Corrida(15.0f, 3, 2, 0.1f, "Cidade de Teste");
            corridas.add(c);
        }
        return corridas;
    }
    public static void avancar(ArrayList<Carro> carros){
        for (Carro carro : carros) {
            carro.mover();
        }
    }
    
    
}
