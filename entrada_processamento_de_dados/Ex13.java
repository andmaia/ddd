package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		  Scanner tec =new Scanner(System.in);
		   float a,b,c ;
		   System.out.print("Digite o primeiro n�mero: ");
            a =tec.nextFloat();
            System.out.print("Digite o segunddo n�mero: ");
            b =tec.nextFloat();
            System.out.print("Digite o terceiro n�mero: ");
            c =tec.nextFloat();
            
            if (a<b && b<c) {
            	System.out.print("O terceiro � o maior:"+c);
            }else if(b<a && a<c){
            	System.out.print("O terceiro � o maior:"+c);
            }else if(a<c&&c<b) {
            	System.out.print("O segundo � o maior:"+b);
            	
            }else if(c<a&&a<b){
            	System.out.print("O segundo � o maior:"+b);
            	
            	
            }else if(b<c&&c<a) {
            	System.out.print("O primeiro � o maior:"+a);
            }else if (b>c&&b<a) {
            	
            	System.out.print("O primeiro � o maior:"+a);
            }
	}
 
   
       
}
