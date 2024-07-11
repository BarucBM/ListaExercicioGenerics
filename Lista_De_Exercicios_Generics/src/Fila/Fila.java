package Fila;

import java.util.ArrayList;

public class Fila <T>{
    private ArrayList<T>fila;

    public Fila() {
        this.fila = new ArrayList<>();
    }

    public void enfileirar(T item){
        this.fila.add(item);
    }

    public void desenfileirar(){
        if(this.fila.isEmpty()) System.out.println("A lista está vazia!");
        else this.fila.remove(0);
    }

    public boolean estaVazia(){
        return this.fila.isEmpty();
    }
}
