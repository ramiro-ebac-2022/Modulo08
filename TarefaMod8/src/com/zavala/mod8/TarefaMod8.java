package com.zavala.mod8;

import java.util.Scanner;

/**
 * @author Ramiro
 * Tarefa Mod.8 :
 * Leitura de 4 notas e dividir por 4. Ou seja, calcular a média
 * de 4 notas. imprimir no console o resultado.
 */

public class TarefaMod8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

	    System.out.println("Digite a nota 01 : ");
	    int nota1 = s.nextInt();
	    
	    System.out.println("Digite a nota 02 : ");
	    int nota2 = s.nextInt();

	    System.out.println("Digite a nota 03 : ");
	    int nota3 = s.nextInt();
	    
	    System.out.println("Digite a nota 04 : ");
	    int nota4 = s.nextInt();
	    
	    double media = (nota1+nota2+nota3+nota4)/4.0;
	    
	    System.out.printf("A média das notas %s, %s, %s, %s é : %s",nota1,nota2,nota3,nota4,media);
	}

}
