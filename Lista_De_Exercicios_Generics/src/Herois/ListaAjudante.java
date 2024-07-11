package Herois;

import java.util.List;

public class ListaAjudante implements Lista<Ajudante>{
    private List<Personagem<Ajudante>> personagens;

    public ListaAjudante() {
    }


    @Override
    public void addPersonagem(Personagem<Ajudante> personagem) {
        personagens.add(personagem);
    }

    @Override
    public void removerPersonagem(Personagem<Ajudante> personagem) {
        personagens.remove(personagem);
    }
}
