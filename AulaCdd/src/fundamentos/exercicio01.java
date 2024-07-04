package fundamentos;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número:");
		int n1 = entrada.nextInt();
		
		System.out.println(n1 > 0 ? "Positivo":"Negativo");
	}

}
