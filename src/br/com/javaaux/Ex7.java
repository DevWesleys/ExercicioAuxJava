package br.com.javaaux;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int a,b,c,d,E,f,x,y;

		System.out.println("o primeiro n é: ");
		a = ler.nextInt();
		
		System.out.println("o segundo n é: ");
		b = ler.nextInt();
		
		System.out.println("o terceito n é: ");
		c = ler.nextInt();
		
		System.out.println("o quarto n é: ");
		d = ler.nextInt();
				
		System.out.println("o quinto n é: ");
		E = ler.nextInt();
		
		System.out.println("o sexto n é: ");
		f = ler.nextInt();

		x =((c*E)-(b*f))/((a*E)-(b*d));
		y =((a*f)-(c*d))/((a*E)-(b*d));

		System.out.println("O valor de x é: " + x + " e o valor de y é: " + y);
		
	}
}



