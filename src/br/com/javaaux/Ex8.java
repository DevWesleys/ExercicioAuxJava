package br.com.javaaux;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
	
		double imposto,distri,custofab,carnovo,distrimposto1,distrimposto2,distrimpostof;


		System.out.println("O custo de fábrica é : ");

		custofab = ler.nextDouble();

		imposto = 0.45;

		distri = 0.28;
		
		distrimposto1 = custofab * imposto;

		distrimposto2 = custofab * distri;

		distrimpostof = distrimposto1 + distrimposto2;

		carnovo = distrimpostof + custofab;
		
		System.out.println("Esse é o custo do consumidor: " + carnovo);
		
			}
		}


	

