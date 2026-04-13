# Respostas — Exercício 08 (Métodos)

## Atividade 1 — Execute e observe

Depois de rodar `Principal.java`, você deve ter visto:

```
=== Exercício 08 - Métodos ===

--- Método VOID: apresentar() ---
Olá, meu nome é João Silva e tenho 18 anos.
Olá, meu nome é Maria Santos e tenho 16 anos.

--- Método VOID com parâmetro: fazer(nota) ---
João Silva fez um teste com nota 85
Maria Santos fez um teste com nota 92

--- Método com RETORNO (int): calcularAnoNascimento() ---
João nasceu em: 2008
Maria nasceu em: 2010

--- Método com RETORNO (String): obterCategoria() ---
João Silva é: Maior de idade
Maria Santos é: Menor de idade

--- Método com parâmetro E retorno: multiplicarIdade(int) ---
Idade de João vezes 2: 36
Idade de Maria vezes 3: 48

--- Método VOID que imprime vários dados: exibirInfo() ---
===== Informações do Aluno =====
Nome: João Silva
Idade: 18
Ano de nascimento (estimado): 2008
Categoria: Maior de idade
================================

===== Informações do Aluno =====
Nome: Maria Santos
Idade: 16
Ano de nascimento (estimado): 2010
Categoria: Menor de idade
================================

--- Usando tudo junto ---
Aluno criado:
Olá, meu nome é Carlos e tenho 20 anos.
Nascimento estimado: 2006
Categoria: Maior de idade
Carlos fez um teste com nota 75

=== Conclusão ===
Métodos adicionam COMPORTAMENTO aos objetos.
Métodos VOID: fazem algo mas não retornam nada.
Métodos com RETORNO: fazem algo e devolvem um resultado.
```

---

## Atividade 3 — Tabela de comparação

| Método | Imprime algo? | Retorna valor? | Recebe parâmetro? |
|--------|---------------|----------------|-------------------|
| `apresentar()` | ✓ Sim | ✗ Não | ✗ Não |
| `fazer(nota)` | ✓ Sim | ✗ Não | ✓ Sim |
| `calcularAnoNascimento()` | ✗ Não | ✓ Sim | ✗ Não |
| `multiplicarIdade(mult)` | ✗ Não | ✓ Sim | ✓ Sim |

---

## Atividade 5 — Perguntas

### 1. O que é um método em Java?

Um **método** é um bloco de código que executa uma ação específica. É como uma função dentro de uma classe.

Métodos adicionam **comportamento** aos objetos (as coisas que eles podem fazer).

### 2. Qual é a diferença entre um atributo e um método?

- **Atributo**: É um **dado** (armazena informação)
  ```java
  public String nome;  // Armazena o nome do aluno
  ```

- **Método**: É uma **ação** (executa lógica)
  ```java
  public void apresentar() { ... }  // Executa a ação de se apresentar
  ```

### 3. O que significa `void` em um método?

`void` significa **"sem retorno"** ou **"não retorna nada"**.

Um método `void` executa uma ação mas não devolve nenhum valor:

```java
public void apresentar() { ... }  // Faz algo mas não retorna nada
```

### 4. Quando você usa um método VOID vs um método com RETORNO?

- **VOID**: Quando você quer fazer algo mas não precisa de um resultado
  - Exemplo: `apresentar()` (só imprime), `fazer(nota)` (só imprime)

- **COM RETORNO**: Quando você quer calcular algo e receber o resultado
  - Exemplo: `calcularAnoNascimento()` (calcula e retorna um número)

### 5. Como você "chama" um método?

Você chama usando o **ponto `.`**:

```java
aluno.apresentar();              // Chama sem parâmetro
aluno.fazer(85);                 // Chama com parâmetro
int ano = aluno.calcularAnoNascimento();  // Chama e pega resultado
```

### 6. A classe `Aluno` tem quantos métodos? Liste todos os 6.

1. `void apresentar()`
2. `void fazer(int nota)`
3. `int calcularAnoNascimento()`
4. `String obterCategoria()`
5. `int multiplicarIdade(int multiplicador)`
6. `void exibirInfo()`

