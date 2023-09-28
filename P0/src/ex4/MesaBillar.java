package ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MesaBillar {

    private ArrayList<BolaBillar> cajetin;
    private ArrayList<BolaBillar> bolasMesa;
    private boolean started;

    public MesaBillar(){
        started = false;
        cajetin = new ArrayList<>();
        bolasMesa = new ArrayList<>();
        cajetin.addAll(Arrays.asList(BolaBillar.values()));
    }

    public void iniciarPartida(){
        bolasMesa.addAll(Arrays.asList(BolaBillar.values()));
        cajetin.clear();
        started = true;
    }

    public void meterBola(int n){
        if(n!=8 && n != 0){
            if(n < 0 || n > 15 || bolasMesa.get(n) == null) throw new IllegalArgumentException();
            cajetin.add(bolasMesa.get(n));
            cajetin.sort(Comparator.naturalOrder());
            bolasMesa.set(n, null);
        }else if(n == 8) started = false;
    }

    public BolaBillar.TIPO obtenerGanador(){
        int rayadas = 0, lisas = -2;

        if(bolasMesa.isEmpty()) lisas = 0;
        else{
            for(BolaBillar bolas : bolasMesa){
                if(bolas != null){
                    if(bolas.getTipo().equals(BolaBillar.TIPO.RAYADA)) rayadas++;
                    else lisas++;
                }
            }
        }

        if(rayadas < lisas) return BolaBillar.TIPO.RAYADA;
        else if(rayadas > lisas) return BolaBillar.TIPO.LISA;
        else return null;
    }

    public ArrayList<BolaBillar> bolasCajetin(){
        return cajetin;
    }

    public ArrayList<BolaBillar> bolasMesa(){
        return bolasMesa;
    }

    public boolean esPartidaIniciada(){
        return started;
    }

}
