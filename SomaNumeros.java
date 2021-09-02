package Fundamentos;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int x; int y;int soma;
		System.out.println("digite o primeiro numero");
		x=entrada.nextInt();
		System.out.println("digite o segundo numero");
		y=entrada.nextInt();
		soma=x+y;
		System.out.println("o resultado da soma é "+soma);
		
	}

}
