/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Caminhoneiro;
import model.Carreta;
import model.Cliente;
import model.Viagem;

/**
 *
 * @author 13304611690
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Carreta carreta1 = new Carreta("Scania");
        Caminhoneiro c1 = new Caminhoneiro("João", "123456789", "987654321", 2500.00);
        Viagem viagem1 = new Viagem("São Paulo", 2.50, 500.00);
        Cliente cliente1 = new Cliente("Maria", c1, viagem1, carreta1);

        viagem1.calcularViagem();
        cliente1.visualizarViagem();
    }
    }
    

