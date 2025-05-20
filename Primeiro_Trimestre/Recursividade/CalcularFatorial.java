// Calcular fatorial

public class Main{
  public static void main(String[] args){
    int n = 5;
    int resp = fatorial(n);
    System.out.println("o fatorial de " + n + " é: " + resp);
    
  }

  public static int fatorial(int n){
    if(n == 0){
      return 1;
    }
    return n * fatorial(n-1);
  }


  
}
