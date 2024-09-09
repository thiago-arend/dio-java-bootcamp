package org.example;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double totalScore = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Diga sua avaliação para o filme:");
            totalScore += input.nextDouble();
        }

        System.out.println("\nA média das avaliações é de " + totalScore / 3);
    }
}
