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
    
    public static Equipe criarEquipe(String nome, String p1, String p2){
        Equipe equipe = new Equipe(nome, p1, p2);
        return equipe;
    }
    
    public static ArrayList<Equipe> gerarEquipes(){
        ArrayList<Equipe> equipes = new ArrayList<>();
        equipes.add(new Equipe("Mercedes", "V. Bottas", "L. Hamilton"));
        equipes.add(new Equipe("Ferrari", "C. Leclerc", "S. Vettel"));
        equipes.add(new Equipe("McLaren", "L. Norris", "C. Sainz Jr."));
        equipes.add(new Equipe("Racing Point", "S. Perez", "L. Stroll"));
        equipes.add(new Equipe("AlphaTauri", "P. Gasly", "D. Kvyat"));
        equipes.add(new Equipe("Alfa Romeo", "A. Giovinazzi", "K. Raikkonen"));
        equipes.add(new Equipe("Renault", "D. Ricciardo", "E. Ocon"));
        equipes.add(new Equipe("Williams", "N. Latifi", "G. Russell"));
        equipes.add(new Equipe("Red Bull", "M. Verstappen", "A. Albon"));
        equipes.add(new Equipe("Haas", "R. Grosjean", "K. Magnussen"));
        return equipes;
    }
    
    
    
}
