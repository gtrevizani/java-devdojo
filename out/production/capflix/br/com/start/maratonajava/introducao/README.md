> Por Guilherme Iglesias Trevizani <guilhermetrevz@outlook.com>
>
> Técnico em Desenvolvimento de Sistemas
>
> Desenvolvedor Java
<hr>

# **COMENTÁRIOS**

<div align="justify">

Comentários de desenvolver pra desenvolvedor.

```java
// comentario de uma linha
```

```java
/*
Comentario de múltiplas linhas
*/
```

Comentários para documentação.

```java
/**
 * Isso é um comentário <b>javadoc
*/

```
<hr>

# **TIPOS PRIMITIVOS**

Os tipos primitivos existentes são:

<div align="center">
  <img width="600" title="tipos-de-dados" src="https://techandetcblog.files.wordpress.com/2011/02/primitivos-java.png"/>
</div>

<hr>

# **CASTING**

Casting é a conversão de objetos ou tipos primitivos de um tipo para outro tipo. Ao se tratar casting, considera-se a necessidade de conversão explícita entre tipos - o que, potencialmente, pode causar perdas de informação.

```java
int idade = (int) 10000.00; // double pra int
```
<hr>

# **OPERADORES**

Operadores são símbolos que representam atribuições, cálculos e ordem dos dados. Os operadores são utilizados nas expressões matemáticas, lógicas, relacionais e de atribuição.

### **ARITMÉTICOS**
Expressões aritméticas são aquelas expressões que quando calculadas vão dar um valor numérico. Os mais comuns, são:

<div align="center">

  Operador |  Significado
  :---------: | :------: 
  (+) | Adição
  (-) | Subtração
  (*) | Multiplicação
  (/) | Divisão
  (%) | Resto da divisão (módulo)

</div>

### **RELACIONAIS**
São utilizados para comparar valores entre variáveis e expressões do mesmo tipo. O retorno desta comparação é sempre um valor do tipo booleano (verdadeiro/falso).

<div align="center">

  Operador |  Significado
  :---------: | :------: 
  (==) | Igual
  (!=) ou (<>) | Diferente
  (>) | Maior
  (<) | Menor
  (>=) | Maior igual
  (<=) | Menor igual

</div>

### **LÓGICOS**

Fazem comparações com o objetivo de avaliar expressões em que o resultado pode ser verdadeiro ou falso, ou seja, implementando lógica booleana. O retorno desta comparação é sempre um valor do tipo booleano (lógico).

<div align="center">

  Operador |  Significado
  :---------: | :------: 
  (AND) | As duas condições devem ser verdadeiras para que o resultado seja verdadeiro.
  (OU) | Pelo menos uma condição deve ser verdadeira para que o resultado seja verdadeiro.
  (NOT) | Inverte o valor do resultado da condição.

</div>

### **ATRIBUIÇÃO**
Têm como função retornar um valor atribuído de acordo com a operação indicada. A operação é feita entre dois operandos, sendo atribuído o resultado ao primeiro.

<div align="center">

  Operador |  Significado
  :---------: | :------: 
  (=) | Atribuição simples
  (-=) | Atribuição com subtração
  (/=) | Atribuição com divisão
  (+=) | Atribuição com adição
  (*=) | Atribuição com multiplicação
  (%=) | Atribuição com módulo
  (--) | Decremento
  (++) | Incremento

</div>

<hr>

# **ESTRUTURAS DE SELEÇÃO**

São comandos que auxiliam no direcionamento da sequência de execução de um programa por meio da avaliação de condições lógicas. Também são conhecidos como estruturas condicionais.

* **Algoritmo condicional:** permite a escolha de um grupo de ações a ser executado quando determinadas condições representadas por expressões lógicas são ou não satisfeitas.

### **IF/ELSE**

A condicional `if` é uma estrutura condicional que executa a afirmação, dentro do bloco, se determinada condição for verdadeira. Se for falsa, executa as afirmações dentro de `else`. Ela se encontra dividida em:

* Simples;

```java
        if (comando) {
            ...
        }
```
* Composta;
```java
        if (comando) {
            ...
        } else {
    
        }
```
* Aninhada
```java
        if (comando) {
            ...
        } else if (comando){
            ...
        }
```

### **SWITCH**

A estrutura switch/case (escolha-caso) é utilizada quando é necessário testar a mesma variável com uma série de valores (várias vezes).

```java
        switch (condicao) {
            case 1:
                ...
                break;
            case 2:
                ...
                break;
            default:
                ...
                break;
        }
```
# **ESTRUTURAS DE REPETIÇÃO**

São comandos que permitem que uma sequência de instruções seja executada várias vezes até que uma condição seja satisfeita. As estruturas de repetição também são chamadas de laços ou loops.

* **For/para/faça:** deve ser usada quando o número exato de repetições é conhecido. Utiliza uma variável de controle que deve ser do tipo inteiro ou literal.
```java
        for (valor; até; faça;) {
            ...
        }
```
* **While:** é a estrutura de repetição mais simples, ideal para situações em que não se sabe o número exato de vezes em um bloco de instruções. Pode ser usado para substituir laços for.
```java
        while (comando) {
            ...
        }
```
* **Do/While:** semelhante ao while, a diferença é que o bloco de código é executado pelo menos uma vez, mesmo que a condição seja falsa desde o início.
```java
        do {
            ...
        } while (comando);
```

