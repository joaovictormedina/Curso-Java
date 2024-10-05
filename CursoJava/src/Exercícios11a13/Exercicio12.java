package Exercícios11a13;

import java.util.Scanner;

	public class Exercicio12 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a altura da pessoa em metros: ");
	        double altura = scanner.nextDouble();

	        double pesoIdeal = (72.7 * altura) - 58;

	        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

	        scanner.close();
	    }
	}
