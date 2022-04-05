package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
	 Scanner var = new Scanner(System.in);
	 float a,b, area;
	 System.out.print("Digite a base:");
	 a = var.nextFloat();
	 System.out.print("Digite a altura:");
	 b =var.nextFloat();
	 
	 area =a*b;
	 if (area >100) {
	  System.out.println("Terreno mede "+area);
	  System.out.print("Terreno grande");
	 
	 
	  }else {
	    System.out.print("Terremo mede "+area);
	  }
	}
}
	
