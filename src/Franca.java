import java.util.ArrayList;
import java.util.List;

public class Franca extends RepresentaPais {

    List<String> vizinhoFRA = new ArrayList<>();

    List<String> guardaPaises = new ArrayList<>();
    String a;

    public Franca() {
        this.setCodigoIso("FRA");
        this.setNome("FRANÇA");
        this.setPopulacao(65946.426);
        this.setDimensao(543.940);
    }

    public void vizinhoFranca() {

        vizinhoFRA.add("ESPANHA");
        vizinhoFRA.add("ALEMANHA");
        vizinhoFRA.add("LUXEMBURGO");
        vizinhoFRA.add("ITALIA");
        vizinhoFRA.add("SUIÇA");
        vizinhoFRA.add("ANDORRA");
        vizinhoFRA.add("MÔNACO");

    }

    public boolean evizinho(String vizinho) {
        for (int i = 0; i < this.vizinhoFRA.size(); i++) {
            if (this.vizinhoFRA.get(i) == vizinho) {
                return true;
            }

        }
        return false;
    }

    public double densidadePopulaciona() {

        return this.populacao / this.dimensao;
    }

    public void vizinhoEmComum(List<String> vizinhosEmComum) {

        for (int i = 0; i < this.vizinhoFRA.size(); i++) {
            System.out.println("FRANÇA " +i);
            System.out.println(this.vizinhoFRA.get(i));

            for (int j = 0; j < vizinhosEmComum.size(); j++) {
                System.out.println("p " +j);
                System.out.println(vizinhosEmComum.get(j));

                if (this.vizinhoFRA.get(i) == vizinhosEmComum.get(j)) {
                    //pegar valor igual entre as listas e armazenar no array guardapaises

                }
            }
            //System.out.println("Imprimir paises iguais");
        }
    }


}
