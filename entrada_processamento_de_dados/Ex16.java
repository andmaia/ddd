package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Digite o primeiro n�mero:");
		a =t.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = t.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		c =t.nextInt();
		
		if (a == b*b + c*c || b == c*c +a*a || c ==b*b +a*a ) {
		   System.out.print("� um tri�ngulo ret�ngulo.");}
		   else {
		   System.out.print("N�o forma um tri�ngulo ret�ngulo.");

		   }
	}
}
	


