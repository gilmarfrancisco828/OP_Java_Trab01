/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.ArrayList;
import java_projeto.Carro;
import java_projeto.Equipe;

/**
 *
 * @author Matheus
 */
public class Controlador_Equipe {
    
    public static Equipe criarEquipe(String nome){
        Equipe equipe = new Equipe(nome);
        return equipe;
    }
    
    public static ArrayList<Equipe> gerarEquipes(){
        ArrayList<Equipe> equipes = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            Equipe e = new Equipe("Equipe" + i);
            //e.setCarro(Controlador_Carro.criarCarro());
            equipes.add(e);
        }
        return equipes;
    }
    
    
    
}
