package org.example;

public class Veiculo {
    private double carga;
    private double cargaMaxima;


    public Veiculo(double cargaMaxima) {
        this.cargaMaxima = quilosParaNewtons(cargaMaxima);
    }


    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getCarga() {
        return newtonParaQuilos(carga);
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double getCargaMaxima() {
        return newtonParaQuilos(cargaMaxima);
    }


    public boolean adicionarCaixa(double peso) {
        double pesoEmNewtons = quilosParaNewtons(peso);
        if (this.carga + pesoEmNewtons > this.cargaMaxima)
            return false;
        this.carga+= pesoEmNewtons;
        return true;
    }
    private double newtonParaQuilos (double peso ){
     return  peso/9.8;
    }
    private double quilosParaNewtons  (double peso ) {
        return peso * 9.8;
    }















}


