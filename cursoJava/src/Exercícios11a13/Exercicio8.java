package Exercícios11a13;

import java.util.Scanner;

	public class Exercicio8 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite quanto você ganha por hora: ");
	        double ganhoPorHora = scanner.nextDouble();

	        System.out.print("Digite o número de horas trabalhadas no mês: ");
	        double horasTrabalhadas = scanner.nextDouble();

	        double salarioTotal = ganhoPorHora * horasTrabalhadas;

	        System.out.println("Seu salário total no mês é: R$ " + salarioTotal);

	        scanner.close();
	    }
	}
