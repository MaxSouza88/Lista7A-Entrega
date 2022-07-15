import java.util.ArrayList;
import java.util.List;

public class Espanha extends RepresentaPais{



    List<String> vizinhoESP = new ArrayList<>();

   public Espanha(){
       super();
       this.setCodigoIso("ESP");
       this.setNome("ESPANHA");
       this.setPopulacao(465013.74);
       this.setDimensao(505.990);
   }


   public void vizinhoEspanha(){

        vizinhoESP.add("FRANÇA");
        vizinhoESP.add("PORTUGAL");
        vizinhoESP.add("ANDORRA");

    }

    public boolean evizinho(String vizinho){
        for (int i = 0; i < this.vizinhoESP.size(); i++) {
          if(this.vizinhoESP.get(i) == vizinho){
              return true;
          }

        }
        return false;
    }

    public double densidadePopulaciona(){

       return this.populacao / this.dimensao;
    }


}
