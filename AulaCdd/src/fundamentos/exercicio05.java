package fundamentos;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite entre M ou F:");
		char resp = entrada.next().charAt(0);
		if(resp == 'M') {
			System.out.println("Masculino");
		}else {
			System.out.println("Feminino");
		}

	}

}
