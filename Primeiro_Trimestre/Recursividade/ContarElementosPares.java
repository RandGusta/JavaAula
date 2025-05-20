// Conte quantos elementos pares há no vetor 
public class Main{
  public static void main(String[] args){
    int[] vetor = {1,2,3,4,5};
    int n = vetor.length;
    int resposta = elementosPares(vetor, n);
    System.out.println("quantidade de pares: " + resposta);
  }

  public static int elementosPares(int[] vetor, int n){
    if(n==0){
      return 0;
    }
    if(vetor[n-1]%2 == 0){
      return 1 + elementosPares(vetor, n-1);
    }else {
      return elementosPares(vetor, n-1);
    }
  
    
}

  
}
