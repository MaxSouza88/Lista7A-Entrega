
public abstract class RepresentaPais {

    String codigoIso;
    String nome;
    double populacao;
    double dimensao;

    public RepresentaPais() {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }




    @Override
    public String toString() {
        return "RepresentaPais{" +
                "codigoIso='" + codigoIso + '\'' +
                ", nome='" + nome + '\'' +
                ", populacao=" + populacao +
                ", dimensao=" + dimensao +
                '}';
    }
}
