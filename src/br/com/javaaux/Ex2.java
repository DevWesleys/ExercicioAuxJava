package br.com.javaaux;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		int dias;
		int meses;
		int anos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Dias: ");
		dias = ler.nextInt();
		
		anos = (dias / 365);
	    meses = (dias % 365)/ 30;
	    dias = (dias % 365)% 30;
		
		System.out.printf("Voce tem: " + anos + " Anos ");
		System.out.printf("\nVoce tem: " + meses + " Meses ");
		System.out.printf("\nVoce tem: " + dias + " Dias ");
	}

}
