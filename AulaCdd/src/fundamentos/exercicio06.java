package fundamentos;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		int num = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Telefonou para a vítima?");
		char resp1 = entrada.next().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char resp2 = entrada.next().charAt(0);
		
		System.out.println("Mora perto da vítima?");
		char resp3 = entrada.next().charAt(0);
		
		System.out.println("Devia para a vítima?");
		char resp4 = entrada.next().charAt(0);
		
		System.out.println("Já trabalhou com a vítima?");
		char resp5 = entrada.next().charAt(0);	

		if(resp1 == 's') {
			num = num + 1;
		} 
		if(resp2 == 's') {
			num = num + 1;
		} 
		if(resp3 == 's') {
			num = num + 1;
		} 
		if(resp4 == 's') {
			num = num + 1;
		}
		if(resp5 == 's') {
			num = num + 1;
		}
		
		if(num == 2) {
			System.out.println("Suspeita");
		}else if(num > 3 && num < 4) {
			System.out.println("Cúmplice");
		}else if(num == 5) {
			System.out.println("Assassino");
		}else {
			System.out.println("Inocente");
		}
	}

}
