package Herois;

import java.util.List;

public class ListaSuperHeroi implements Lista<SuperHeroi>{
    private List<Personagem<SuperHeroi>> personagens;

    public ListaSuperHeroi() {
    }


    @Override
    public void addPersonagem(Personagem<SuperHeroi> personagem) {
        personagens.add(personagem);
    }

    @Override
    public void removerPersonagem(Personagem<SuperHeroi> personagem) {
        personagens.remove(personagem);
    }
}
