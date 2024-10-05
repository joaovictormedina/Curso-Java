package Exercícios11a13;

import java.util.Scanner;

	public class Exercicio11 {
	
		public static void main(String[] args) {
	    
			Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número inteiro: ");
	        int numero2 = scanner.nextInt();

	        System.out.print("Digite um número real: ");
	        double numeroReal = scanner.nextDouble();

	        double produto = (2 * numero1) * (numero2 / 2);
	        double soma = (3 * numero1) + numeroReal;
	        double cubo = numeroReal * numeroReal * numeroReal;

	        System.out.println("a) O produto do dobro do primeiro com metade do segundo é: " + produto);
	        System.out.println("b) A soma do triplo do primeiro com o terceiro é: " + soma);
	        System.out.println("c) O terceiro elevado ao cubo é: " + cubo);

	        scanner.close();
	    }
	}
