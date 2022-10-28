package exercicio2;

import java.util.Scanner;

public class Exer_2 {

	public static void main(String[] args) {
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("Digite primeiro numero: " );
		num1 = sc.nextInt();
		System.out.print("Digite segundo numero: " );
		num2 = sc.nextInt();
		System.out.print("Digite terceiro numero: ");
		num3 = sc.nextInt();

		if(num1 < num2) {
			if(num2 < num3) {
				System.out.println(num1+"\n"+num2+"\n"+num3);
			} else if (num1 < num3) {
				System.out.println(num1+"\n"+num3+"\n"+num2);
			} else {
				System.out.println(num3+"\n"+num1+"\n"+num2);
			}

		}else if (num2 < num3) {
			if (num1 < num3) {
				System.out.println(num2+"\n"+num1+"\n"+num3);
			}else {
				System.out.println(num2+"\n"+num3+"\n"+num1);
			}
		}else {
			System.out.println(num3+"\n"+num2+"\n"+num1);
		}
		
	}
}
