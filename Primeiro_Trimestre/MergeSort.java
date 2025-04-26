# JavaAula

public Main{
  public static void main(String[] args){

   private static void merge(int[] vetor, int[] aux, int inicio, int fim){
      int meio = (inicio + fim)/2;
      if(inicio<fim){
        merge(vetor, aux, inicio, meio); // chama a função novamente 
        merge(vetor, aux, meio+1, fim);
        intercalacao(vetor, aux, inicio, meio, fim);
      }
     
   }

public static void intercalacao(int[] vetor, int[] aux, int inicio, int meio, int fim){
    for(int i = inicio; i<=fim; i++){
        aux[i] = vetor[i];
      
    }
    int esquerda = inicio;
    int direita = meio+1; // o meio ainda faz parte do inicio então é meio+1;

    for(int i=inicio; i<=fim; i++){
      if(inicio > meio){
        vetor[i] = aux[direita++];
      } else if(direita > fim){ 
        vetor[i] = aux[esquerda++]; //PODE ESTAR ERRADO!!!!!!
      }
      else if(aux[esquerda]<aux[direita]){
        vetor[i] = aux[esquerda++];
      } else{
        vetor[i] = aux[direita++];
      }
    }
}
    
    
  }


  
}
