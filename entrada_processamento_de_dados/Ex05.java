package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex05 {
public static void main(String[] args) {
		float  c,f,formula;
		Scanner var = new Scanner(System.in);
		System.out.print("Digite a temperatura em celcius :");
		c =var.nextFloat();
		f =(18/10) *c +32;
		System.out.print(f);
		

}
}