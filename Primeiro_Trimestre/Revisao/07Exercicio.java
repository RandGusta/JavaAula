// Classficação de Crises Hospitalares 
// Uma Lista de pacientes dados de gravidade e tempo de espera deve ser ordenada de forma
// que os mais graves sejam atendiddos primeiro. Em caso de empate quem espera há
// a mais tempo tem prioridade
import java.util.Arrays;
public class Main{
  public static void main(String[] args){
  String[] lista = {"João,gravidade=3,tempo=5", "Maria,gravidade=3,tempo=10", "Lucas,gravidade=5,tempo=2" };  

  }

  public static String[] ordemPaciente(String[] lista){
    for(int i=0; i<lista.length-1; i++){
      String[] listaSplit = lista[i].split(",");
      System.out.println(Arrays.toString(listaSplit));
      conferindoGravidade(listaSplit);
      
      
      
    }

  
  }


  public static void conferindoGravidade(String[] listaSplit){
      String gravidade =  listaSplit[1];
      String gravidadeSplit = gravidade.split("=");
      int gravidade = Integer.parseInt(gravidadeSplit[2]);
  }

  
}
