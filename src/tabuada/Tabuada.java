package tabuada;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		int contador = 0, multiplicando, Mmultiplicador, produto;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o multiplicando: ");
		multiplicando = leitor.nextInt();
		
		System.out.println();
		
		System.out.print("Digite o máximo multiplicador: ");
		Mmultiplicador = leitor.nextInt();
		leitor.close();
		
		System.out.println();
		
		System.out.println("TABUADA DO " + multiplicando);
		System.out.println("-----------------------------");
		
		while(contador <= Mmultiplicador) {
			produto = multiplicando * contador;
			System.out.println(multiplicando + " X " + contador + " = " + produto);
			contador++;
		}
		System.out.println("------------------------------------");
		

	}

}
