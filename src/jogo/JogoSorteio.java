package jogo;

import java.util.Random;
import java.util.Scanner;

/*
 Crie um jogo para o usuário descobrir um número sorteado de 1 a 50. 
 A cada tentativa dele, forneça uma dica mostrando se o número é maior ou menor. 
 Quando ele descobrir exiba uma mensagem de parabéns e 
 mostre em quantas tentativas ele conseguiu.
 */

public class JogoSorteio {

	public static void main(String[] args) {
		JogoSorteio jogo = new JogoSorteio();
		jogo.jogo();
	}
    public void jogo() {
        //instância um objeto da classe Random usando o construtor padrão
        Random gerador = new Random();
        Scanner leia = new Scanner(System.in);
	    
        int numeroSorteado=gerador.nextInt(50)+1; //um número inteiro aleatório de 1 a 50
        
        System.out.println("Bem vindo ao Jogo Número da Sorte! \n"
        		+ "Neste jogo você deve adivinhar o valor de um número aleatório de 1 a 50. \n"
        		+ "Pronto para começar? Vamos lá! ");
        
        int numeroChutado=0;
        int cont=0;
        while (numeroChutado!=numeroSorteado) {
        	System.out.println("Qual o número sorteado? Chute o valor:");
        	numeroChutado = leia.nextInt();
        	cont++;
        	if(numeroChutado<numeroSorteado) {
        		System.out.println("Hummm, seu chute está abaixo do valor.. Não desista, vamos continuar!");
        	}else if (numeroChutado>numeroSorteado) {
        		System.out.println("Haaaam, seu chute está acima do valor.. Não desista, vamos continuar!");
        	}
        }
        System.out.println("Parabéns, você acertou o número sorteado em " + cont + " tentativas!!");
    }

    }

