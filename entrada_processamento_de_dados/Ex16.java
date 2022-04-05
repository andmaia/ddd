package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Digite o primeiro número:");
		a =t.nextInt();
		System.out.print("Digite o segundo número: ");
		b = t.nextInt();
		System.out.print("Digite o terceiro número: ");
		c =t.nextInt();
		
		if (a == b*b + c*c || b == c*c +a*a || c ==b*b +a*a ) {
		   System.out.print("É um triângulo retângulo.");}
		   else {
		   System.out.print("Não forma um triângulo retângulo.");

		   }
	}
}
	


