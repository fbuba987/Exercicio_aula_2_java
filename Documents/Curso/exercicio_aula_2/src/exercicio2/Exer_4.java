package exercicio2;

import java.util.Scanner;

public class Exer_4 {

	public static void main(String[] args) {

		float numero;
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		numero = sc.nextFloat();

		if (numero % 2 == 0) {
			System.out.println("√" + numero + " = " + Math.sqrt(numero));
		} else {
			System.out.println(numero + " ao quadrado é " + Math.pow(numero, 2));
		}
	}

}
