public class Main {
    public static void main(String[] args){
        LikedList<Integer> lista = new LikedList<>();
        lista.inserirFinal(12);
        lista.contarElementos();
        lista.imprimir();
        lista.inserirFinal(34);
        lista.imprimir();

        lista.inserirFinal(1);
        lista.imprimir();

        lista.inserirInicio(90);
        lista.imprimir();


        lista.removerElementoFim();
        lista.imprimir();

        lista.removerElementoFim();
        lista.imprimir();
        lista.removerElementoFim();
        lista.imprimir();
        lista.removerElementoFim();
        lista.imprimir();
        lista.removerElementoFim();
        lista.imprimir();



    }
}
