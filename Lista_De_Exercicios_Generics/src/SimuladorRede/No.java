package SimuladorRede;

import java.util.ArrayList;
import java.util.List;

public class No<T>{
    private T dispositivo;
    private List<Conexao<T>> conexoes;

    public No(T dispositivo) {
        this.dispositivo = dispositivo;
        this.conexoes = new ArrayList<>();
    }

    public T getDispositivo() {
        return dispositivo;
    }

    public List<Conexao<T>> getConexoes() {
        return conexoes;
    }

    public void addConexao(No<T> outro){
        conexoes.add(new Conexao<>(this,outro));
    }

    public boolean removerConexao(No<T> outro){
        return conexoes.removeIf(conexao -> conexao.getDestino().equals(outro));
    }

    public void ping(No<T> no){
        if (conexoes.contains(no)) {
            for (int i=0;i <3; i++ ){
                System.out.println("Reply from " + no.getDispositivo() + ", bytes=32, time=100ms");
            }
        }else System.out.println(no.getDispositivo() + " unreachable!");
    }
}
