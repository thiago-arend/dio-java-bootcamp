package org.example;

import java.util.Scanner;

public class OutroLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalScores = 0;
        double totalScore = 0;
        double currScore = 0;
        while (currScore != -1) {
            System.out.println("Diga sua avaliação para o filme ou -1 para sair:");
            currScore = input.nextDouble();

            if (currScore != -1) {
                totalScore += currScore;
                totalScores++;
            }
        }

        System.out.println("\nA média das avaliações é de " + totalScore / totalScores);
    }
}
