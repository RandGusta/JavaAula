// Produto escalar exercicio da prova

public class Main{
  public static void main(String[] args){
  int[] a = {1,2,3};
  int[] b = {4,5,6};
  int n = a.length;
  int resposta =  produtoEscalar(a, b, n);
  System.out.println(resposta);
  }

  public static int produtoEscalar(int[] a, int[] b, int n){
    if(n == 0){
      return 0;
    }
    return a[n-1] * b[n-1] + produtoEscalar(a, b, n-1);
  }
  
  
}


