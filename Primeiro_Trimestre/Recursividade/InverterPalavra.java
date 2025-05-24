// imprimir reverso 

public class Main{
	public static void main(String[] args){
	String palavra = "bola";
	String resposta = reverso(palavra);
	System.out.println("inverso: " + resposta);
	}

	
	public static String reverso(String palavra){
	char[] palavraVetor = palavra.toCharArray();
	int tamanho = palavraVetor.length;
	return reverter(palavraVetor, tamanho);
	}


	public static String reverter(char[] vetor, int tamanho){
		if(tamanho == 0){
			return "";
			
	}
		return String.valueOf(vetor[tamanho-1]) + reverter(vetor, tamanho-1);


	}







}
