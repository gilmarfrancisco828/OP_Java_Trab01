/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projeto;

import controladores.Controlador_Carro;

/**
 *
 * @author Matheus
 */
public class Equipe {
    
    private String nome;
    private int pontuacao;
    private Carro carro;

    public Equipe(String nome) {
        this.nome = nome;
        this.pontuacao = 0;
        carro = Controlador_Carro.criarCarro();
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
        this.pontuacao = pontuacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    
    
    
}
