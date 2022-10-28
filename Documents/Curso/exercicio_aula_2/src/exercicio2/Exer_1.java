package exercicio2;

import java.util.Scanner;

public class Exer_1 {

	public static void main(String[] args) {
		// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
			System.out.print("Digite primeiro numero: " );
			num1 = sc.nextInt();
			System.out.print("Digite segundo numero: " );
			num2 = sc.nextInt();
			System.out.print("Digite terceiro numero: ");
			num3 = sc.nextInt();
			
			if(num1 > num2 && num1>num3) {
				System.out.println("O numero "+num1+ " é maior");
				
			} else if (num2>num1 && num2>num3) {
				System.out.println("O numero "+num2+ " é maior");
			}else {
				System.out.println("O numero "+num3+ " é maior");
			}
			

	}

}
