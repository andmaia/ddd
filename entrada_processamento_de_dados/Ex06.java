package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		float d,c,r;
		Scanner var = new Scanner(System.in);
		System.out.print("Digite a cotação atual do dolar: ");
		c =var.nextFloat();
		System.out.print("Digite uma quantidade em dolar: ");
		d= var.nextFloat();
		r =c*d;
		System.out.print("O valor em real é: "+r);
		
		
}
}
