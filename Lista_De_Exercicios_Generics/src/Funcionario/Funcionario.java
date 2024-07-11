package Funcionario;

import java.util.ArrayList;
import java.util.List;

public class Funcionario <T>{

        private List<T> funcionarios;

        public Funcionario() {
            this.funcionarios = new ArrayList<>() {
            };
        }

        public void addMembro(T membro){
            this.funcionarios.add(membro);
        }

        public void removerMembro(T membro){
            this.funcionarios.remove(membro);
        }

        public List<T> getMembros(){
            return this.funcionarios;
        }

        public boolean estaVazia(){
            return funcionarios.isEmpty();
        }
}


