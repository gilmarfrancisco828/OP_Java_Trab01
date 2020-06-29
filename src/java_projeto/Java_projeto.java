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
public class Java_projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Oi");
        int cont = 0;
        Corrida c = new Corrida(30.5f, 10, 2, .56f, "Atenas");
        ArrayList<Carro> carros = new ArrayList<>();
        for(int i = 0; i < 10; i++)
            carros.add(new Carro(i));
        for(int i = 0; i < 1000; i++){
            System.out.println("Simulação Nº "+(i+1));
            ArrayList<Carro>acidentados = c.verificaColisao(Corrida.Clima.ENSOLARADO, carros);
            for(Carro car:acidentados)
                System.out.println(car.getId());
            
        }

        
    }
    
}
