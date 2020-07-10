/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.Controlador_Campeonato;
import controladores.Controlador_TelaCorrida;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java_projeto.Campeonato;
import java_projeto.Carro;
import java_projeto.Corrida;
import java_projeto.Equipe;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

/**
 *
 * @author Matheus
 */
public class Principal extends javax.swing.JFrame {

    private Campeonato c;
    private ArrayList<String[]> tabela = new ArrayList<>();

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        c = Controlador_Campeonato.criarCampeonato("Grande Prêmio das Lolis");
        Controlador_Campeonato.iniciaCampeonato(c);

        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getModel().addTableModelListener(new TableModelListener() {
            public void tableChanged(TableModelEvent e) {
                System.out.println(e);
            }
        });

    }

    public enum Delays {
        TROCA_CORRIDA(3), TEMPO_CORRER(100), TEMPO_ABASTECER(1000), TEMPO_TROCAR_PNEU(500);
        public final long v;

        private Delays(long v) {
            this.v = v;
        }

        public long getV() {
            return v;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tituloCorrida = new javax.swing.JLabel();
        jLabelEstadoPista = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Posição", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Estado", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Equipe", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Combustível", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "", "Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6", "Carro 7", "Carro 8", "Carro 9", "Carro 10", "Carro 11", "Carro 12", "Carro 13", "Carro 14", "Carro 15", "Carro 16", "Carro 17", "Carro 18", "Carro 19", "Carro 20"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tituloCorrida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloCorrida.setText("Corrida N°: 10");

        jLabelEstadoPista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEstadoPista.setText("Tempo: Ensolarado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloCorrida, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstadoPista, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(791, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tituloCorrida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelEstadoPista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws InterruptedException {
        Principal p = new Principal();
        p.setVisible(true);

        ArrayList<Carro> classificacao = new ArrayList<>();
        int cont = 0;
        int num = 1;

        int contClima = 0; //Contador para limitar mudança de tempo
        int tempoChuva = 0; // Variável para marcar quantas iterações a chuva vai durar

        for (Corrida corrida : p.c.getCorridas()) {
            boolean corrida_terminou = false;
            Controlador_TelaCorrida.setTituloCorrida(num++, corrida, p.tituloCorrida);

            contClima = 0;
            tempoChuva = 0;

            // Atualiza a tabela na tela-
            ArrayList<Carro> carros = corrida.geraPosicoes(Equipe.getCarros(
                    p.c.getEquipes()
            )
            );
            for (int i = 0; i < carros.size(); i++) {
                carros.get(i).setPosicao(i + 1);
            }
            Controlador_TelaCorrida.atualizarTelaCorrida(p.jTable1, p.c, corrida,
                    Equipe.getCarros(p.c.getEquipes())
            );

            TimeUnit.SECONDS.sleep(Delays.TROCA_CORRIDA.getV());

            for (Carro carro : carros) {
                carro.setEstado(Carro.Estados.CORRENDO);
                carro.mover();
            }

            float distancia_pista = corrida.getDistancia_pista();

            // LOOP GERAL DE MOVIMENTAÇÃO DA CORRIDA
//            Armazena os carros que finalizaram a corrida
            ArrayList<Carro> finalizados = new ArrayList<Carro>();

            while (!corrida_terminou) {
                corrida_terminou = true;
                //Representa cada instante da corrida
                ArrayList<Carro> correndo = new ArrayList<Carro>();

                for (Carro carro : carros) {

                    if (carro.getEstado() == Carro.Estados.TROCANDO_PNEU) {
                        carro.decrementaTempoParado((int) Delays.TEMPO_CORRER.getV()); //decrementa o tempo de espera
                        if (carro.getTempoParado() <= 0) {
                            carro.setEstado(Carro.Estados.CORRENDO);
                            carro.setTempoParado(0);
                        }
                        //carro.setEstado(Carro.Estados.TROCANDO_PNEU);
                    }
                    if (carro.getEstado() == Carro.Estados.ABASTECENDO) {
                        carro.decrementaTempoParado((int) Delays.TEMPO_CORRER.getV());//decrementa o tempo de espera
                        if (carro.getTempoParado() <= 0) {
                            carro.setEstado(Carro.Estados.CORRENDO);
                            carro.setTempoParado(0);
                        }
                    }

                    if (carro.getEstado() != Carro.Estados.CORRIDA_FINALIZADA && carro.getEstado() != Carro.Estados.QUEBRADO) {
                        corrida_terminou = false;
                        carro.setEstado(Carro.Estados.CORRENDO);
                        if (carro.getDistancia() > distancia_pista) { // Carro terminou a corrida
                            if (carro.getVolta() == corrida.getNumero_voltas()) {
                                carro.setDistancia(0.0f);//Se o carro terminou a corrida, ele deve estar parado na linha de chegada
                                carro.setEstado(Carro.Estados.CORRIDA_FINALIZADA);
                                finalizados.add(carro);
                                if (cont < 10) {
                                    classificacao.add(carro);
                                    cont++;
                                }

                            } else { // Correndo normal
                                carro.incrementeVoltas();
                                carro.setDistancia(carro.getDistancia() - distancia_pista);
                            }
                        }
                        if (carro.getEstado() != Carro.Estados.CORRIDA_FINALIZADA) {
                            carro.mover();

                            if (carro.calculaAbastecer(distancia_pista, corrida.getNumero_voltas())) {
                                carro.abasteceCarro(); //abastece o carro
                                carro.setEstado(Carro.Estados.ABASTECENDO);
                                carro.setTempoParado((int) Delays.TEMPO_ABASTECER.getV());
                            }
                            ArrayList<Carro> acidentados = corrida.verificaColisao(
                                    corrida.getClima(), p.c.getEquipes()
                            );

                            if (!acidentados.isEmpty()) {
                                for (Carro c : acidentados) {
                                    //Já que a função verificaColisao inclui os carros que já finalizaram a corrida 
                                    //aqui é neccessário fazer essa verificação para não alterar os estados deles
                                    if (c.getEstado() != Carro.Estados.CORRIDA_FINALIZADA) {
                                        c.setEstado(Carro.Estados.QUEBRADO);
                                    }
                                }
                            }

                            if (carro.furaPneu()) {
                                carro.setEstado(Carro.Estados.PNEU_FURADO);
                                carro.setTempoParado((int) Delays.TEMPO_TROCAR_PNEU.getV());
                            }
                            correndo.add(carro);
                        }
                        //VERIFICAR PNEU FUROU
                        // boolean furouPneu() --> metodoIntermedarioCalculaProbabilidadeFurar()
                        //se furou irParaBox(tempoEspera) --> deixa o carro parado por um tempo, alterando seu estado
                        //VERIFICAR TROCAR PNEU
                    }
                }

                if (contClima == 1) { // Controlar o tempo da chuva
                    tempoChuva++;
                }

                if (corrida.calculaChuva() && contClima < 2) {
                    if (corrida.ensolarado()) {
                        p.chamaAlteraJLabel2("Chuvoso"); //atualiza interface para Chuvoso
                        corrida.setClimaChuva();
                        for (Carro carro : carros) {
                            carro.setDesempenho(.8f);
                        }
                        contClima++;
                    }

                    //atualiza estatisticas de corrida
                    //atualiza velocidade dos carros
                    //troca pneu
                } else if (contClima < 2 && tempoChuva > 5) {
                    if (corrida.chovendo()) {
                        p.chamaAlteraJLabel2("Ensolarado");
                        corrida.setClimaSol();
                        for (Carro carro : carros) {
                            carro.setDesempenho(1f);
                        }
                        contClima++;
                    }
                }

                Carro.ComparadorPosicaoCarro cp = null;
                cp = new Carro.ComparadorPosicaoCarro();
                carros.sort(cp);

                for (int i = 0; i < finalizados.size(); i++) {
                    finalizados.get(i).setPosicao(i + 1);
                }

                //AQUI ROLAM TODAS AS PARADA INSANAS
                //VERIFICAR MUDANCA DE CLIMA
                //VERICIAR ACIDENTE
                TimeUnit.MILLISECONDS.sleep(5 * Delays.TEMPO_CORRER.getV());
                // Atualiza a tabela na tela-
                Controlador_TelaCorrida.atualizarTelaCorrida(p.jTable1, p.c,
                        corrida, Equipe.getCarros(p.c.getEquipes()));

            }
            //Corrida terminou, voltar todos os carros pro estado de esperando largada
            for (Carro carro : Equipe.getCarros(p.c.getEquipes())) {
                carro.setEstado(Carro.Estados.AGUARDANDO_LARGADA);
                carro.setDistancia(0);
            }
            
            ClassificacaoCorrida classific = new ClassificacaoCorrida(classificacao, p.c.getEquipes(), corrida);
            classific.setVisible(true);
            TimeUnit.SECONDS.sleep(10);
            classific.setVisible(false);
            classificacao = new ArrayList<>();
            cont = 0;
        }
//            TODO: Exibir tela de pontuação da corida
//            TimeUnit.SECONDS.sleep(8 + Delays.TROCA_CORRIDA.getV());

        ClassificacaoCampeonato classificCamp = new ClassificacaoCampeonato(p.c.getEquipes());
        classificCamp.setVisible(true);
        TimeUnit.SECONDS.sleep(10);
        classificCamp.setVisible(false);
    }

    private static void alteraJLabel2(String str, javax.swing.JLabel label) {
        label.setText("Tempo: " + str);
    }

    private void chamaAlteraJLabel2(String str) {
        this.alteraJLabel2(str, this.jLabelEstadoPista);
    }

    private javax.swing.JLabel getLable() {
        return this.jLabelEstadoPista;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelEstadoPista;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel tituloCorrida;
    // End of variables declaration//GEN-END:variables
}
