// removemos o primeiro elemento que entrou --> pois imita uma 'fila' o primeiro qu entrou é o primeiro a sair
// metodos --> adicionarFim e removerInicio


public class Fila<T>{
  LinkedList<T> lista = new ListaEncadeada<>();

  public void enfileirar(T valor){
    lista.adicionarFim(valor);
  }

  public T desenfileirar(){
    return lista.removerInicio();
  }
  
}
