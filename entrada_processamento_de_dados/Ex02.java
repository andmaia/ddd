package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		Scanner var = new Scanner(System.in);
		System.out.print("Digite a aresta: ");
		float a = var.nextFloat();
		float area = a*a;
		System.out.print("Sua área é "+area);
		
}
}