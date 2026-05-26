package Java_12_Relacoes;

// Escola: classe principal que demonstra os tres tipos de relacao
public class Escola {

    private String nome;
    private String cnpj;

    // COMPOSICAO: Endereco e criado dentro da Escola e depende dela
    private Endereco endereco;

    // COMPOSICAO: Departamentos sao criados e gerenciados pela Escola
    private Departamento[] departamentos;
    private int nrDepartamentos;

    // AGREGACAO: Alunos existem independente da Escola
    private Aluno[] discentes;
    private int nrDiscentes;

    public Escola(String nome, String cnpj, String rua, String cidade, String cep) {
        this.nome = nome;
        this.cnpj = cnpj;
        // Composicao: Endereco e criado junto com a Escola
        this.endereco = new Endereco(rua, cidade, cep);
        this.departamentos = new Departamento[10];
        this.discentes = new Aluno[1000];
        this.nrDepartamentos = 0;
        this.nrDiscentes = 0;
    }

    // Composicao: Escola cria o Departamento internamente
    public void criarDepartamento(String nomeDepartamento, Professor professor) {
        if (nrDepartamentos < 10) {
            departamentos[nrDepartamentos] = new Departamento(nomeDepartamento, professor);
            nrDepartamentos++;
        } else {
            System.out.println("Nao e possivel criar outro Departamento.");
        }
    }

    // Agregacao: Aluno ja existe antes de ser matriculado na Escola
    public void matricularAluno(Aluno novoAluno) {
        if (nrDiscentes < 1000) {
            discentes[nrDiscentes] = novoAluno;
            nrDiscentes++;
        }
    }

    public void exibirInfo() {
        System.out.println("=== Escola: " + nome + " ===");
        System.out.println("CNPJ: " + cnpj);
        endereco.exibir();

        System.out.println("Departamentos (" + nrDepartamentos + "):");
        for (int i = 0; i < nrDepartamentos; i++) {
            departamentos[i].exibir();
        }

        System.out.println("Alunos matriculados (" + nrDiscentes + "):");
        for (int i = 0; i < nrDiscentes; i++) {
            discentes[i].exibir();
        }
    }

}
