package lista_dupla_encadeada;

public class ListaDuplamenteEncadeadaCircular {
    No primeiro;
    int tamanho;
    No ultimo;

    private static class No{
        int valor;
        No proximo;
        No anterior;
        public No(int valor) {
            this.valor = valor;
            proximo = null;
            anterior = null;
        }
    }

    public void adicionarInicio(int valor) {
        No novo = new No(valor);
        if(primeiro == null){
            novo.proximo = novo;
            novo.anterior = novo;
            primeiro=novo;
            tamanho++;
        } else {
            No ultimo = primeiro.anterior;
            ultimo.proximo=novo;
            novo.proximo=primeiro;
            primeiro.anterior=novo;
            novo.anterior=ultimo;
            primeiro=novo;
            tamanho++;
        }
    }

    public void adicionarFim(int valor){
        No novo = new No(valor);
        if(primeiro == null){
            primeiro=novo;
            tamanho++;
        } else{
            No aux = primeiro;
            while (aux.proximo!=null) {
                aux = aux.proximo;
            }
            novo.anterior = aux;
            aux.proximo=novo;
            tamanho++;
        }
    }

    public void adicionarMeio(int valor, int num){
        No novo = new No(valor);

    }

    public void imprimir() {
        No aux = primeiro;
        int contador = 0;
        while(contador<tamanho){
            System.out.print(aux.valor + "("+aux.anterior.valor+")");
            aux = aux.proximo;
            contador++;
        }
        System.out.println("");
    }
}
