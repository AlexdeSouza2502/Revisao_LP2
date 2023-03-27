/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Caminhoneiro;
import model.Carreta;
import model.Cliente_Array;
import model.Viagem;
import java.util.ArrayList;
/**
 *
 * @author 13304611690
 */
public class Main {

    



    public static void main(String[] args) {
        // Instanciando objetos
        Carreta carreta1 = new Carreta( "Modelo 1");
        Caminhoneiro c1 = new Caminhoneiro("João", "123456789", "987654321", 3000.0);
        Viagem viagem1 = new Viagem("Destino 1", 2.5, 100.0);
        Cliente_Array cliente1 = new Cliente_Array("Joana", c1, viagem1, carreta1);

        Carreta carreta2 = new Carreta( "Modelo 2");
        Caminhoneiro c2 = new Caminhoneiro("Maria", "987654321", "123456789", 3500.0);
        Viagem viagem2 = new Viagem("Destino 2", 3.0, 150.0);
        Cliente_Array cliente2 = new Cliente_Array("Cliente 2", c2, viagem2, carreta2);

        // Criando um ArrayList de clientes e adicionando os objetos
        ArrayList<Cliente_Array> clientes = new ArrayList<Cliente_Array>();
        clientes.add(cliente1);
        clientes.add(cliente2);

        // Percorrendo o ArrayList e chamando o método visualizarViagem de cada objeto Cliente
        for (Cliente_Array cliente : clientes) {
            cliente.visualizarViagens();
            System.out.println("---------------------------------");
        }
    }
}

