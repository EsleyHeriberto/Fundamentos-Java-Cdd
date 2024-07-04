package fundamentos;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o primeiro número:");
		int num = entrada.nextInt();
		
		System.out.println("Digite o segundo número:");
		int num1 = entrada.nextInt();
		
		System.out.println("Digite o terceiro número:");
		int num2 = entrada.nextInt();
		
		if(num > num1 && num > num2) {
			System.out.printf("%d é o maior",num);
		}else if(num2 > num1 && num2 > num) {
			System.out.printf("%d é o maior",num2);
		}else {
			System.out.printf("%d é o maior",num1);
		}
	}

}
