package Exercícios11a13;

import java.util.Scanner;

	public class Exercício9 {
		
	    public static void main(String[] args) {
	    
	    Scanner scanner = new Scanner(System.in);

	    System.out.print("Digite a temperatura em graus Fahrenheit: ");
	    double fahrenheit = scanner.nextDouble();

	    double celsius =  5 * (fahrenheit - 32) / 9;

	    System.out.println("A temperatura em graus Celsius é: " + celsius);

	        scanner.close();
	    }
	}
