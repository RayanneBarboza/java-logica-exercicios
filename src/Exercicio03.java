package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int birthYear;
        System.out.print("Qual seu nome? ");
        name = scanner.nextLine();
        System.out.print("Qual seu ano de nascimento? ");
        birthYear = scanner.nextInt();
        int currentYear = 2026;
        int age;

        age = currentYear - birthYear;
        System.out.println("Olá " + name + ", você tem " + age + " anos!");

    }
}