### 7. Qual é o método mais útil na prática?

Provavelmente `exibirInfo()`, porque:
- Reúne várias informações em um só lugar
- Evita ter que chamar vários métodos separados
- É útil para "resumir" os dados de um objeto

---

## Atividade 6 — Modificando o código

Você deve ter adicionado na classe `Aluno`:

```java
public double calcularIdadeEmDias() {
    double dias = idade * 365.0;
    return dias;
}
```

E na `Principal.java`:

```java
double diasJoao = aluno1.calcularIdadeEmDias();
System.out.println(aluno1.nome + " tem aproximadamente " + diasJoao + " dias de vida.");
```

Resultado esperado (para João com 18 anos):
```
João Silva tem aproximadamente 6570.0 dias de vida.
```

---

## Atividade 7 — Criando seu próprio método

Seu novo método poderia ser:

```java
public int obterAnoNascimento() {
    int anoAtual = 2026;
    return anoAtual - idade;
}
```

Ou simplificado (chamando um método que já existe):

```java
public int obterAnoNascimento() {
    return calcularAnoNascimento();
}
```

Quando chamar:
```java
int ano = aluno1.obterAnoNascimento();
System.out.println("Ano de nascimento: " + ano);
```

---

## Atividade 8 — Reflexão final

### 1. Um método pode ter múltiplos parâmetros?

**Sim!** Olhe para a classe `Aluno` — ela tem métodos com parâmetros.

Exemplo de um método com **múltiplos parâmetros**:

```java
public void calcularMedia(int nota1, int nota2, int nota3) {
    int media = (nota1 + nota2 + nota3) / 3;
    System.out.println("Média: " + media);
}

// Chamada:
aluno.calcularMedia(80, 85, 90);
```

### 2. Qual é a vantagem de usar métodos em vez de deixar tudo na `main`?

Vantagens:

1. **Reutilização**: Você chama o método várias vezes
2. **Organização**: Código mais limpo e legível
3. **Manutenção**: Se precisa mudar algo, muda em um só lugar
4. **Não-repetição**: Evita copiar-colar código

Exemplo:
```java
// SEM métodos (código repetido):
System.out.println("Olá, meu nome é João e tenho 18 anos");
System.out.println("Olá, meu nome é Maria e tenho 16 anos");
// ... repetir isso 1000 vezes?

// COM métodos (reutilizável):
aluno1.apresentar();
aluno2.apresentar();
// ... chamar é simples!
```

### 3. Se você tivesse 1000 alunos, seria mais fácil usar métodos ou repetir código?

**Definitivamente usar métodos!**

```java
// SEM métodos: 3000 linhas de código (3 por aluno)
System.out.println(...);
System.out.println(...);
System.out.println(...);
... repetido 1000 vezes

// COM métodos: 1000 linhas (1 por aluno)
for (int i = 0; i < 1000; i++) {
    alunos[i].apresentar();
}
```

### 4. Qual método você criaria para a classe `Aluno` que seria útil na prática?

Algumas ideias práticas:

```java
// Verificar se passou em uma disciplina
public boolean passou(int nota) {
    return nota >= 60;
}

// Calcular se pode votar
public boolean podeVotar() {
    return idade >= 18;
}

// Calcular tempo até maioridade
public int anosAteMaioridade() {
    if (idade >= 18) {
        return 0;  // Já é maior
    }
    return 18 - idade;
}

// Comparar idades de dois alunos
public int compararIdadeComOutro(Aluno outro) {
    return this.idade - outro.idade;
}
```

---

## Resumo do aprendizado

✅ **Método** = bloco de código que executa uma ação
✅ **void** = não retorna nada
✅ **return** = devolve um valor
✅ **Parâmetro** = dados que você passa para o método
✅ **Reutilização** = chamar o mesmo método várias vezes

Próximo passo: **Encapsulamento** (Exercício 09), que é proteger dados usando `private` e `public`!
