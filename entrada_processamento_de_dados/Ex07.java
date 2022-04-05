package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		float a,b,c,d,e,s,t,p;
		System.out.print("Digite o valor do produto:");
		a =var.nextFloat();
		System.out.print("Digite o valor do produto:");
		b =var.nextFloat();
		System.out.print("Digite o valor do produto:");
		c =var.nextFloat();
		System.out.print("Digite o valor do produto:");
		d =var.nextFloat();
		System.out.print("Digite o valor do produto:");
		e =var.nextFloat();
		s = a+b+c+d+e;
		System.out.println("Custou:"+s);
		System.out.println("Digite o valor do pagamento:");
		p =var.nextFloat();
		t =p -s;
		System.out.print("Seu troco é"+t);
		
		
		
}
}
