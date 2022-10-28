package exercicio2;

import java.util.Scanner;

public class Exer_03 {

	public static void main(String[] args) {
		int idade;

        Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
        idade = sc.nextInt();

        if (idade >= 10 && idade <= 14){
            System.out.println("Você está na  equipe infantil.");
        }else if(idade >= 15 && idade <= 17){
            System.out.println("Você está na equipe juvenil.");
        }else if (idade >= 18 && idade <= 25) {
            System.out.println("Você está na equipe adulto.");
        }else{
            System.out.println("Você não está qualificado para entrar na equipe.");
        }
	}

}
