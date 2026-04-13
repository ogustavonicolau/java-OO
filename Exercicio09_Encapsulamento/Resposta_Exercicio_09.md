# Respostas — Exercício 09 (Encapsulamento)

## Atividade 1 — Execute e observe

Depois de rodar `Principal.java`, você deve ter visto algo como:

```
=== Exercício 09 - Encapsulamento ===

--- Criados dois alunos com sucesso ---

--- Usando GETTERS (leitura via método) ---
Aluno 1: João Silva (18 anos)
Aluno 2: Maria Santos (16 anos)

--- Usando SETTERS (modificação com validação) ---

Tentando mudar nome de aluno1 para 'Carlos':
Nome atualizado com sucesso!

Tentando mudar nome de aluno1 para 'AB':
Erro: Nome deve ter pelo menos 3 caracteres!

Tentando mudar nome de aluno1 para '':
Erro: Nome não pode ser vazio!

Tentando mudar idade de aluno1 para 19:
Idade atualizada com sucesso!

Tentando mudar idade de aluno1 para -5:
Erro: Idade não pode ser negativa!

Tentando mudar idade de aluno1 para 200:
Erro: Idade não pode ser maior que 150 anos!

--- Estado final dos alunos ---
===== Informações do Aluno =====
Nome: Carlos
Idade: 19
================================

===== Informações do Aluno =====
Nome: Maria Santos
Idade: 16
================================

--- Diferença: COM vs SEM encapsulamento ---
...
```

**Observações importantes:**
- Valores válidos foram aceitos
- Valores inválidos foram rejeitados
- Os dados nunca ficaram inválidos

---

## Atividade 3 — Entendendo a validação

**Tentativas de modificação:**

1. ✅ `setNome("Carlos")` → **Aceito** (válido: 6 caracteres)
2. ❌ `setNome("AB")` → **Rejeitado** por ser muito curto (2 caracteres < 3)
3. ❌ `setNome("")` → **Rejeitado** por estar vazio
4. ✅ `setIdade(19)` → **Aceito** (válido: 0 ≤ 19 ≤ 150)
5. ❌ `setIdade(-5)` → **Rejeitado** por ser negativo (< 0)
6. ❌ `setIdade(200)` → **Rejeitado** por ser muito alto (> 150)

---

## Atividade 4 — Perguntas

### 1. O que é encapsulamento?

**Encapsulamento** é um princípio da Orientação a Objetos que consiste em:

- **Proteger** os dados (atributos) dentro de uma classe
- **Controlar** o acesso a esses dados através de métodos públicos (getters/setters)
- **Validar** os dados antes de permitir modificações

Benefícios:
1. Dados sempre válidos
2. Proteção contra mudanças indevidas
3. Flexibilidade (posso mudar implementação sem quebrar código externo)

### 2. Qual é a diferença entre `public` e `private`?

| Palavra-chave | Acesso | Uso | Quando usar |
|---|---|---|---|
| `public` | Acessível de fora da classe | Métodos e construtores | Quando quer que qualquer um acesse |
| `private` | Acessível APENAS dentro da classe | Atributos internos | Para proteger dados |

Exemplo:

```java
public class Aluno {
    public int id;            // Qualquer um acessa: aluno.id
    private String senha;     // Ninguém acessa direto: ❌ aluno.senha
                              // Acessa via getter/setter: ✅ aluno.getSenha()
}
```

### 3. O que um getter faz?

Um **getter** é um método **público** que permite **ler** um atributo `private`.

```java
private String nome;

public String getNome() {
    return nome;  // Só retorna, não modifica
}
```

**Quando usar**: Quando você quer que outros acessem os dados mas não possam modificar.

### 4. O que um setter faz?

Um **setter** é um método **público** que permite **modificar** um atributo `private` com **validação**.

```java
private String nome;

public void setNome(String novoNome) {
    // Validação
    if (novoNome.length() < 3) {
        System.out.println("Erro!");
        return;
    }
    // Atribuição
    this.nome = novoNome;
}
```

