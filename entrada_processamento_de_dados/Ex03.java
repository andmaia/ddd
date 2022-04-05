package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner var = new Scanner(System.in);
    System.out.print("Digite a base:");
    Float b = var.nextFloat();
    System.out.print("Digite a altura:");
    float a = var.nextFloat();
    float base = (a*b)/2;
    System.out.print("A área é:"+base);
    
	}

}
