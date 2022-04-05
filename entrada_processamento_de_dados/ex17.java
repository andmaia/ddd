package entrada_processamento_de_dados;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
     double v,a,v1,t,v2;
     Scanner tec = new Scanner(System.in);
     
    
     System.out.print("Digite a aceleração:");
     a =tec.nextFloat();
     System.out.print("Digite o tempo");
     t = tec.nextFloat();
     v1=a*t;
     v2= v1*3.6;
     v =v2+(a*t);
     
     if (v<=40) {
    	 System.out.print("Veiculo muito lento");
     }else if (40<v && v<=60) {
    	 System.out.print("Velocidade permitida");
     }else if(60<v&&v<=80) {
		System.out.print("Velocidade de cruzeiro");
	 
     }else if (80<v && v<=120) {
    	 System.out.print("Veículo rápido");
     }else {
    	 System.out.print("Veúculo muito rápido");
     }
    	 
	 }

	}


