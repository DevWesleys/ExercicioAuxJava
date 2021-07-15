package br.com.javaaux;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
	 	double x1,x2,y1,y2;
		double p1,p2;
		double d;

		System.out.println("Digite o valor de X do primeiro PONTO: ");
		x1 = ler.nextDouble();
		
		System.out.println("Digite o valor de y do primeiro PONTO: ");
		y1 = ler.nextDouble();

		System.out.println("Digite o valor de X do segundo PONTO: ");
		x2 = ler.nextDouble();
		
		System.out.println("Digite o valor de y do segundo PONTO: ");
		y2 = ler.nextDouble();
  
		p1 = Math.pow((x2-x1), 2.0);
		p2 = Math.pow((y1-y2), 2.0);

		d = Math.sqrt(p1+p2);


		System.out.println("A distancia de P1 para P2 é:  " + d);

		
	}

}
