package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		Float  a,b,c,d,media;
		System.out.print("Digite o primeiro n�mero:");
		a =var.nextFloat();
		System.out.print("Digite o segundo n�mero:");
		b =var.nextFloat();
		System.out.print("Digite o terceiro n�mero:");
		c =var.nextFloat();
		System.out.print("Digite o quarto n�mero:");
		d =var.nextFloat();
		media = (a+b+c+d)/4;
		System.out.print("Sua m�dia � "+media);
		
}   
}
