/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java_projeto.Carro;
import java_projeto.Equipe;

/**
 *
 * @author Matheus
 */
public class Controlador_Carro {
    
    static int cont = 0;
    
    public static Carro criarCarro(String p, Equipe e){
        Carro carro = new Carro(cont, p, e);
        return carro;
    }
    
}
