package java_projeto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java_projeto.Carro.ComparadorCarro;

/**
 *
 * @author Matheus
 */
public class Corrida {

    public enum Clima {
        CHUVA, ENSOLARADO
    }

    private float distancia_pista;
    private int numero_voltas;
    private int dificuldade_pista;
    private float probabilidade_chuva;
    private Clima clima;
    private String cidade;

    public Corrida(float distancia_pista,  int dificuldade_pista, float probabilidade_chuva, String cidade) {
        this.setDistancia_pista(distancia_pista);
        this.dificuldade_pista = dificuldade_pista;
        this.probabilidade_chuva = probabilidade_chuva;
        this.cidade = cidade;
        this.clima = Clima.ENSOLARADO;
    }

    public Clima getClima() {
        return clima;
    }

    public boolean chovendo() {
        if (clima == Clima.CHUVA) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ensolarado() {
        if (clima == Clima.ENSOLARADO) {
            return true;
        } else {
            return false;
        }
    }

    public void setClimaChuva() {
        this.clima = Clima.CHUVA;
    }

    public void setClimaSol() {
        this.clima = Clima.ENSOLARADO;
    }

    public float getDistancia_pista() {
        return distancia_pista;
    }

    public void setDistancia_pista(float distancia_pista) {
        this.distancia_pista = distancia_pista;
        this.setNumero_voltas( (int)Math.ceil(305f/distancia_pista) );
    }

    public int getNumero_voltas() {
        return numero_voltas;
    }

    public void setNumero_voltas(int numero_voltas) {
        this.numero_voltas = numero_voltas;
    }

    public int getDificuldade_pista() {
        return dificuldade_pista;
    }

    public void setDificuldade_pista(int dificuldade_pista) {
        this.dificuldade_pista = dificuldade_pista;
    }

    public float getProbabilidade_chuva() {
        return probabilidade_chuva;
    }

    public void setProbabilidade_chuva(float probabilidade_chuva) {
        this.probabilidade_chuva = probabilidade_chuva;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Carro> geraPosicoes(ArrayList<Carro> carros) {
        ArrayList<Carro> ordemLargada = new ArrayList<>();

        for (Carro c : carros) {
            ordemLargada.add(c);
        }

        Collections.shuffle(ordemLargada);
        
        int cont = carros.size();
        
        for(Carro carro:ordemLargada)
            carro.setDistancia(.01f*cont--);         
        
        return ordemLargada;
    }

    public boolean calculaChuva() {
        Random r = new Random();
        int value = r.nextInt(101);
        if ((this.probabilidade_chuva * 100) < value) {
            return false;
        }
        return true;
    }

    public ArrayList<Carro> verificaColisao(Clima clima, ArrayList<Equipe> equipe) {
        ArrayList<Carro> carros = new ArrayList<Carro>();
        for (Equipe e : equipe) {
            for (int i = 0; i < 2; i++) {
                if (e.getCarro(i).getEstado() != Carro.Estados.CORRIDA_FINALIZADA && e.getCarro(i).getEstado() != Carro.Estados.QUEBRADO) {
                    carros.add(e.getCarro(i));
                }
            }
        }
        Carro.ComparadorCarro cc = null;
        cc = new Carro.ComparadorCarro();
        carros.sort(cc);
        ArrayList<Carro> acidentados = new ArrayList<>();
        float probabilidade = .001f;

        for (Carro c : carros) {
            for (int i = 0; i < carros.size(); i++) {
                if (c.getId() != carros.get(i).getId()) {
                    float d1 = c.getDistancia();
                    float d2 = carros.get(i).getDistancia();
                    if (d1 >= d2-.005f && d1<= d2+.005f) {
                        if (ocorreuAcidente(clima, probabilidade)) {
                            System.out.println("Acidente!");
                            if (!acidentados.contains(c)) {
                                acidentados.add(c);
                            }
                            if (!acidentados.contains(carros.get(i))) {
                                acidentados.add(carros.get(i));
                            }
                        }
                    }
                }
            }
        }
        for (Carro c : acidentados) {
//            System.out.println("Acidentado: " + c.getId());
        }

        return acidentados;
    }

    private boolean ocorreuAcidente(Clima clima, float prob) {
        Random r = new Random();
        float value = (r.nextInt(101)+1) * .01f;

        if (clima == Clima.CHUVA) {
            prob += prob*.22;
            if (value < prob) {
                System.out.println(value);
                return true;
            }
            return false;
        }

        if (value < prob) {
            System.out.println(value);
            return true;
        }
        return false;
    }

}
