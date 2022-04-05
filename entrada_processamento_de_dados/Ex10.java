package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	float a ,b; 
	System.out.print("Digite o primeiro número:");
	a = var.nextFloat();
	System.out.print("Digite o segundo o numéro:");
	b = var.nextFloat();

	if (a==b) {
		System.out.print("Os números são iguais" );
		
		
	}else if (a>b){
		System.out.print("O primeiro é maior");
		
	}else {
		System.out.print("O segundo é maior");
	   }
	}
}
