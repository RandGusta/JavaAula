public class Caixa <T>{ // <T>  --> faz com que aceite qualquer tipo atribuido '<X>' estrutura onde X pode ser qualquer letra
  ´private T item; // é possivel ainda criar atributos com tipos NÃO genéricos como 'private int dia'

  public void setItem(T item){
    this.item = item
  }

  public void mostrarItem(){
    System.out.println(item);
  }
  
  
}
