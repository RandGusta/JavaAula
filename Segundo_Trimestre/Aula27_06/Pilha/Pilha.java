// Pilha --> o ultimo elemento que eu coloquei será o primeiro a ser removido, pois ele está no inicio da pilha 
// adicionar um novo --> adiciona no inicio
// remover --> tiramos o primeiro ou seja o ultimo que coloquei
// a 'cabeca' --> vai sendo o ultimo elemento que vc adicionou na pilha toda vez 
// ao remover vc remove a cabeça pois ela aponta sempre pro ultimo que vc adicinou
// contruimos a PILHA --> manipulando a LinkedList 

public class Pilha<T>{
  LinkedList<T> lista = new  LinkedList<>(); // criando um objeto da classe


  // metodos adicionar e remover --> metodos basicos

  public void empilhar(T valor){
    lista.adicionarInicio(valor)
  }

  public T desempilhar(){ // tipo generico para caso o usuário queira voltar retornamos o valor que retiramos 
    return lista.removerInicio(); // retornamos a função pois é como se uma variavel estivesse  guardando o valor dessa primeira função que 
  }                               // ela chama, dessa forma necessitamos retornar de novo



  
}
