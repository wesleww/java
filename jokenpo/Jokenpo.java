/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jokenpo;

import java.util.Scanner;

public class Jokenpo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("JOKENPO");

        System.out.println("Escolha sua jogada: ");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");

        int jogadaUsuario = scanner.nextInt();
        int jogadaComputador = (int) (Math.random() * 3) + 1;

        System.out.println("O computador escolheu " + jogadaComputador);
      
            if (jogadaUsuario == jogadaComputador) {
                System.out.println("Empate!");
            } else if (jogadaUsuario == 1 && jogadaComputador == 3
                    || jogadaUsuario == 2 && jogadaComputador == 1
                    || jogadaUsuario == 3 && jogadaComputador == 2) {
                System.out.println("Voce venceu !");
            } else {
                System.out.println("Voce perdeu !");
            }
        
    }
}

