/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author wesley.ssantos58
 */
public class Exercicios {

    public static void main(String[] args) {

        double n1 = 0, n2 = 0, n3 = 0, media = 0;
        int condicao ;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Gostaria de usar o programa? Digite 1 - sim 2 - nao");
        condicao = entrada.nextInt();
        Scanner saida = new Scanner(System.in);

        while (condicao == 1) {
            System.out.println("Digite a primeira nota: ");
            n1 = saida.nextDouble();
            System.out.println("Digite a segunda  nota: ");
            n2 = saida.nextDouble();
            System.out.println("Digite a terceira nota: ");
            n3 = saida.nextDouble();

            media = (n1 + n2 + n3) / 3;

            char conceito = 0;

            if (media >= 9) {
                conceito = 'A';
            } else if (media >= 8 && media <= 8.5) {
                conceito = 'B';
            } else if (media >= 7 && media <= 7.9) {
                conceito = 'C';
            } else if (media >= 6 && media <= 6.9) {
                conceito = 'D';
            } else if (media < 6) {
                conceito = 'E';
            }

            System.out.printf("media" + media + "\n");
            switch (conceito) {
                case 'A' ->
                    System.out.printf("Excelente \"n");

                case 'B' ->
                    System.out.printf("Bem feito" + '\n');
                case 'c' ->
                    System.out.printf("Bem feito" + '\n');

                case 'D' ->
                    System.out.printf("voce passou" + '\n');
                case 'E' ->
                    System.out.println("melhor Tente novamente" + '\n');
                default ->
                    System.out.println("conceito Invalida");

            }
            System.out.println("Quer fazer o exercicio novamente? Digite 1 -sim 2 - nao");
            condicao = entrada.nextInt();

        }
    }
}
