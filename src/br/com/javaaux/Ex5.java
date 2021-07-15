package br.com.javaaux;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int n1,n2,n3,np1,np2,np3,soma;
		double media;
		
		System.out.println("Digite a primeira nota: ");
		n1 = ler.nextInt();
		
		System.out.println("Digite a segunda nota: ");
		n2 = ler.nextInt();
		
		System.out.println("Digite a terceira nota: ");
		n3 = ler.nextInt();
   

		np1 = n1 * 2;
		np2 = n2 * 3;
		np3 = n3 * 5;
		
		soma = np1+np2+np3;
		media= soma/10;

System.out.println("A média do aluno é: " +media);
		
	}

	
}

	


