package br.com.javaaux;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int horas, minutos, segundos, seg;
		
		    System.out.println("Digite a dura??o do evento em segundos:");
		   segundos = ler.nextInt();
		    
		    horas = (segundos / 3600);
		    minutos = ((segundos % 3600) / 60);
		    seg = ((segundos % 3600) % 60);
		    
		    System.out.println("A dura??o do evento foi de: " + horas + " horas: " + minutos + " minutos e: " + seg + " segundos");
		  

	}

}
