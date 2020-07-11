/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projeto;

import controladores.Controlador_Carro;
import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Equipe {
    
    private String nome;
    private int pontuacao;
    private int pontosCorrida;
    private Carro[] carro;
    private int habilidadeMecanicos;

    public Equipe(String nome, String p1, String p2, int habilidade) {
        this.nome = nome;
        this.pontuacao = 0;
        this.pontosCorrida = 0;
        carro = new Carro[2];
        carro[0] = Controlador_Carro.criarCarro(p1, this);
        carro[1] = Controlador_Carro.criarCarro(p2, this);
        habilidadeMecanicos = habilidade;
    }

    public int getHabilidadeMecanicos() {
        return habilidadeMecanicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }

    public int getPontosCorrida() {
        return pontosCorrida;
    }

    public void setPontosCorrida(int pontosCorrida) {
        this.pontosCorrida += pontosCorrida;
    }
    
    public void zeraPontosCorrida(){
        this.pontosCorrida = 0;
    }
    
    public Carro getCarro(int indice) {
        return carro[indice];
    }

    public void setCarro(Carro carro, int indice) {
        this.carro[indice] = carro;
    }   
    
    public static ArrayList<Carro> getCarros(ArrayList<Equipe> equipes){
        ArrayList<Carro> arr = new ArrayList<Carro>();
        for(Equipe equipe:equipes){
            arr.add(equipe.getCarro(0));
            arr.add(equipe.getCarro(1));
        }
        return arr;
    }
}
