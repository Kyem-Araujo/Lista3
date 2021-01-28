package Exercicios;

import java.util.Scanner;

public class Ecercicio6 {
	
	public static void main (String args []) {
		
		double raiz, y1, y2, x1, x2;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println(" \nInsira o valor de X1");
		x1=ler.nextDouble();
		
		System.out.println("\nInsira o Valor de X2");
		x2=ler.nextDouble();
		
		System.out.println(" \nInsira o Valor de Y1");
		y1=ler.nextDouble();
		
		
		System.out.println("\nInsira o Valor de Y2");
		y2=ler.nextDouble();
		
		raiz=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1), 2));
		
		System.out.println("\nO valor de D é: " +raiz);
		
		
		
		
		
		
		
	}

}
