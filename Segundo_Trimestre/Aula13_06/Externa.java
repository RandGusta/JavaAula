public class Externa {
   static class interna{// não é acessivel sem acessar a classe externa primeiramente --> caso n esteja static(static class interna)
                        // para chamar a internea é preciso estanciar a externa
                         // porem static não é necessário a referência de externa 
    public void imprimir(){ 
      System.out.println("Classe interna");
    }
  }
  
}
