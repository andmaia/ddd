package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner tec =new Scanner(System.in);
		float p1,p2,m;
		System.out.print("Digite a nota na p1");	
		p1 =tec.nextFloat();
		System.out.print("Digite a nota na p2");
		p2 =tec.nextFloat();
		m =(p1+(2*p2))/3;
      if (m>=5) {
    	System.out.println("Sua nota é "+ m);
    	System.out.print("Aprovado");
      }else {
    		System.out.println("Sua nota é "+ m);
        	System.out.print("Reprovado");
      }
	}

}
