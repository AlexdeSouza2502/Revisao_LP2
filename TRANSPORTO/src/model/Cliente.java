/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author 13304611690
 */
public class Cliente {
   
  
    private String nome;
    private String cpf;
    private String rg;
    private Caminhoneiro c1;
    private Viagem viagem1;
    private Carreta carreta1;

    public Cliente(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.viagem1 = viagem1;
        this.carreta1 = carreta1;
    }

    public void visualizarViagem() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Nome do caminhoneiro: " + this.c1.getNome());
        System.out.println("Modelo da carreta: " + this.carreta1.getModeloCarreta());
        System.out.println("Destino da viagem: " + this.viagem1.getDestino());
        System.out.println("Valor do KM: " + this.viagem1.getValorKM() + ", Distância percorrida: " + this.viagem1.getDistancia());
        System.out.println("Valor total da viagem: " + this.viagem1.getValorViagem());
    }
}
