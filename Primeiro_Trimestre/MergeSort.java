public class Main{
	public static void main(String[] args){

    int[] vetor = {1223,343, 11, 53, -1};
    mergeSortOrdenaar();
    for(int k=0; k<vetor.length; k++){
        System.out.println(veto[k]);
    
    }
  



	}

	public static void mergeSortDividir(int[] vetor, int inicio, int fim){ // ele é responsável por dividir o vetor até chegar em vetores de 1 numero
		if(inicio<fim){
		int meio = (inicio + fim)/2;
		mergeSortDividir(vetor, inicio, meio); // chamando ele para continuat dividindo a parte esquerda
		mergeSortDividir(vetor, meio+1, fim); // chamando ele para continuat dividindo a parte direita
		mergeSortOrdenaar(vetor, inicio, meio, fim);
		}
	}

	public static void mergeSortOrdenaar(int[] vetor, int inicio, int meio, int fim){ // responsável por juntar os vetores unitários
	int[] vetorTemporario = new int[fim - inicio + 1];
	int i = inicio; //inicio da parte esquerda
	int j = meio + 1; //inicio da parte direita
	int k = 0; //índice de vetorTemporario

	while(i <= meio && j <= fim){
		if(vetor[i] < vetor[j]){
		vetorTemporario[k++] = vetor[i++];
		} else {
		vetorTemporario[k++] = vetor[j++];
		}
	}

	
	 
	while(i<=meio){
	vetorTemporario[k++] = vetor[i++];

	}

	while(j<=fim){
	vetorTemporario[k++] = vetor[j++];
	}

	for(i = 0; i<vetorTemporario.length; i++){
		vetor[i+inicio] = vetorTemporario[i];

	}





	}






}
