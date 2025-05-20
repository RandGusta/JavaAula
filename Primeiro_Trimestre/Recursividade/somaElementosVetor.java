// Recursividade
// Soma de todos os elementos 

public class Main{
  public static void main(String[] args){
    int[] vetor= {1,2,3,4,5};
    int n = vetor.length;
    int resposta = soma(vetor, n);
    System.out.println(resposta);
  
  }
  
  public static int soma(int[] vetor, int n){
  if(n == 0){ // condição de parada
    return 0;
  }
  return vetor[n-1] + soma(vetor, n-1); // retorna a soma do vetor na prosição n-1 mais a função soma que possui o n-1 
    }                                   // como tamanho e que dentro dela chama novamente outra soma e assim por diante, diminuindo e chegando no fim do vetor



}








