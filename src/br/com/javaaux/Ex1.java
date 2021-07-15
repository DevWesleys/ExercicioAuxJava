package br.com.javaaux;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double diasano = 365;
		double diasmes = 30;
		int dias;
		int meses;
		int anos;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a sua idade.");
		System.out.print("Anos: ");
		anos = leitor.nextShort();
		
		System.out.print("Meses: ");
		meses = leitor.nextShort();
		
		System.out.print("Dias: ");
		dias = leitor.nextShort();
		
		dias += (anos * diasano) + (meses * diasmes);
		
		System.out.println("\n\nA sua idade em dias é " + dias);
	}

}
