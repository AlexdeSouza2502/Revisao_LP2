/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 13304611690
 */
public class Viagem {
  private String destino;
    private double valorKM;
    private double valorViagem;
    private double distancia;

    public Viagem(String destino, double valorKM, double distancia) {
        this.destino = destino;
        this.valorKM = valorKM;
        this.distancia = distancia;
    }

    public void calcularViagem() {
        this.valorViagem = this.valorKM * this.distancia;
    }

    public String getDestino() {
        return destino;
    }

    public double getValorKM() {
        return valorKM;
    }

    public double getDistancia() {
        return distancia;
    }

    public double getValorViagem() {
        return valorViagem;
    }
    
}