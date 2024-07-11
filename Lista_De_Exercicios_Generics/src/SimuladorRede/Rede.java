package SimuladorRede;

import java.util.ArrayList;
import java.util.List;

public class Rede <T>{
    private List<No<T>> nos;

    public Rede() {
        this.nos = new ArrayList<>();
    }

    public void addNo(No<T> no){
        nos.add(no);
    }

    public void conectar(No<T> no1, No<T> no2){
        no1.addConexao(no2);
        no2.addConexao(no1);
    }

    public void desconectar(No<T> no1, No<T> no2){
        if(no1.removerConexao(no2) && no2.removerConexao(no1)) System.out.println("Conexão removida!");
        else System.out.println("Esses nós não estão conectados");
    }

    public void simular() {
        System.out.println("Simulando a rede:");
        for (No<T> no : nos) {
            System.out.println("Nó: " + no.getDispositivo());
            for (Conexao<T> conexao : no.getConexoes()) {
                System.out.println("  Conectado a: " + conexao.getDestino().getDispositivo() );
            }
        }
    }
}
