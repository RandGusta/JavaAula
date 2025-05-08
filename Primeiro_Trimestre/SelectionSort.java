//Exercício 1: Ordenação de Notas de Alunos
//Crie um programa que receba as notas de 10 alunos e as armazene em um array. 
//Em seguida, ordene as notas em ordem crescente utilizando o método Selection Sort. 
//Após a ordenação, exiba as notas ordenadas.

import java.util.Scanner;
public class Main{

	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	int[] vetor = new int[10];
	
	for(int i=0; i<vetor.length; i++){
		System.out.println("informe a nota do " + (i+1) + "° aluno: ");
		vetor[i] = scanner.nextInt();

		}
	int[] resposta = selectionSort(vetor);
	
	for(int j=0; j<resposta.length; j++){
		System.out.print(resposta[j]);
		System.out.print(" ");

		}





	}


	public static int[] selectionSort(int[] vetor){
		for(int i = 0; i<vetor.length-1; i++){
			int i_menor  = i;
			for(int j=i+1; j<vetor.length; j++){
				if(vetor[j]<vetor[i_menor]){
					i_menor = j;
				}
			}
			int auxiliar = vetor[i];
			vetor[i] = vetor[i_menor];
			vetor[i_menor] = auxiliar;

		}
		return vetor;



	}







}
