/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_projeto;

/**
 *
 * @author Jediael
 */
public class Classificacao {



    public Classificacao(int[] classific) {

    }

    public void atribuirPtos(Equipe[] equipes, int[] classific) {
        for (Equipe e : equipes) {
            for (int i = 0; i < 2; i++) {
                switch (e.getCarro(i).getId()) {
                    case 0:
                        //Carro carro = new Carro();
                        //carro.setPontos(25);
                        //carro.setPontuacao(25);
                        //equipe.setPontuacao(25);
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        break;
                    case 6:
                        break;
                    case 7:
                        break;
                    case 8:
                        break;
                    case 9:
                        break;

                }
            }
        }
    }


}
