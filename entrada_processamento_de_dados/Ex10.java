package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
	Scanner var = new Scanner(System.in);
	float a ,b; 
	System.out.print("Digite o primeiro n�mero:");
	a = var.nextFloat();
	System.out.print("Digite o segundo o num�ro:");
	b = var.nextFloat();

	if (a==b) {
		System.out.print("Os n�meros s�o iguais" );
		
		
	}else if (a>b){
		System.out.print("O primeiro � maior");
		
	}else {
		System.out.print("O segundo � maior");
	   }
	}
}
