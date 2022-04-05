package entrada_processamento_de_dados;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner t =new Scanner(System.in);
		float p,a,f;
		System.out.print("Digite o seu peso: ");
		p =t.nextFloat();
		System.out.print("Digite sua altura");
		a =t.nextFloat();
		f =(p/(a*a));
		
		if (f<18.5) {
			System.out.print("Está abaixo do peso");
			
			
		}else if (f>=18.5&&f<=24.9) {
			System.out.print("Está no peso normal");
			
			
			
		}else if (f>=25&&f<=29.9) {
			
			System.out.print("Está sobrepeso");
		}else if(f>=30&&f<=34.9) {
			System.out.print("Está em obesidade 1");
			
			
		}else if (f>=35&&f<=39.9) {
			
			System.out.print("Está em obesidade 2");
		
		}else {
			
			System.out.print("Obesidade morbida");
		}
			
		     
		
		
		
		
		
		
	}
}
