/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projeto;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Campeonato {
    
    private ArrayList<Corrida> corridas;
    private String nome;
    private ArrayList<Equipe> equipes;

    public Campeonato(String nome) {
        this.nome = nome;
        corridas = new ArrayList<>();
        equipes = new ArrayList<>();
    }

    public ArrayList<Corrida> getCorridas() {
        return corridas;
    }

    public void setCorridas(ArrayList<Corrida> corridas) {
        this.corridas = corridas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Equipe> getEquipes() {
        return equipes;
    }

    public void setEquipes(ArrayList<Equipe> equipes) {
        this.equipes = equipes;
    }
    
    
}
