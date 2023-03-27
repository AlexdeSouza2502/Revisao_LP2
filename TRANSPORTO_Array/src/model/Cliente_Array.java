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

   import java.util.ArrayList;

public class Cliente_Array {
    private String nome;
    private String cpf;
    private String rg;
    private Caminhoneiro c1;
    private Carreta carreta1;
    private ArrayList<Viagem> viagens;

    public Cliente_Array(String nome, Caminhoneiro c1, Viagem viagem1, Carreta carreta1) {
        this.nome = nome;
        this.c1 = c1;
        this.carreta1 = carreta1;
        this.viagens = new ArrayList<Viagem>();
        adicionarViagem(viagem1);
    }

    //...

    public void adicionarViagem(Viagem viagem) {
        this.viagens.add(viagem);
    }

    public void visualizarViagens() {
        System.out.println("Nome do cliente: " + this.nome);
        System.out.println("Nome do caminhoneiro: " + this.c1.getNome());
        System.out.println("Nome da carreta: " + this.carreta1.getModeloCarreta());
        System.out.println("Viagens:");
        for (Viagem viagem : this.viagens) {
            System.out.println("Destino da viagem: " + viagem.getDestino());
            System.out.println("Valor do KM: " + viagem.getValorKM() + ", Distância percorrida: " + viagem.getDistancia());
            System.out.println("Valor total da viagem: " + viagem.getValorViagem());
            System.out.println("---------------------------------");
        }
    }
}


