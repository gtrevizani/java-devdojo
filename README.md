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

| Operador |        Significado        |
|:--------:|:-------------------------:|
|   (+)    |          Adição           |
|   (-)    |         Subtração         |
|   (*)    |       Multiplicação       |
|   (/)    |          Divisão          |
|   (%)    | Resto da divisão (módulo) |

</div>

### **RELACIONAIS**
São utilizados para comparar valores entre variáveis e expressões do mesmo tipo. O retorno desta comparação é sempre um valor do tipo booleano (verdadeiro/falso).

<div align="center">

|   Operador   | Significado |
|:------------:|:-----------:|
|     (==)     |    Igual    |
| (!=) ou (<>) |  Diferente  |
|     (>)      |    Maior    |
|     (<)      |    Menor    |
|     (>=)     | Maior igual |
|     (<=)     | Menor igual |

</div>

### **LÓGICOS**

Fazem comparações com o objetivo de avaliar expressões em que o resultado pode ser verdadeiro ou falso, ou seja, implementando lógica booleana. O retorno desta comparação é sempre um valor do tipo booleano (lógico).

<div align="center">

| Operador |                                    Significado                                    |
|:--------:|:---------------------------------------------------------------------------------:|
|  (AND)   |   As duas condições devem ser verdadeiras para que o resultado seja verdadeiro.   |
|   (OU)   | Pelo menos uma condição deve ser verdadeira para que o resultado seja verdadeiro. |
|  (NOT)   |                     Inverte o valor do resultado da condição.                     |

</div>

### **ATRIBUIÇÃO**
Têm como função retornar um valor atribuído de acordo com a operação indicada. A operação é feita entre dois operandos, sendo atribuído o resultado ao primeiro.

<div align="center">

| Operador |         Significado          |
|:--------:|:----------------------------:|
|   (=)    |      Atribuição simples      |
|   (-=)   |   Atribuição com subtração   |
|   (/=)   |    Atribuição com divisão    |
|   (+=)   |    Atribuição com adição     |
|   (*=)   | Atribuição com multiplicação |
|   (%=)   |    Atribuição com módulo     |
|   (--)   |          Decremento          |
|   (++)   |          Incremento          |

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
<hr>

# **ESTRUTURAS DE REPETIÇÃO**

São comandos que permitem que uma sequência de instruções seja executada várias vezes até que uma condição seja satisfeita. As estruturas de repetição também são chamadas de laços ou loops.

* **For/para/faça:** deve ser usada quando o número exato de repetições é conhecido. Utiliza uma variável de controle que deve ser do tipo inteiro ou literal.
```java
        for (valor; até; faça;) {
            ...
        }
```
* **While:** é a estrutura de repetição mais simples, ideal para situações em que não se sabe o número exato de vezes num bloco de instruções. Pode ser usado para substituir laços for.
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

<hr>

# **VETORES**

### **ARRAY**
Um array é um grupo de variáveis que contém valores todos do mesmo tipo. Os arrays são objetos; portanto, são considerados tipos por referência. Como você logo verá, o que em geral consideramos um array é, na verdade, uma referência a um objeto array na memória. Os elementos de um array podem ser tipos primitivos ou tipos por referência.

Para referenciar um elemento particular em um array, especificamos o nome da referência para o array e o número de posição do elemento no array. O número de posição do elemento é chamado de índice ou subscrito.

```java
int[] exemplo = new int[3]; // instanciação
exemplo[0] = 21;
exemplo[1] = 23;
exemplo[2] = 25;

for (int i = 0; i < exemplo.length; i++){ // exibição com for
    System.out.println(exemplo[i]); 
}

```

### **ARRAYS MULTIDIMENSIONAIS**
Um array multidimensional nada mais é que arrays de arrays, ou seja, arrays linkados a qual você pode navegar sobre todas as posições que eles tem.

```java
int[][] dias = new int[3][3];
dias[0][0] = 31;

System.out.println(dias[0][0]);
```

Percorra o array baseado nas posições dos indíces, como acima há apenas dois arrays de 3 posições, poderia acessar como na exibição acima.

<hr>

# **PROGRAMAÇÃO ORIENTADA A OBJETOS**
A POO é um paradigma de programação que utiliza objetos para organizar o código. É eficaz para projetar e desenvolver sistemas complexos, uma vez que permite uma organização mais clara e modular do código, facilitando a manutenção e a expansão do software.

### **CLASSE**
Uma classe é o mesmo que uma `entidade` (representação de algo real), também pode ser considerado um objeto.
Classes são representadas por atributos e métodos.

```java
public class Animal{
    public String nome;
    public int idade;
    public String corPelo;
    
    public Animal(String nome, int idade, String corPelo) {
        this.nome = nome;
        this.idade = idade;
        this.corPelo = corPelo;
    }
    public void andar() {
        System.out.print("estou andando");
    }
    public void comer(){
        System.out.println("estou comendo");
    }
}
```

### **ATRIBUTOS**
Uma qualidade que aquela classe tem, são as características do objeto.

```java
public class Estudante{
    public String nome;
    public int idade;
    public int matricula;
    public String turma;
    public char turno;
}
```

### **MÉTODOS**

Alguma coisa que a classe pode fazer, são os comportamentos do objeto.

