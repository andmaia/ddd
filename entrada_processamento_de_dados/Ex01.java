package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		System.out.print("Digite a altura: ");
		float altura =var.nextFloat();
		System.out.print("Digite a base: ");
		float base =var.nextFloat();
		
		float area;
		area = base*altura;
		System.out.print("A área é igual a "+area);

}
}