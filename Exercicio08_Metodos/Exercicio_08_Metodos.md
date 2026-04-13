# Exercício 08 — Métodos

## Objetivo

Entender o que é um **método**, como **chamar** métodos e a diferença entre métodos **void** (sem retorno) e **com retorno**.

---

## O que é um método?

Um **método** é uma "ação" ou "comportamento" que um objeto pode executar.

Até agora, você trabalhou com **atributos** (dados):
```java
aluno.nome = "João";     // Atributo (dado)
aluno.idade = 18;        // Atributo (dado)
```

Agora vamos aprender **métodos** (comportamento):
```java
aluno.apresentar();      // Método (ação)
int ano = aluno.calcularAnoNascimento();  // Método que retorna algo
```

---

## Tipos de método

### Tipo 1: VOID (sem retorno, sem parâmetro)

```java
public void apresentar() {
    System.out.println("Olá, meu nome é " + nome);
}
```

- **void** significa "não retorna nada"
- Você **chama** o método para fazer algo
- Ele não devolve nenhum valor para você

Uso:
```java
aluno.apresentar();  // Apenas executa
```

### Tipo 2: VOID (sem retorno, com parâmetro)

```java
public void fazer(int nota) {
    System.out.println(nome + " fez prova com nota " + nota);
}
```

- Recebe **parâmetros** (entrada)
- **void** = não retorna nada
- Você passa dados para o método fazer algo

Uso:
```java
aluno.fazer(85);  // Passa a nota como parâmetro
```

### Tipo 3: COM RETORNO (retorna algo, sem parâmetro)

```java
public int calcularAnoNascimento() {
    int anoAtual = 2026;
    return anoAtual - idade;
}
```

- **int** (antes do nome) = retorna um inteiro
- **return** = devolve um valor
- Você pode guardar o resultado em uma variável

Uso:
```java
int ano = aluno.calcularAnoNascimento();  // Recebe o resultado
```

### Tipo 4: COM RETORNO (retorna algo, com parâmetro)

```java
public int multiplicarIdade(int multiplicador) {
    return idade * multiplicador;
}
```

- Recebe **parâmetro** (multiplicador)
- **return** = devolve um valor
- Você passa dados E recebe um resultado

Uso:
```java
int resultado = aluno.multiplicarIdade(2);  // Passa 2, recebe 36 (se idade é 18)
```

---

## Atividade 1 — Execute e observe

1. Execute o `Principal.java` como está.
2. Observe a saída e veja como cada método funciona.
3. Repare em qual métodos imprimem direto e quais devolvem valores.

---

## Atividade 2 — Entendendo cada método

No arquivo `Aluno.java`, você tem:

| # | Nome | Tipo | Parâmetro? | Retorno? | O que faz? |
|---|------|------|-----------|----------|-----------|
| 1 | `apresentar()` | void | Não | Não | Imprime apresentação |
| 2 | `fazer(nota)` | void | Sim | Não | Imprime que fez prova |
| 3 | `calcularAnoNascimento()` | int | Não | Sim | Retorna ano estimado |
| 4 | `obterCategoria()` | String | Não | Sim | Retorna "Maior" ou "Menor" |
| 5 | `multiplicarIdade(mult)` | int | Sim | Sim | Retorna idade vezes multiplicador |
| 6 | `exibirInfo()` | void | Não | Não | Imprime tudo sobre aluno |

---

## Atividade 3 — Comparando tipos

Complete a tabela abaixo com um ✓ ou ✗:

| Método | Imprime algo? | Retorna valor? | Recebe parâmetro? |
|--------|---------------|----------------|-------------------|
| `apresentar()` | ? | ? | ? |
| `fazer(nota)` | ? | ? | ? |
| `calcularAnoNascimento()` | ? | ? | ? |
| `multiplicarIdade(mult)` | ? | ? | ? |

---

## Atividade 4 — Chamando métodos

Na `Principal.java`, você vê exemplos como:

```java
aluno1.apresentar();  // Chama o método apresentar
int ano = aluno1.calcularAnoNascimento();  // Chama e guarda resultado
```

**O que significa usar o `.` (ponto)?**

O ponto significa: "acesse algo dentro do objeto".

```java
aluno1.apresentar();  // Acesso o método 'apresentar' do objeto 'aluno1'
aluno1.nome;          // Acesso o atributo 'nome' do objeto 'aluno1'
```

---

## Atividade 5 — Perguntas

Responda:

1. **O que é um método em Java?**

2. **Qual é a diferença entre um atributo e um método?**
   - Dica: Uma é um dado, outra é uma ação.

3. **O que significa `void` em um método?**

4. **Quando você usa um método VOID vs um método com RETORNO?**

5. **Como você "chama" um método?**

6. **A classe `Aluno` tem quantos métodos? Liste todos os 6.**

7. **Qual é o método mais útil na prática?**

---

## Atividade 6 — Modificando o código

Abra `Aluno.java` e **crie um novo método**:

```java
public double calcularIdadeEmDias() {
    // Cada ano tem aproximadamente 365 dias
    double dias = idade * 365.0;
    return dias;
}
```

Depois, abra `Principal.java` e **chame o novo método**:

```java
double diasJoao = aluno1.calcularIdadeEmDias();
System.out.println(aluno1.nome + " tem aproximadamente " + diasJoao + " dias de vida.");
```

Execute e veja o resultado!

---

## Atividade 7 — Criando seu próprio método

Crie um novo método na classe `Aluno` que:

1. **Calcule o ano atual menos a idade**
2. **Retorne um valor inteiro** (o ano de nascimento)

Dica: Você já tem algo parecido no método `calcularAnoNascimento()`!

Se conseguir, parabéns! Você já sabe criar métodos! 🎉

---

## Atividade 8 — Reflexão final

Responda:

1. **Um método pode ter múltiplos parâmetros?** (Sim ou não? Procure na Aluno.java)

2. **Qual é a vantagem de usar métodos em vez de deixar tudo na `main`?**

3. **Se você tivesse 1000 alunos, seria mais fácil usar métodos ou repetir código?**

4. **Qual método você criaria para a classe `Aluno` que seria útil na prática?**
   - Exemplo: `verificarSePassou()`, `calcularMedia()`, `estarComIdadeParaVotar()`
