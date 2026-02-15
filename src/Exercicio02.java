package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main (String [] args){

    Scanner scanner = new Scanner(System.in);
    double side;
    System.out.print("Digite o lado do quadrado: ");
    side = scanner.nextDouble();
    double area;
    area = side * side;

    System.out.println("A área do quadrado é: " + area);

    }
}
