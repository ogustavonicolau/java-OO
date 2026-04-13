# Exercício 09 — Encapsulamento

## Objetivo

Entender o que é **encapsulamento**, a diferença entre `public` e `private`, e como usar **getters** e **setters** para proteger e validar dados.

---

## O que é Encapsulamento?

**Encapsulamento** é um dos pilares da Orientação a Objetos que significa:

> Proteger os dados (atributos) dentro de uma classe e permitir acesso controlado via métodos (getters/setters)

### Analogia do mundo real:

Você não tem acesso direto ao disco rígido do seu computador. Você usa um programa (Windows, Mac, Linux) para acessá-lo de forma segura.

```
├─ Dados (Disco rígido)      → Private (protegido)
└─ Métodos (Sistema Operacional) → Public (acessível)
```

---

## `public` vs `private`

### `public` (acessível de fora)

```java
public String nome;

// Você pode acessar diretamente:
aluno.nome = "João";
aluno.nome = "";              // Vazio? Permitido!
aluno.nome = null;            // Nulo? Permitido!
aluno.nome = "123456789";     // Qualquer coisa? Permitido!
```

**Problema**: Dados podem ficar inválidos!

### `private` (protegido dentro da classe)

```java
private String nome;

// Você NÃO pode acessar diretamente:
aluno.nome = "João";  // ❌ ERRO DE COMPILAÇÃO!

// Você DEVE usar um método:
aluno.setNome("João");  // ✅ Correto (com validação)
```

**Benefício**: Dados sempre válidos!

---

## Getter (método para LER)

Um **getter** é um método que permite **ler** um atributo `private`.

```java
private String nome;

// Getter para leitura
public String getNome() {
    return nome;
}

// Uso:
String nomeLido = aluno.getNome();
System.out.println(nomeLido);
```

**Convenção Java**: `get` + nome do atributo (letra maiúscula)
- `getNome()` para atributo `nome`
- `getIdade()` para atributo `idade`

---

## Setter (método para ESCREVER com validação)

Um **setter** é um método que permite **escrever** um atributo `private` com **validação**.

```java
private String nome;

// Setter para escrita (com validação)
public void setNome(String novoNome) {
    // Validação 1: Não vazio
    if (novoNome == null || novoNome.isEmpty()) {
        System.out.println("Erro: Nome não pode ser vazio!");
        return;  // Para aqui
    }

    // Validação 2: Mínimo 3 caracteres
    if (novoNome.length() < 3) {
        System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
        return;  // Para aqui
    }

    // Se passou todas as validações:
    this.nome = novoNome;  // Atribui
    System.out.println("Nome atualizado com sucesso!");
}

// Uso:
aluno.setNome("João");   // ✅ Válido
aluno.setNome("AB");     // ❌ Inválido (muito curto)
aluno.setNome("");       // ❌ Inválido (vazio)
```

**Convenção Java**: `set` + nome do atributo (letra maiúscula)
- `setNome()` para atributo `nome`
- `setIdade()` para atributo `idade`

---

## Atividade 1 — Execute e observe

1. Execute o `Principal.java` como está.
2. Observe a saída e veja:
   - Quais modificações foram **aceitas**
   - Quais modificações foram **rejeitadas**
   - Por que foram rejeitadas
3. Repare que os dados nunca ficam inválidos

---

## Atividade 2 — Comparando com exercícios anteriores

### Exercícios 01-08 (SEM encapsulamento):

```java
public class Aluno {
    public String nome;    // PUBLIC = sem proteção
    public int idade;
}

// Na main:
Aluno aluno = new Aluno();
aluno.nome = "";           // Vazio? Aceito!
aluno.idade = -50;         // Negativo? Aceito!
aluno.idade = 99999;       // Gigante? Aceito!
// ❌ Dados podem ficar inválidos
```

### Exercício 09 (COM encapsulamento):

```java
public class Aluno {
    private String nome;   // PRIVATE = protegido
    private int idade;
}

// Na main:
Aluno aluno = new Aluno();
aluno.setNome("");         // Vazio? ❌ Rejeitado!
aluno.setIdade(-50);       // Negativo? ❌ Rejeitado!
aluno.setIdade(99999);     // Gigante? ❌ Rejeitado!
// ✅ Dados sempre válidos
```

---

## Atividade 3 — Entendendo a validação

Na classe `Aluno.java`, o setter `setNome()` valida:

```java
public void setNome(String novoNome) {
    // Validação 1: Não vazio ou nulo
    if (novoNome == null || novoNome.isEmpty()) {
        System.out.println("Erro: Nome não pode ser vazio!");
        return;
    }

    // Validação 2: Mínimo 3 caracteres
    if (novoNome.length() < 3) {
        System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
        return;
    }

    // Passou todas? Atribui
    this.nome = novoNome;
    System.out.println("Nome atualizado com sucesso!");
}
```

**Leia a saída do `Principal.java` e identifique:**

1. Qual tentativa foi **aceita**?
2. Qual tentativa foi **rejeitada** por ser muito curta?
3. Qual tentativa foi **rejeitada** por ser vazia?

---

## Atividade 4 — Perguntas

Responda:

1. **O que é encapsulamento?**

2. **Qual é a diferença entre `public` e `private`?**

3. **O que um getter faz?**

4. **O que um setter faz?**

5. **Por que usar setters em vez de permitir acesso direto aos atributos?**
   - Dica: Pense em dados inválidos.

6. **O que significa "validação" de dados?**
   - Dica: Veja no setter.

7. **Qual é o nome do padrão getter/setter?**
   - Dica: Olhe a convenção de nomes (`getNome`, `setNome`).

---

## Atividade 5 — Criando seu próprio setter

Na classe `Aluno.java`, já existem setters para `nome` e `idade`.

**Crie um novo método** na classe `Aluno`:

```java
public void setIdade(int novaIdade) {
    // Valide:
    // 1. Não pode ser negativa
    // 2. Não pode ser maior que 150

    // Se válida, atribua
    // Se inválida, mostre erro
}
```

Depois, na `Principal.java`, **teste o novo setter** com valores válidos e inválidos.

---

## Atividade 6 — Modificando a validação

O setter `setNome()` valida:

1. Não vazio
2. Mínimo 3 caracteres

**Adicione uma terceira validação:**

- Máximo 50 caracteres

Modifique o código de `Aluno.java` e teste com um nome muito longo.

---

## Atividade 7 — Reflexão final

Responda:

1. **Se todos os atributos fossem `public`, qual seria o problema?**

2. **Se todos os atributos fossem `private` mas SEM getters/setters, qual seria o problema?**

3. **Qual é o balanço correto: `private` + `public` getters/setters?**
   - Dica: Olhe para a classe `Aluno`.

4. **Na sua profissão (ou futuro trabalho), por que encapsulamento é importante?**
   - Dica: Pense em bancos, hospitais, sistemas críticos.

5. **Você implementaria encapsulamento em TODAS as classes que cria?**
   - Por quê? Por quê não?