**Quando usar**: Quando você quer permitir modificação mas com **controle**.

### 5. Por que usar setters em vez de permitir acesso direto aos atributos?

**Razões principais:**

1. **Validação**: Setters garantem que os dados sejam válidos
   ```java
   // SEM setter (ruim):
   aluno.idade = -50;  // Allowed! ❌

   // COM setter (bom):
   aluno.setIdade(-50);  // Rejected! ✅
   ```

2. **Flexibilidade**: Posso mudar a implementação sem quebrar código externo
   ```java
   // Se um dia precisar de lógica complexa:
   public void setIdade(int novaIdade) {
       this.idade = novaIdade;
       this.ultimaAtualizacao = new Date();  // Adicionado!
       this.validarOutrosAtributos();        // Adicionado!
   }
   // Código externo continua igual: aluno.setIdade(20)
   ```

3. **Proteção**: Evita que dados sejam alterados de forma inesperada

### 6. O que significa "validação" de dados?

**Validação** é o processo de verificar se um dado é válido antes de aceitá-lo.

Exemplo no setter `setNome()`:

```java
if (novoNome == null || novoNome.isEmpty()) {
    System.out.println("Erro: Nome não pode ser vazio!");
    return;  // Rejeita
}

if (novoNome.length() < 3) {
    System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
    return;  // Rejeita
}

// Se chegou aqui, é válido:
this.nome = novoNome;
```

**Validação garante:**
- Dados não-nulos
- Dados no formato correto
- Dados em range aceitável
- Dados semanticamente válidos

### 7. Qual é o nome do padrão getter/setter?

O padrão é chamado **JavaBean** (ou Properties Pattern em linguagens mais antigas).

Convenção:
- Getter: `get` + Atributo (letra maiúscula)
- Setter: `set` + Atributo (letra maiúscula)

Exemplos:
```java
private String nome;
public String getNome() { ... }
public void setNome(String nome) { ... }

private int idade;
public int getIdade() { ... }
public void setIdade(int idade) { ... }

private boolean ativo;
public boolean isAtivo() { ... }      // Para boolean, prefira "is"
public void setAtivo(boolean ativo) { ... }
```

---

## Atividade 5 — Criando seu próprio setter

Você deve ter criado algo assim na classe `Aluno`:

```java
public void setIdade(int novaIdade) {
    // Validação 1: Não pode ser negativa
    if (novaIdade < 0) {
        System.out.println("Erro: Idade não pode ser negativa!");
        return;
    }

    // Validação 2: Não pode ser maior que 150
    if (novaIdade > 150) {
        System.out.println("Erro: Idade não pode ser maior que 150 anos!");
        return;
    }

    // Se passou todas as validações:
    this.idade = novaIdade;
    System.out.println("Idade atualizada com sucesso!");
}
```

Na `Principal.java`, você testaria:

```java
aluno.setIdade(25);    // ✅ Válido
aluno.setIdade(-5);    // ❌ Inválido (negativo)
aluno.setIdade(200);   // ❌ Inválido (muito alto)
```

---

## Atividade 6 — Modificando a validação

Você deve ter adicionado ao setter `setNome()`:

```java
public void setNome(String novoNome) {
    // Validação 1: Não vazio
    if (novoNome == null || novoNome.isEmpty()) {
        System.out.println("Erro: Nome não pode ser vazio!");
        return;
    }

    // Validação 2: Mínimo 3 caracteres
    if (novoNome.length() < 3) {
        System.out.println("Erro: Nome deve ter pelo menos 3 caracteres!");
        return;
    }

    // Validação 3 (NOVA): Máximo 50 caracteres
    if (novoNome.length() > 50) {
        System.out.println("Erro: Nome não pode ter mais de 50 caracteres!");
        return;
    }

    // Se passou tudo:
    this.nome = novoNome;
    System.out.println("Nome atualizado com sucesso!");
}
```

