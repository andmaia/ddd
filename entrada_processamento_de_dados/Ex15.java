package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Digite o primeiro n�mero:");
		a =t.nextInt();
		System.out.print("Digite o segundo n�mero: ");
		b = t.nextInt();
		System.out.print("Digite o terceiro n�mero: ");
		c =t.nextInt();
		
		if (a>=b+c || c>=a+b || b>=c+a  ){
		
			
			System.out.print("N�o � possivel formar um tri�ngulo");
		
		
			
			
		}else if ( b==a && c!=b || b==c&& a!=b|| c==a && b!=a||a==b&&c!=a ) {
		    System.out.print("Forma um tri�ngulo Is�rceles");
		}else if (a == b && b ==c) {
			System.out.print("Forma um tri�ngulo equil�tero");
			
		}else {
			
			System.out.print("Forma um tri�ngulo escal�no");
		}
		
	}
		}

	


