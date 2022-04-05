package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Digite o primeiro número:");
		a =t.nextInt();
		System.out.print("Digite o segundo número: ");
		b = t.nextInt();
		System.out.print("Digite o terceiro número: ");
		c =t.nextInt();
		
		if (a>=b+c || c>=a+b || b>=c+a  ){
		
			
			System.out.print("Não é possivel formar um triângulo");
		
		
			
			
		}else if ( b==a && c!=b || b==c&& a!=b|| c==a && b!=a||a==b&&c!=a ) {
		    System.out.print("Forma um triângulo Isôrceles");
		}else if (a == b && b ==c) {
			System.out.print("Forma um triângulo equilátero");
			
		}else {
			
			System.out.print("Forma um triângulo escalêno");
		}
		
	}
		}

	


