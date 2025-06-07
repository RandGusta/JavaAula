// linked list
// composta por nós com as informações básicas de valor dele (int, string...) e ponteiro (Aponta para o próximo elemento --> referencia para o próximo elemento [ outro elemento do mesmo tipo do nó])
// ultimo nó aponta para o nulo
// Cabeça --> inicio da lista
// Ex. para adicionar um elemento no INICIO da lista --> fazer com que esse novo elemento aponte
// para onde a 'cabeça' esta apontando
// Ex. para adicionar um elemento no FIM da lista --> acesso o incio, percorro toda a lista, quando achar o elemento
// que aponta para NULO faço ele apontar para esse novo elemento e agora esse novo é o ultimo
// ele aponta para NULO
// INTERESSANTE --> armazenar quem é o ultimo para não termos que percorrer

public class Main{
    public static void main(String[] args){
        ListaEncadeada lista = new ListaEncadeada();
        lista.adicionarInicio(10);
        lista.adicionarInicio(5);
        lista.imprimir();
        lista.adicionarFim(56);
        lista.imprimir();
    }

}
