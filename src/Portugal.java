import java.util.ArrayList;
import java.util.List;

public class Portugal extends RepresentaPais {

    List<String> vizinhoPRT = new ArrayList<>();

    public Portugal() {
        this.setCodigoIso("PRT");
        this.setNome("PORTUGAL");
        this.setPopulacao(10310.000);
        this.setDimensao(88.889);

    }

    public void vizinhoPortugal() {

        vizinhoPRT.add("ESPANHA");
    }

    public boolean evizinho(String vizinho){
        for (int i = 0; i < this.vizinhoPRT.size(); i++) {
            if(this.vizinhoPRT.get(i) == vizinho){
                return true;
            }

        }
        return false;
    }

    public double densidadePopulaciona(){

        return this.populacao / this.dimensao;
    }
}
