package Exercicio05_Preencher;

public class Principal {

    public static void main(String[] args) {

        // 1) Criar o objeto (aluno real)
        Aluno aluno = new Aluno();

        // 2) Preencher os atributos usando o ponto '.'
        // O ponto significa: "acesse algo que esta dentro do objeto"
        aluno.nome = "Maria";
        aluno.idade = 19;

        Aluno aluno2 = new Aluno();

        aluno2.nome = "Pedro";
        aluno2.idade = 22;

        Aluno aluno3 = new Aluno();

        // 3) Imprimir os dados
        System.out.println("Exercicio 05 - Preenchendo atributos depois que o objeto nasce.");
        System.out.println("Nome do Aluno: " + aluno.nome);
        System.out.println("Idade do Aluno: " + aluno.idade);
        System.out.println("Nome do Aluno 2: " + aluno2.nome);
        System.out.println("Idade do Aluno 2: " + aluno2.idade);

        System.out.println("Aluno 1: " + aluno.nome + "-" + aluno.idade);
        System.out.println("Aluno 2: " + aluno2.nome + "-" + aluno2.idade);

        System.out.println("Aluno 3 nome: " + aluno3.nome);
        System.out.println("Aluno 3 idade: " + aluno3.idade);

    }

}