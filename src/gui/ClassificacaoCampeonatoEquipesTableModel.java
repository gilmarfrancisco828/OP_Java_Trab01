/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class ClassificacaoCampeonatoEquipesTableModel extends AbstractTableModel{
    private ArrayList<String []> tabela;
     private String[] colunas;

    public ClassificacaoCampeonatoEquipesTableModel(ArrayList<String []> tabela) {
        this.tabela = tabela;
        this.colunas = new String[3];
        this.colunas[0] = "Posição";
        this.colunas[1] = "Equipe";
        this.colunas[2] = "Pontos";
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
