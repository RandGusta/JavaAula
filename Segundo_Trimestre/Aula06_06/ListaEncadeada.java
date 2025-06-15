// linked list 
// composta por nós com as informações básicas de valor dele (int, string...) e ponteiro 
// (Aponta para o próximo elemento --> referencia para o próximo elemento [outro elemento do mesmo tipo do nó])
// ultimo nó aponta para o nulo 
// Cabeça --> inicio da lista 
// Ex. para adicionar um elemento no INICIO da lista --> fazer com que esse novo elemento aponte
// para onde a 'cabeça' esta apontando 
// Ex. para adicionar um elemento no FIM da lista --> acesso o incio, percorro toda a lista, quando achar o elemento
// que aponta para NULO faço ele apontar para esse novo elemento e agora esse novo é o ultimo 
// ele aponta para NULO
// INTERESSANTE --> armazenar quem é o ultimo para não termos que percorrer

public class ListaEncadeada<E> { // E --> Tipo genérico
    No<E> cabeca;

    public void adicionarInicio(E valor) { // agora recebe tipo genérico
        No<E> novoElemento = new No<>(valor); // contrutor que criamos para receber valor
        if (cabeca == null) {
            cabeca = novoElemento;
        } else {
            novoElemento.proximo = cabeca;
            cabeca = novoElemento;
        }
    }

    public void adicionarFim(E valor) {
        No<E> novoElemento = new No<>(valor);
        No<E> aux = cabeca;
        if (cabeca == null) {
            cabeca = novoElemento;
        } else {
            while (aux.proximo != null) {
                aux = aux.proximo;
            }
            aux.proximo = novoElemento;
        }
    }

    public void imprimir() {
        No<E> aux = cabeca;
        while (aux != null) {
            System.out.print(aux.valor + "--> ");
            aux = aux.proximo;
        }
        System.out.print("Null");
        System.out.println();
    }

    private static class No<T> { // static para quando chamarmos a ListaEncadeada não criar na memoria uma conexão entre as duas 
        T valor;
        No<T> proximo; // no sempre mesmo tipo da classe

        public No(T valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
}
