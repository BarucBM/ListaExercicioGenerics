package Familia;


import java.util.ArrayList;
import java.util.List;

public class Familia <T>{
    private List<T> familia;

    public Familia() {
        this.familia = new ArrayList<>() {
        };
    }

    public void addMembro(T membro){
        this.familia.add(membro);
    }

    public void removerMembro(T membro){
        this.familia.remove(membro);
    }

    public List<T> getMembros(){
        return this.familia;
    }

    public boolean estaVazia(){
        return familia.isEmpty();
    }
}
