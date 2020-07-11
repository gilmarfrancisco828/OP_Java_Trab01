package java_projeto;

import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author Matheus
 */
public class Carro  {
    
    
    public static class ComparadorCarro implements Comparator<Carro>{
        
        @Override
        public  int compare(Carro c1, Carro c2) {
            Float d1 = c1.getDistancia();
            Float d2 = c2.getDistancia();
            
            return d1.compareTo(d2);
        }        
    }  
    
    public static class ComparadorPosicaoCarro implements Comparator<Carro>{
        @Override
        public  int compare(Carro c1, Carro c2) {
            Integer voltaCarro1 = c1.getVolta();
            Integer voltaCarro2 = c2.getVolta();
            
            if(voltaCarro1 != voltaCarro2){
                return voltaCarro1.compareTo(voltaCarro2)*(-1);
            }
            Float d1 = c1.getDistancia();
            Float d2 = c2.getDistancia();
            return d1.compareTo(d2)*(-1);
        }
    }
    
    
    
    private int id;
    private int volta;
    private float distancia;
    private float combustivel;
    private Estados estado;
    private int tempoParado;
    private float desempenho;
    private String piloto;
    private int pontosCorrida;
    private int pontuacao;
    private Equipe equipe;
    private int posicao;
    private static float probabilidadeFurarPneu = 0.01f;
 

    
    public enum Estados{
        AGUARDANDO_LARGADA,
        QUEBRADO,
        PNEU_FURADO,
        SEM_COMBUSTIVEL,
        CORRENDO,
        ABASTECENDO,
        TROCANDO_PNEU,
        PUNIDO,
        CORRIDA_FINALIZADA
    }

    public Carro(int id, String piloto, Equipe e) {
        this.id = id;
        this.volta = 0;
        this.distancia = 0;
        this.combustivel = 100;
        this.estado = Estados.AGUARDANDO_LARGADA;
        this.tempoParado = 0;
        this.desempenho = 1;
        this.piloto = piloto;
        this.pontosCorrida = 0;
        this.pontuacao = 0;
        this.equipe = e;
    }

    public Equipe getEquipe(){
        return this.equipe;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getVolta() {
        return volta;
    }

    public void setVolta(int volta) {
        this.volta = volta;
    }
    public void incrementeVoltas() {
        this.volta++;
    }
    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    public void mover() {
        // Incrementar aqui para depois srr aleatório
        //this.distancia++;
        Random r = new Random();
        float value = r.nextFloat()*5;
        
//        System.out.println("Distância aleatória: "+value);
        this.distancia += value;
        this.decrementaCombustivel(value);
        
    }

    public float getDesempenho() {
        return desempenho;
    }

    public void setDesempenho(float desempenho) {
        this.desempenho = desempenho;
    }
    
    

    public int getTempoParado() {
        return tempoParado;
    }

    public void setTempoParado(int tempoParado) {
        this.tempoParado = tempoParado;
    }
    
    public void decrementaTempoParado(int tempo){
        this.tempoParado = this.tempoParado - tempo;
    }

    public float getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(float combustivel) {
        this.combustivel = combustivel;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public int getPosicao(){
        return this.posicao;
    }
    
    public void decrementaCombustivel(float dec){
        
        float percent = dec/120f;
        
        this.combustivel -= percent;
        
//        if(this.combustivel <= 0){
//            this.combustivel = (float) 100.0;
//        }
    }
    public Estados getEstado() {
        return estado;
    }
    public String getEstadoString(){
        switch(this.estado){
            case AGUARDANDO_LARGADA:
                return "A. Largada";
            case ABASTECENDO:
                return "Abastecendo";
            case CORRENDO:
                return "Correndo";
            case PNEU_FURADO:
                return "Pneu Furado";
            case CORRIDA_FINALIZADA:
                return "C. Finalizada";
            case PUNIDO:
                return "Punido";
            case QUEBRADO:
                return "Quebrado";
            case SEM_COMBUSTIVEL:
                return "Sem Combustível";
            case TROCANDO_PNEU:
                return "Trocando Pneu";
        }
        return "Estado Inválido";
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }
    
    public String getPiloto() {
        return piloto;
    }

    public int getPontosCorrida() {
        return pontosCorrida;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public void setPontosCorrida(int pontosCorrida) {
        this.pontosCorrida = pontosCorrida;
    }
    
    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao += pontuacao;
    }
    
    public boolean calculaAbastecer(float tamanhoPista, int totalVoltas){
        double kmRestantes = this.calculaQuantosKmPodeCorrer();
        double kmAPercorrer = (tamanhoPista  - this.distancia);
        
        if(kmRestantes < kmAPercorrer){
            return true;
        }
        return false;
        
        
        
        
    }
    
    private double calculaQuantosKmPodeCorrer(){
        return (this.combustivel * 156) * .01;
//        156km --> desempenho do carro com um taque de 120L
    }
    
    public void abasteceCarro(){
        this.combustivel = 100;
    }
    
    
    public  boolean furaPneu(){
       float p = calculaProbabilidadeFurar();
       if(p<= Carro.probabilidadeFurarPneu){
           return true;
       }
       else{
           return false;
       }
   }
    
    private float calculaProbabilidadeFurar(){
        Random r = new Random();
        float value = r.nextInt(101)*.01f;
        return value;
    }
    
    
}

