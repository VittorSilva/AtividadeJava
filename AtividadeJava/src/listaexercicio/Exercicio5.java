package listaexercicio;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira sua idade: ");
		int idade = sc.nextInt();
		
		if(idade <16) {
			System.out.println("Você ainda não pode votar :( ");
		}
		
		else if(idade >=18 && idade <=65){
			System.out.println("Seu voto e Obrigatorio! ");
		}
		
		else {
			System.out.println("Seu voto e opcional");
		}
		sc.close();
	}

}
