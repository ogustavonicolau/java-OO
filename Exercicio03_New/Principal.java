package Exercicio03_New;

public class Principal{

    public static void main(String[] args) {

        // 'new Aluno()' é a parte que CRIA o objeto na memória.
        // Sem o 'new', nenhum objeto real é criado.
        Aluno a1 = new Aluno();

        // Vamos criar um segundo objeto, para mostrar que podemos criar varios.
        Aluno a2 = new Aluno();

        Aluno a3 = new Aluno();

        System.out.println("Exercicio 03 - Criamos dois objetos com new.");
        System.out.println("a1 e a2 sao dois alunos diferentes na memoria.");
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);
        System.out.println("Três objetos foram criados");

        a1.nome = "Carlos";
        a1.idade = 20;

        a2.nome = "Maria";
        a2.idade = 19;

        a3.nome = "Pedro";
        a3.idade = 22;

        System.out.println(a1.nome);
        System.out.println(a2.nome);
        System.out.println(a3.nome);


    }

}