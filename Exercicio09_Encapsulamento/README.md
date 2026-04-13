# Exercício 09 — Encapsulamento

## Objetivo

Neste exercício vamos aprender:

- O que é **encapsulamento** em Orientação a Objetos
- A diferença entre `public` (acessível de fora) e `private` (protegido)
- Como usar **getters** (para ler dados protegidos)
- Como usar **setters** (para escrever dados com validação)
- Por que encapsulamento é importante (proteção e validação de dados)

---

## Contexto (por quê aprender encapsulamento?)

Nos exercícios anteriores (01-08), seus atributos eram `public`:

```java
public String nome;   // Qualquer um pode acessar/modificar
public int idade;
```

Isso significa que você (ou outra pessoa) poderia fazer:

```java
aluno.nome = "";              // Nome vazio? Permitido!
aluno.idade = -50;            // Idade negativa? Permitido!
aluno.idade = 999999999;      // Idade impossível? Permitido!
```

Com **encapsulamento**, você **protege** os dados:

```java
private String nome;   // Só posso acessar via getter/setter
private int idade;

// Agora só posso mudar assim:
aluno.setNome("João");   // Com validação!
aluno.setIdade(18);      // Com validação!
```

---

## Estrutura deste exercício

Nesta pasta existem dois arquivos:

- `Aluno.java`: define a classe com **encapsulamento**
  - Atributos `private` (protegidos)
  - 2 **getters** (para ler: `getNome()`, `getIdade()`)
  - 2 **setters** (para escrever com validação: `setNome()`, `setIdade()`)
- `Principal.java`: demonstra como usar getters/setters

Você deverá executar o `Principal.java`, observar a saída e responder as perguntas no arquivo de respostas.

---

## Conceitos principais

### `private` vs `public`

```java
// PUBLIC: Qualquer um pode acessar (sem proteção)
public String nome;

// PRIVATE: Só a classe pode acessar (protegido)
private String nome;
```

### Getter (para LER dados)

```java
// Método público que permite LER o atributo private
public String getNome() {
    return nome;
}

// Uso:
String nomeLido = aluno.getNome();  // Consegue ler
```

### Setter (para ESCREVER dados com validação)

```java
// Método público que permite ESCREVER com VALIDAÇÃO
public void setNome(String novoNome) {
    if (novoNome == null || novoNome.isEmpty()) {
        System.out.println("Erro: Nome não pode ser vazio!");
        return;  // Não modifica se inválido
    }
    this.nome = novoNome;  // Só modifica se válido
}

// Uso:
aluno.setNome("João");     // Válido, funciona
aluno.setNome("");         // Inválido, rejeitado
```

---

## Atividade 1 — Rodando o programa

1. Execute o `Principal.java`.
2. Observe como a validação funciona:
   - Valores válidos são aceitos
   - Valores inválidos são rejeitados com mensagem de erro
3. Repare que os dados nunca ficam inválidos

## Atividade 2 — Entendendo `private`

Na classe `Aluno`, todos os atributos são `private`:

```java
private String nome;
private int idade;
```

Isso significa:

- ❌ Você **não pode** fazer: `aluno.nome = "João";` (erro de compilação!)
- ✅ Você **deve** fazer: `aluno.setNome("João");` (através do setter)

## Atividade 3 — Perguntas

Responda no `Resposta_Exercicio_09.md` (ou no seu caderno):

1. O que é encapsulamento?
2. Qual é a diferença entre `public` e `private`?
3. O que é um getter?
4. O que é um setter?
5. Por que usar setters em vez de permitir acesso direto aos atributos?
6. O que significa validação de dados?

---

## Como executar (Windows)

Na raiz do projeto:

```bat
javac Exercicio09_Encapsulamento\Aluno.java Exercicio09_Encapsulamento\Principal.java
java Exercicio09_Encapsulamento.Principal
```
