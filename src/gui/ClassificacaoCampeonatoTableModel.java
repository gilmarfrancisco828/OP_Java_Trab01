/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ClassificacaoCampeonatoTableModel extends AbstractTableModel{
    private ArrayList<String []> tabela;
     private String[] colunas;

    public ClassificacaoCampeonatoTableModel(ArrayList<String []> tabela) {
        this.tabela = tabela;
        this.colunas = new String[4];
        this.colunas[0] = "Posição";
        this.colunas[1] = "Piloto";
        this.colunas[2] = "Equipe";
        this.colunas[3] = "Pontos";
    }
    
    
    @Override
    public int getRowCount() {
        return tabela.size();
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
