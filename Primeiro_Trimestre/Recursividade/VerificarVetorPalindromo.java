// escreva uma função recursiva que verifique se um vetor de inteiros é palindromo 
public class Main{
  public static void main(String[] args){
  int[] vetor = {1,2,3,2,1}; 
  int n = vetor.length;
  }

  public static boolean verificarPalindromo(int[] vetor, int inicio, int fim){
  if(inicio>=fim){
    return true; // quando inicio for igual ao ou maior que meio significa que o vetor inteiro ja foi comparado
                 // e se ja foi todo comparado e não entrou no for de baixo significa que é palindromo e retorna TRUE
  }
  if(vetor[inicio] != vetor[fim]){ // se qualquer um dos numeros ja der diferente não é palindromo ja retorna falso 
    return false;
  }

  return verificarPalindromo(vetor, inicio+1, fim-1); 
  
}
