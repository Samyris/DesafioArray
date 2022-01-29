package array;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas quer informar?");
		int qtd = entrada.nextInt();
		   double[] notasAluno = new double[qtd]; 
		
		for(int i=0; i<notasAluno.length ; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notasAluno[i] = entrada.nextDouble();
		}
		double total=0;
		for(double nota: notasAluno) {
			total +=nota;
		}
		
		double media = total/notasAluno.length;
		System.out.println("A média é: " +media );			
		
		entrada.close();
	}
}