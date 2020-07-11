/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controladores.Controlador_Campeonato;
import controladores.Controlador_TelaCorrida;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java_projeto.Campeonato;
import java_projeto.Carro;
import java_projeto.Corrida;
import java_projeto.Equipe;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableColumn;

/**
 *
 * @author Matheus
 */
public class Principal extends javax.swing.JFrame {

    private Campeonato c;
    private ArrayList<String[]> tabela = new ArrayList<>();
    
    private static int velocidadeExe; //Velocidade de execução da simulação
    
    public int getSpinnerVelocidade(){
        int aux = (int)spinnerVelocidade.getValue();
        return aux;
    }
    
    public void setSpinnerVelocidade(int vel){
        spinnerVelocidade.setValue(vel);
    }

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

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/imagem1.jpg"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tituloCorrida = new javax.swing.JLabel();
        jLabelEstadoPista = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        spinnerVelocidade = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1920, 1080));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Posição", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Estado", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Equipe", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {"Combustível", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Piloto:", "Carro 1", "Carro 2", "Carro 3", "Carro 4", "Carro 5", "Carro 6", "Carro 7", "Carro 8", "Carro 9", "Carro 10", "Carro 11", "Carro 12", "Carro 13", "Carro 14", "Carro 15", "Carro 16", "Carro 17", "Carro 18", "Carro 19", "Carro 20"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setFillsViewportHeight(true);
        jTable1.setName(""); // NOI18N
        jTable1.setOpaque(false);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Começar simulação");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tituloCorrida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        tituloCorrida.setForeground(new java.awt.Color(255, 255, 255));
        tituloCorrida.setText("Corrida N°: 10");

        jLabelEstadoPista.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEstadoPista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEstadoPista.setText("Tempo: Ensolarado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Velocidade da Simulação:");

        spinnerVelocidade.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Sylfaen", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Simulador de Fórmula 1");

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(tituloCorrida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabelEstadoPista, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(spinnerVelocidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(640, 640, 640)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(spinnerVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1725, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(tituloCorrida, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelEstadoPista))))))
                .addGap(34, 53, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(79, 79, 79)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstadoPista)
                    .addComponent(tituloCorrida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(476, 476, 476)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerVelocidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(203, 203, 203))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        p.setSpinnerVelocidade(1);
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
                
                velocidadeExe = p.getSpinnerVelocidade();
                
                
                corrida_terminou = true;
                //Representa cada instante da corrida
                ArrayList<Carro> correndo = new ArrayList<Carro>();

                for (Carro carro : carros) {

                    if (carro.getEstado() == Carro.Estados.TROCANDO_PNEU) {
                        carro.decrementaTempoParado(((int) Delays.TEMPO_CORRER.getV())/(velocidadeExe)); //decrementa o tempo de espera
                        if (carro.getTempoParado() <= 0) {
                            carro.setEstado(Carro.Estados.CORRENDO);
                            carro.setTempoParado(0);
                        }
                        //carro.setEstado(Carro.Estados.TROCANDO_PNEU);
                    }
                    if (carro.getEstado() == Carro.Estados.ABASTECENDO) {
                        carro.decrementaTempoParado(((int) Delays.TEMPO_CORRER.getV())/(velocidadeExe));//decrementa o tempo de espera
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
                                carro.setTempoParado(((int) Delays.TEMPO_ABASTECER.getV())/(velocidadeExe));
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
                                carro.setTempoParado(((int) Delays.TEMPO_TROCAR_PNEU.getV())/(velocidadeExe));
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
                correndo.sort(cp);
                int i = 0;
                for (; i < finalizados.size(); i++) {
                    finalizados.get(i).setPosicao(i + 1);
                }
                for (Carro carro : correndo) {
                    carro.setPosicao(i + 1);
                    i++;
                }
                ArrayList<Carro> posicoes = new ArrayList<>();
                posicoes.addAll(finalizados);
                posicoes.addAll(correndo);
                //AQUI ROLAM TODAS AS PARADA INSANAS
                //VERIFICAR MUDANCA DE CLIMA
                //VERICIAR ACIDENTE
                TimeUnit.MILLISECONDS.sleep(5 * (Delays.TEMPO_CORRER.getV())/(velocidadeExe));
                // Atualiza a tabela na tela-
                Controlador_TelaCorrida.atualizarTelaCorrida(p.jTable1, p.c,
                        corrida, posicoes);
            }
            //Corrida terminou, voltar todos os carros pro estado de esperando largada
            
            p.setSpinnerVelocidade(1);
            
            for (Carro carro : Equipe.getCarros(p.c.getEquipes())) {
                carro.setEstado(Carro.Estados.AGUARDANDO_LARGADA);
                carro.setDistancia(0);
                carro.setVolta(0);
                carro.setCombustivel(100.0f);
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
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelEstadoPista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spinnerVelocidade;
    private javax.swing.JLabel tituloCorrida;
    // End of variables declaration//GEN-END:variables
}
