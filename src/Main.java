import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int y =32;
		double x = 10.384875;
		String nome = "Maria";
		int idade = 16;
		double salario = 3000.0;
		
  System.out.println("Fala besta!");
  System.out.println(y);
  System.out.printf("%.2f%n", x);
  Locale.setDefault(Locale.US);
  System.out.printf("%.3f%n", x);
  System.out.println("RESULTADO = "+ x +" metros ok "+ y + " metros ok");
  System.out.printf("RESULTADO = %.2f metros%n", x);
  System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, salario);

	}

}
