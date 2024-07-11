package SimuladorRede;

public class Conexao <T>{
    private No<T> origem, destino;

    public Conexao(No<T> origem, No<T> destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public No<T> getOrigem() {
        return origem;
    }

    public No<T> getDestino() {
        return destino;
    }
}