Na `Principal.java`, testar:

```java
aluno.setNome("João Silva");                    // ✅ Válido (11 caracteres)
aluno.setNome("AB");                            // ❌ Inválido (muito curto)
aluno.setNome(""); // ❌ Inválido (vazio)
aluno.setNome("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz");  // ❌ Muito longo
```

---

## Atividade 7 — Reflexão final

### 1. Se todos os atributos fossem `public`, qual seria o problema?

Qualquer código poderia modificar os atributos sem validação:

```java
// RUIM (public):
aluno.nome = "";
aluno.idade = -50;
aluno.idade = 999999999;
// Dados ficam inválidos!
```

**Problemas:**
- Difícil debugar (onde os dados ficaram inválidos?)
- Violação de integridade
- Código fica frágil

### 2. Se todos os atributos fossem `private` mas SEM getters/setters, qual seria o problema?

Ninguém conseguiria acessar os dados! A classe seria inútil:

```java
// RUIM (private sem getter/setter):
aluno.nome;  // ❌ ERRO: não consigo ler
aluno.setNome("João");  // ❌ ERRO: não existe setter
// Dados ficam presos dentro da classe!
```

### 3. Qual é o balanço correto: `private` + `public` getters/setters?

Exatamente! A combinação:

```java
// BOM (private + public getter/setter):
private String nome;           // Protegido

public String getNome() { ... }  // Permite LER
public void setNome(...) { ... } // Permite ESCREVER COM VALIDAÇÃO

// Você consegue acessar, mas de forma segura e validada!
```

**Balanço perfeito:**
- **Dados**: Protegidos (`private`)
- **Acesso**: Controlado (`public` getter/setter)
- **Validação**: Garantida (dentro do setter)

### 4. Na sua profissão (ou futuro trabalho), por que encapsulamento é importante?

**Cenários reais:**

1. **Banco**: Saldo da conta deve ser protegido
   ```java
   private double saldo;  // Ninguém modifica direto
   public void sacar(double valor) {
       if (valor > saldo) {
           // Valida antes de sacar
       }
   }
   ```

2. **Hospital**: Dosagem de medicamento não pode ser negativa
   ```java
   private double dosagem;
   public void setDosagem(double nova) {
       if (nova < 0) {
           throw new Exception("Dosagem inválida!");
       }
   }
   ```

3. **E-commerce**: Preço não pode ser negativo
   ```java
   private double preco;
   public void setPreco(double novo) {
       if (novo < 0) {
           System.out.println("Erro: Preço não pode ser negativo!");
       }
   }
   ```

**Resumo:** Encapsulamento protege a **integridade** dos dados e evita bugs críticos.

### 5. Você implementaria encapsulamento em TODAS as classes que cria?

**Resposta nuançada:**

- **SIM**, para dados críticos (saldo, senha, idade, etc)
- **NÃO**, para dados temporários ou de debug
- **DEPENDE** do contexto

**Regra prática:**
- Se um atributo pode ter valores inválidos → Use `private` + validação
- Se é só para armazenar dados (sem lógica especial) → Pode ser `public` (ou use record em Java 14+)

**Melhor prática:**
Por segurança e boas práticas, comece sempre com `private` e `public` getter/setter. Só simplifique se tiver certeza de que não precisa validação.

---

## Resumo do aprendizado

✅ **Encapsulamento** = proteger dados + controlar acesso
✅ **private** = dados protegidos
✅ **public** = métodos acessíveis
✅ **Getter** = ler dados (getNome)
✅ **Setter** = escrever com validação (setNome)
✅ **Validação** = garantir dados válidos

---

## Próximos passos

Agora você completou a **Fundação de OO**:

✅ Exercício 01-06: Classes, Objetos, Atributos
✅ Exercício 07: Construtores
✅ Exercício 08: Métodos
✅ Exercício 09: Encapsulamento

**Próximo nível:** Herança e Polimorfismo! 🚀
