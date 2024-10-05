package Exercícios11a13;

import java.util.Scanner;

	public class Exercicio13 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a altura da pessoa em metros: ");
	        double altura = scanner.nextDouble();

	        System.out.print("Digite o sexo da pessoa (M para masculino, F para feminino): ");
	        char sexo = scanner.next().toUpperCase().charAt(0);

	        double pesoIdeal;

	        if (sexo == 'M') {
	            pesoIdeal = (72.7 * altura) - 58;
	        } else if (sexo == 'F') {
	            pesoIdeal = (62.1 * altura) - 44.7;
	        } else {
	            System.out.println("Sexo inválido. Por favor, digite M ou F.");
	            scanner.close();
	            return;
	        }

	        System.out.print("Digite o peso da pessoa em kg: ");
	        double peso = scanner.nextDouble();

	        System.out.println("O peso ideal é: " + pesoIdeal + " kg");

	        if (peso < pesoIdeal) {
	            System.out.println("A pessoa está abaixo do peso ideal.");
	        } else if (peso > pesoIdeal) {
	            System.out.println("A pessoa está acima do peso ideal.");
	        } else {
	            System.out.println("A pessoa está no peso ideal.");
	        }

	        scanner.close();
	    }
	}
