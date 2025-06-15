// Nível 1 – Básico: Estrutura e Operações Fundamentais
// Crie uma classe Node e uma classe ListaEncadeada (LinkedList) com os seguintes métodos:
// Inserir no início
// Inserir no final
// Imprimir os elementos
// Implemente um método que conte o número de elementos da lista.
// Crie um método que retorne true se um determinado valor estiver presente na lista.
// Implemente uma função que remova o primeiro elemento da lista.
// Implemente uma função que remova o último elemento da lista.


import java.sql.SQLOutput;

public class LikedList<T> {
    private Node<T> cabeca;


    public void inserirInicio(T valor) {
        Node<T> elemento = new Node<>(valor);
        if (cabeca == null) {
            cabeca = elemento;

        } else {
            elemento.proximo = cabeca;
            cabeca = elemento;


        }


    }


    public void inserirFinal(T valor) {
        Node<T> elemento = new Node <>(valor);
        Node<T> temp = cabeca;
        if (cabeca == null) {
            cabeca = elemento;

        } else {
            while (temp.proximo != null) {
                temp = temp.proximo;
            }
            temp.proximo = elemento;


        }


    }


    public void imprimir() {
        Node<T> temp = cabeca;
        while (temp != null) {
            System.out.print(temp.valor + " -->");
            temp = temp.proximo;
        }
        System.out.print("NULL");
        System.out.println();

    }


    public void contarElementos() {
        Node<T> temp = cabeca;
        int cont = 0;
        while (temp != null) {
            cont++;
            temp = temp.proximo;
        }
        System.out.println("Essa lista possui : " + cont + " elemento(s)");

    }


    public void removerElementoInicio(){
        if(cabeca == null){
            System.out.println("Lista já não possui elementos");
        } else {
            cabeca = cabeca.proximo;
        }


    }




    public void removerElementoFim(){
        if(cabeca == null){
            System.out.println("A lista está vazia!!!");
        }else if(cabeca.proximo == null) {
            cabeca = null;
        } else {
            Node<T> temp = cabeca;
            while((temp.proximo).proximo != null){
                    temp = temp.proximo;
            }
            temp.proximo = null;
        }
    }

}

