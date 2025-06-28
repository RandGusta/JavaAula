public class TestePilha{
  public static void main(String[] args){
    Pilha<String> pilha = new Pilha<>();
    pilha.empilhar("oi");
    pilha.empilhar("tchau");
    pilha.desempilhar(); // retorna o ultimo que adicionamos pois ele esta no topo da pilha que é de onde sempre removemos
  }
  

  
}
