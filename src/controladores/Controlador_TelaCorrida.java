/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import gui.CorridaTableModel;
import java.util.ArrayList;
import java_projeto.Campeonato;
import java_projeto.Carro;
import java_projeto.Corrida;
import java_projeto.Equipe;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author Parafuso de Oliveira
 */
public class Controlador_TelaCorrida {

    public static void setTituloCorrida(int num, Corrida c, JLabel titulo) {
        titulo.setText("Corrida N°: " + num + " - Cidade: " + c.getCidade());
    }

    public static ArrayList<String[]> getTabelaCorrida(Campeonato c) {
        ArrayList<String[]> tabela = new ArrayList<>();

        String[] linha = new String[11];
        linha[0] = "Posição";
        int j = 1;
        for (Equipe e : c.getEquipes()) {
            Carro carro = e.getCarro();
            linha[j++] = carro.getDistancia() + "(" + carro.getVolta() + ")";
        }
        tabela.add(linha);

        linha = new String[11];
        linha[0] = "Estado";
        j = 1;
        for (Equipe e : c.getEquipes()) {
            Carro carro = e.getCarro();
            linha[j++] = carro.getEstadoString();
        }
        tabela.add(linha);

        linha = new String[11];
        linha[0] = "Equipe";
        j = 1;
        for (Equipe e : c.getEquipes()) {
            linha[j++] = e.getNome();
        }
        tabela.add(linha);

        linha = new String[11];
        linha[0] = "Combustível";
        j = 1;
        for (Equipe e : c.getEquipes()) {
            Carro carro = e.getCarro();
            linha[j++] = Float.toString(carro.getCombustivel());
        }
        tabela.add(linha);
        return tabela;
    }

    public static void atualizarTelaCorrida(JTable t, Campeonato c) {
        t.setModel(new CorridaTableModel(getTabelaCorrida(c)));
    }

}