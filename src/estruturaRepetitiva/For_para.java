package estruturaRepetitiva;

import java.util.Scanner;

public class For_para {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;

		}

		System.out.println("o valor de x � igual " + soma);

		sc.close();

	}

}
