package listaexercicio;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Insira um Numero: ");
		int numero = sc.nextInt();
		int sucessor = numero + 1;
		int antecessor = numero - 1;
		
		System.out.println("O antecessor é: " + antecessor);
		System.out.println("O sucessor é: " + sucessor);
		
		
		sc.close();

	}

}
