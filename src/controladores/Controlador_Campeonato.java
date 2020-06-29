package controladores;

import java.util.ArrayList;
import java_projeto.Campeonato;
import java_projeto.Corrida;
import java_projeto.Equipe;

/**
 *
 * @author Matheus
 */
public class Controlador_Campeonato {
    
    public static Campeonato criarCampeonato(String nome){ 
        Campeonato campeonato = new Campeonato(nome);
        //Adiciona as equipes geradas ao campeonato
        ArrayList<Equipe> e = Controlador_Equipe.gerarEquipes();
        adicionarEquipes(campeonato, e);
        
        // Adiciona as corridas geradas ao campeonato
        ArrayList<Corrida> c = Controlador_Corrida.gerarCorridas();
        adicionarCorridas(campeonato, c);
        
        return campeonato;
    }
    
    public static void adicionarEquipes(Campeonato campeonato, ArrayList<Equipe> equipes){
        campeonato.setEquipes(equipes);
    }
    
    public static void adicionarCorridas(Campeonato campeonato, ArrayList<Corrida> corridas){
        campeonato.setCorridas(corridas);
    }
    
    public static void iniciaCampeonato(Campeonato campeonato){
        
    }
}
