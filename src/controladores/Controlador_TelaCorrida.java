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
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Parafuso de Oliveira
 */
public class Controlador_TelaCorrida {

    public static void setTituloCorrida(int num, Corrida c, JLabel titulo) {
        titulo.setText("Corrida N°: " + num + " - Cidade: " + c.getCidade());
    }

    public static ArrayList<String[]> getTabelaCorrida(Campeonato c,
            Corrida corrida, ArrayList<Carro> carros) {
        ArrayList<String[]> tabela = new ArrayList<>();

        String[] linha = new String[21];
        linha[0] = "Posição";
        int j = 1;

        for (Carro carro : carros) {
            linha[j++] = carro.getPosicao() + "(" + carro.getVolta() + ")";
        }

        tabela.add(linha);

        linha = new String[21];
        linha[0] = "Estado";
        j = 1;

        for (Carro carro : carros) {
            linha[j++] = carro.getEstadoString();
        }
        tabela.add(linha);

        linha = new String[21];
        linha[0] = "Equipe";
        j = 1;

        for (Carro carro : carros) {
            linha[j++] = carro.getEquipe().getNome();
        }
        tabela.add(linha);

        linha = new String[21];
        linha[0] = "Combustível";
        j = 1;

        for (Carro carro : carros) {
//            System.out.println("Carro["+carro.getId()+"]: "+carro.getCombustivel());
            linha[j++] = Float.toString(carro.getCombustivel());
        }

        tabela.add(linha);
        return tabela;
    }

    public static void atualizarTelaCorrida(JTable t, Campeonato c,
            Corrida corrida, ArrayList<Carro> carros) {
        ArrayList<String[]> tabela = getTabelaCorrida(c, corrida, carros);
//        t.setModel(new CorridaTableModel(carros, ));
        TableColumnModel col = t.getColumnModel();
        JTableHeader header= t.getTableHeader();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 21; j++) {
                 col.getColumn(j).setHeaderValue(carros.get(j-1).getPiloto());
                t.setValueAt(tabela.get(i)[j], i, j);
            }
            
        }
//        int len = 90;
//        col.getColumn(0).setMinWidth(len)
        header.repaint();
    }
}