```java
public class Carro{
    public String nome;
    public double velocidade;
    
    //Métodos
    public void descreverCarro(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Velocidade: " + this.velocidade);
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
    
    public void getVelocidade(){
        return velocidade;
    }
}
```

### **OBJETO**
Um objeto é a representação da istância de uma classe, diferentes das classes que criam e instanciam objetos.

```java
public class AnimalTest {
    Animal animal1 = new Animal("Cisco", 8, "Listrado");
}
```

### **CONSTRUTOR**
Cada clase declarada tem por padrão um construtor sem parâmetros, porém, você pode fornecer seu próprio construtor a fim de especificar a inicialização personalizada para objetos de sua classe.

```java
Account account1 = new Account("Jane Green")
```

Neste caso, o argumento "Jane Green" do tipo String é passado para o construtor do objeto `Account` e é usado para inicializar a variável de instância `nome`. Isso requer que a classe forneça um construtor que recebe apenas um parâmetro do tipo String.

```java
public class Account{
    private String name;
    
    public Account(String name){
        this.name = name;
    }
}
```
Um construtor deve ter o mesmo nome que a classe. Já uma lista de parâmetros de um construtor especifica que ele requer um ou mais dados para executar sua tarefa.

### **GETTERS AND SETTERS**

Na prática da programação, são usados métodos especiais, identificados como getters e setters para retornar e inserir respectivamente valores de atributos encapsulados, evitando o acesso direto a tais atributos.

* O método `set` armazena um nome em um objeto.
* O método `get` obtém um nome de um objeto.

```java
public class Account{
    
    private String name;
    
    // Seta a variável
    public void setName(String name){
        this.name = name;
    }
    
    // Retorna a variável
    public void getName(){
        return name;
    }
}
```

### **MODIFICADORES DE ACESSO**

Modificadores de acesso são palavras-chave que determinam a visiblidade de classes, métodos, variáveis e outros membros em um programa. Eles controlam a forma como os membros de uma classe podem ser acessados a partir de outras classes. Existem quatro modificadores de acesso em Java:

* **private (-):** só funciona naquele objeto. Nenhuma outra classe do sistema poderá acessar diretamente o atributo ou método afetado.
* **protected (#):** só funciona naquele pacote. Podem ser acessados por classes pertencentes ao mesmo pacote.
* **public (+):** livre. Disponível para qualquer classe que possa visualizar a classe acessada, não pode ser herdada, apenas herdar.
* **static:** métodos dela só pode ser usada de forma privada.
* **default:** podem ser acessados por classes pertencentes ao mesmo pacote.

### **SOBRECARGA**
Os métodos com o `mesmo nome` podem ser declarados na mesma classe, contanto que tenham diferentes conjuntos de parâmetros - isso é chamado de sobrecarga de métodos.

```java
        public void init(String nome, String idade, String CPF){
            this.nome = nome;
            this.idade = idade;
            this.CPF = CPF;
        }
        
        public void init(String nome, String idade, String CNPJ){
            this.nome = nome;
            this.idade = idade;
            this.CNJP = CNPJ;
        }
```

Quando um método sobrecarregado é chamado, o compilador Java seleciona o método adequado examinando o número, os tipos e a ordem dos argumentos na chamada. A sobrecarga de métodos é comumente utilizada para criar vários métodos com o `mesmo nome` que realizam as `mesmas tarefas`, ou tarefas semelhantes, mas sobre `tipos diferentes` ou `números diferentes de argumentos`.

### **BLOCOS DE INICIALIZAÇÃO**

São inicializados antes do construtor.

```java
public class Anime {
    private String nome;
    private int[] episodios;

    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    
    public Anime(String nome, int[] episodios){
        this.nome = nome;
        this.episodios = episodios;
    }
}
```

### **ASSOCIAÇÃO**
Associação é o relacionamento entre dois objetos.

```
Jogador 1 -- 1 Personagem //  (Um jogador tem um personagem, um personagem tem um jogador)
Time 1 -- N Jogador       //  (Um time tem muitos jogadores, jogador tem um time)
Jogador N -- 1 Time       //  (Muitos jogadores tem um time, um time tem muitos jogadores)
Estudante N -- N Curso    //  (Muitos estudantes tem muitos cursos, muitos cursos tem muitos estudantes)
```

### **SCANNER**
Scanner é utilizado quando você quer inserir dados diretamente pelo teclado. O Scanner é chamado para fazer a leitura dessa inserção e então gravar em variável.

```java
public class Estudante {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite sua matricula: ");
        int matricula = entrada.nextInt();
        
        System.out.println(nome);
        System.out.println(matricula);
        
        entrada.close();
    }
}
```

### **HERANÇA**

Herdar atributos e métodos de outras classes. A partir de classes mais genéricas já existentes é possível gerar novas classes mais específicas, que herdam da classes ancestral seus atributos e métodos, além de implementar características mais específicas.

```java
public class Animal {
    private String nome;
    private int idade;
    
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
```

```java
public class Cachorro extends Animal {
    private String raça;
    
    public Cachorro(String nome, int idade, String raça){
        super(nome, idade);
        this.raça = raça;
    }
    
    public void andar(){
        System.out.println("Estou andando...");
    }
}
```