package org.example;

import java.util.Scanner;

public class TesteVeiculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando o veículo
        System.out.print("Digite a carga máxima do veículo (em kg): ");
        double cargaMaxima = scanner.nextDouble();
        Veiculo veiculo = new Veiculo(cargaMaxima);
        System.out.println("Veículo criado com carga máxima de " + cargaMaxima + " kg");

        int numeroCaixa = 1;
        String continuar;

        do {
            // Lê o peso da caixa
            System.out.print("Digite o peso da caixa número " + numeroCaixa + " (em kg): ");
            double pesoCaixa = scanner.nextDouble();

            // Tenta adicionar a caixa
            boolean resultado = veiculo.adicionarCaixa(pesoCaixa);
            System.out.println("Adicionando caixa número " + numeroCaixa + " (" + pesoCaixa + "kg): " + resultado);

            numeroCaixa++;

            // Pergunta se deseja continuar
            System.out.print("Deseja adicionar outra caixa? (s/n): ");
            continuar = scanner.next();

        } while (continuar.equalsIgnoreCase("s"));

        // Exibe carga final
        System.out.println("A carga do veículo é: " + veiculo.getCarga() + " kg");

        scanner.close();
    }
}
