package lista_dupla_encadeada;

public class ListaDuplamenteEncadeada {
    No primeiro;
    int tamanho;

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
            primeiro = novo;
            tamanho++;
        } else {
            novo.proximo = primeiro;
            primeiro.anterior = novo;
            primeiro = novo;
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
        while(aux!=null){
            System.out.print(aux.valor + "("+(aux.anterior!=null?aux.anterior.valor:"null")+") ");
            aux = aux.proximo;
        }
        System.out.println("");
    }
}
