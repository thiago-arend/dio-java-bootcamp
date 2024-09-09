package org.example;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu filme favorito:");
        String movie = input.nextLine();

        System.out.println("Digite o ano do filme:");
        int year = input.nextInt();

        System.out.println("Digite sua nota para o filme:");
        double rating = input.nextDouble();

        System.out.printf("(%d) - %s [%.2f]", year, movie, rating);
    }
}
