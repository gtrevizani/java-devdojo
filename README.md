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


### **CASTING**

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
* **final:** utilize-a para especificar o fato de que uma variável não é modificável (ou seja, é uma constante) e que qualquer tentativa de modificá-la é um erro.
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

### **TO STRING**

O objetivo do método `toString()` é trazer uma representação textual de uma instância de um objeto.

```java
    public String toString() {
        return "Anime: " + this.nome;
    }
```

### **ENUMERAÇÃO**
O tipo Enum básico que define um conjunto de constantes representadas como identificadores únicos. Um tipo `enum` é declarado com uma declaração enum, uma lista separada por vírgulas de constantes enum - a declaração pode opcionalmente incluir outros componentes das classes tradicionais como construtores, campos e métodos. Cada declaração enum declara uma classe enum com as seguintes restrições:

1. Constantes enum são *implicitamente* final;
2. Constantes enum são *implicitameante* static;
3. Qualquer tentativa de criar um objeto de um tipo enum com um operador new resulta em um erro de compilação.

As constantes enum podem ser utilizadas em qualquer lugar em que constantes podem ser utilizadas.

```java

public enum TipoPagamento{
    DEBITO, 
    CREDITO;

    public double calcularDesconto(double valor){
        return 0;
    }
}
```

### **CLASSES ABSTRATAS**
Com classes abstratas você nunca pretende criar objetos, elas são utilizadas como superclasses em hierarquias de heranças. 
Essas classes não podem ser utilizadas para instanciar objetos.

```java
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
```

Em suma, o propósito de uma classe abstrata é fornecer uma superclasse apropriada a partir da qual outras classes podem herdar e assim compartilhar um design comum.

### **MÉTODOS ABSTRATOS**

Um método abstrato é um método de instância com a palavra-chave *abstract* na sua declaração.

```java
public abstract void draw();
```

Métodos abstratos não fornecem implementações. Os métodos *abstract* devem ser sobrescritos para que possam processar objetos com base em seus tipos.

### **INTERFACES**

São coleções de métodos relacionados que normalmente permitem informar aos objetos o que fazer, mas não como fazer.

Por exemplo, os controles em um rádio servem como uma interface entre os usuários do rádio e os componentes internos do rádio. Os controles permitem que os usuários realizem somente uma série limitada de operações (por exemplo, mudar de estação, ajustar o volume, escolher entre AM e FM) e diferentes rádios podem implementar os controles de diferentes maneiras (por exemplo, uso de botões, sintonizadores, comandos de voz). A interface especifica quais operações um rádio deve permitir que os usuários realizem, mas não especifica como essas operações são realizadas.

```java
public interface DataLoader{
    public abstract void load();
}
```

Interfaces definem e padronizam como coisas, pessoas e sistemas podem interagir entre si.

Para utilizar uma interface, uma classe concreta deve especificar que ela **implementa** a interface e declarar cada método na interface com a assinatura especificada na declaração de interface.


```java
public class DatabaseLoader implements DataLoader{
    public abstract void load(){
        System.out.println("Loading...");
    }
}
```

No Java SE 8, interfaces também podem conter *métodos default public*, se uma classe implementar uma interface desse tipo, a classe também recebe as implementações *default* da interface (se houver alguma). Ela não precisa sobrescrever os métodos default da interface, mas pode fazer isso se necessário.

```java
public interface DataLoader {
    public abstract void load();

    default void checkPermission(){
        System.out.println("Fazendo checagem de permissões...");
    }
}
```

### **POLIMORFISMO**

O polimorfismo permite "programar no geral" em vez de "programar no específico". Em particular, o polimorfismo permite escrever programas que processam objetos que compartilham a mesma superclasse, direta ou indiretamente, como se todos fossem objetos da superclasse, isso pode simplificar a programação.

```java
public class TestData{
    public int add(int a, int b, int c){
        return a + b + c;
    }
    
    public int add(int a, int b){
        return a + b;
    }
}
```
```java
public class Program extends TestData{
    public static void main(String[] args) {
        TestData dataClass = new TestData();
        
        int var1 = dataClass.add(45, 34, 67);
        int var2 = dataClass.add(23, 34);
    }
}
```

### **EXCEÇÕES**

Uma exceção é uma indicação de um problema que ocorre durante a execução de um programa. 

<div align="center">
  <img width="600" title="tipos-de-dados" src="https://javatrainingschool.com/wp-content/uploads/2021/11/image-1-1024x557.png"/>
</div>

O tratamento de exceção permite criar aplicativos que podem resolver (ou tratar) exceções. Em muitos casos, o tratamento de uma exceção permite que um programa continue executando como se nenhum problema tivesse sido encontrado. As características apresentadas neste capítulo ajudam a escrever programas robustos e tolerantes a falhas que podem lidar com os problemas e continuar a executar ou encerrar elegantemente.

```java
public class ExceptionTest01 {
    public static void main(String[] args) throws IOException {

        criarNovoArquivo();

    }

    private static void criarNovoArquivo(){
        File file = new File("src/br/com/arquivo/texto.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
```

### **COLEÇÕES**
A Java API fornece várias estruturas de dados predefinidas, chamadas **coleções**, usadas para armazenar grupos de objetos relacionados na memória. Essas classes fornecem métodos eficientes que organizam, armazenam e recuperam seus dados sem a necessidade de conhecer como os dados são armazenados. Isso reduz o tempo de desenvolvimento de aplicativos.

<div align="center">
  <img width="600" title="tipos-de-dados" src="https://lh3.googleusercontent.com/go5HHj8ARulogiaCY3qYerASYBTB8fWGWFPf0YyFIy0dq_fJtc3HNsDnTcu_196F91xFVXKwfNxrlJ5EUwMHShZ3ml6fXfdSUVNsc61_aEd_wKQ2PvmvJ0Y5pRcAciAiUTjNniMGSw=w2400"/>
</div>

Alguns exemplos de coleções são suas músicas preferidas armazenadas no smartphone ou media player, sua lista de contatos, as cartas que você mantém em um jogo de cartas, os membros do seu time favorito e os cursos que você faz simultaneamente na escola.
