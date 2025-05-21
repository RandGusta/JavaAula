// Escreva uma função recursiva que receba dois números inteiros base e expoente e retorne base**expoente

public class Main{
  public static void main(String[] args){
  int base = 2;
  int expoente = 5;
  double result = potencia(base, expoente);
  System.out.println("o resultado é: " + result);
  
    
  }

  public static double potencia(int base, int expo){
    if(expo == 0){
      return 1;
    } else {
    return base*(potencia(base, expo-1));
      }
    
  }

  
}
