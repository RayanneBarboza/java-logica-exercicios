import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Digite seu ano de nascimento: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2026;

        int idade = anoAtual - anoNascimento;

        System.out.println("Olá, " + name + "." + " Você tem " + idade + " anos!");

    }
}

