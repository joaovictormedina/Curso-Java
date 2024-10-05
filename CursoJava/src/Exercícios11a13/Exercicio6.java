package Exercícios11a13;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = 3.14 * (raio * raio);

        System.out.println("A área do círculo é: " + area);

        scanner.close();
    }
}
