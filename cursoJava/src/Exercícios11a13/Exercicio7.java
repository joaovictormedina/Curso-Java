package Exercícios11a13;

import java.util.Scanner;

	public class Exercicio7 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o valor do lado do quadrado: ");
	        double lado = scanner.nextDouble();

	        double area = lado * lado;
	        double dobroArea = 2 * area;

	        System.out.println("A área do quadrado é: " + area);
	        System.out.println("O dobro da área do quadrado é: " + dobroArea);

	        scanner.close();
	    }
	}
