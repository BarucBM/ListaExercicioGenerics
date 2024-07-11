package Herois;

import java.util.List;

public class ListaVilao implements Lista<Vilao>{
    private List<Personagem<Vilao>> personagens;

    public ListaVilao() {
    }


    @Override
    public void addPersonagem(Personagem<Vilao> personagem) {
        personagens.add(personagem);
    }

    @Override
    public void removerPersonagem(Personagem<Vilao> personagem) {
        personagens.remove(personagem);
    }
}
