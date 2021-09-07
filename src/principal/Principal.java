package principal;

import java.util.InputMismatchException;
import java.util.Scanner;
import entidade.CoeficienteException;
import entidade.EquacaoCompleta;
import entidade.RaizException;

public class Principal {
	public static void main(String[] args) {
		
		System.out.println("Calculo de Equação de Segundo Grau");
		System.out.println("|Informe os dados|\n");
		
		EquacaoCompleta e = new EquacaoCompleta();
		
		do {
			try {
				System.out.print("coeficiente a: ");
				e.setCoeficienteA(coletaDados());
				
				System.out.print("coeficiente b: ");
				e.setCoeficienteB(coletaDados());
				
				System.out.print("coeficiente c: ");
				e.setCoeficienteC(coletaDados());
				break;
			}
			catch(CoeficienteException exception){
				System.out.println(exception.getMessage());
				
			}
			catch(InputMismatchException exception) {
				System.out.println("caracteres não são validos.\n");
			}
		}while(true);
		
		
		try {
			e.mostrarRaizes();
		}
		catch(RaizException exception) {
			System.out.println(exception.getMessage());
		}
		
		
	}
	
	public static double coletaDados() {
		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();
		return valor;
		
	}

}
