/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import java_projeto.Carro;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Parafuso de Oliveira
 */
public class CorridaTableModel extends AbstractTableModel {

    private ArrayList<String[]> tabela;
    private String[] colunas;

    public CorridaTableModel(ArrayList<Carro> carros, ArrayList<String[]> tabela) {
        this.colunas = new String[21];
        this.colunas[0] = " ";
        this.tabela = tabela;
        int i = 1;
        for (Carro carro : carros) {
            this.colunas[i++] = carro.getPiloto();
        }

    }


    @Override
    public int getRowCount() {
        return 4;
//        return tabela.size();;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return tabela.get(rowIndex)[columnIndex];
    }
}
