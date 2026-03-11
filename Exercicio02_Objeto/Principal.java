package Exercicio02_Objeto;

public class Principal {

    public static void main(String[] args) {

        // OBJETO é o "Aluno de verdade" criado a partir do molde (classe).
        // A variável 'objetoAluno' vai guardar a referência para esse objeto.
        Aluno objetoAluno = new Aluno();

        System.out.println("Exercicio 02 - Objeto criado com sucesso.");
        System.out.println("Esse objetoAluno é um Aluno real (instancia) criado a partir da classe Aluno.");

    }

}