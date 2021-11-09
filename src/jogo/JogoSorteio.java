package jogo;

import java.util.Random;
import java.util.Scanner;

/*
 Crie um jogo para o usu�rio descobrir um n�mero sorteado de 1 a 50. 
 A cada tentativa dele, forne�a uma dica mostrando se o n�mero � maior ou menor. 
 Quando ele descobrir exiba uma mensagem de parab�ns e 
 mostre em quantas tentativas ele conseguiu.
 */

public class JogoSorteio {

	public static void main(String[] args) {
		JogoSorteio jogo = new JogoSorteio();
		jogo.jogo();
	}
    public void jogo() {
        //inst�ncia um objeto da classe Random usando o construtor padr�o
        Random gerador = new Random();
        Scanner leia = new Scanner(System.in);
	    
        int numeroSorteado=gerador.nextInt(50)+1; //um n�mero inteiro aleat�rio de 1 a 50
        
        System.out.println("Bem vindo ao Jogo N�mero da Sorte! \n"
        		+ "Neste jogo voc� deve adivinhar o valor de um n�mero aleat�rio de 1 a 50. \n"
        		+ "Pronto para come�ar? Vamos l�! ");
        
        int numeroChutado=0;
        int cont=0;
        while (numeroChutado!=numeroSorteado) {
        	System.out.println("Qual o n�mero sorteado? Chute o valor:");
        	numeroChutado = leia.nextInt();
        	cont++;
        	if(numeroChutado<numeroSorteado) {
        		System.out.println("Hummm, seu chute est� abaixo do valor.. N�o desista, vamos continuar!");
        	}else if (numeroChutado>numeroSorteado) {
        		System.out.println("Haaaam, seu chute est� acima do valor.. N�o desista, vamos continuar!");
        	}
        }
        System.out.println("Parab�ns, voc� acertou o n�mero sorteado em " + cont + " tentativas!!");
    }

    }

