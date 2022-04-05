package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		Float  a,b,c,d,media;
		System.out.print("Digite o primeiro número:");
		a =var.nextFloat();
		System.out.print("Digite o segundo número:");
		b =var.nextFloat();
		System.out.print("Digite o terceiro número:");
		c =var.nextFloat();
		System.out.print("Digite o quarto número:");
		d =var.nextFloat();
		media = (a+b+c+d)/4;
		System.out.print("Sua média é "+media);
		
}   
}
