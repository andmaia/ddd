package entrada_processamento_de_dados;

import java.util.Scanner;

import javax.swing.Spring;

public class Ex18 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		float p,a,i;
		String s;
	  System.out.print("Digite o sexo:");
	  s= t.nextLine();
	  System.out.print("Digite a altura:");
	  a =t.nextFloat();
	  System.out.print("Digite seu peso:");
	 p =t.nextFloat();
	 
	 i = (p/(a*a));
	 
	 if (i<19 && s=="Feminino") {
		 System.out.print("Está abaixo do peso");
	 }else if(19<=i && i<24 && s=="Feminino") {
		 System.out.print("Está no peso ideal");
		 
	 }else if(24<=i&& s=="Feminino") {
		 System.out.print("Está acima do pesp");
	 }else if(i<20 && s=="Masculino") {
		 System.out.print("Está abaixo do peso");
	 }else if(20<=i&&25>i&&s=="Masculino") {
		 System.out.print("Está no peso ideal");
			 
		 }else{
		System.out.print("Está acima do peso");
	 
	 }
}
}
