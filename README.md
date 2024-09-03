# Objetivo do Repositório :
-> Abordar conceitos do paradigma e os pilares da Orientação a Objetos
1. Classes
2. enums
3. construtores
4. Java Bens
5. UML

## Conceito de POO
### Programação estruturada
-> Paradigma de programação que visa melhorar clareza , qualidade e tempo de desenvolvimento de um programa, fazendo uso extensivo das construções de fluxo de controle estruturado de seleção `if/then/else` e repetição `while/for` , estrutura de bloco e sub-rotinas.
-> Implementamos algoritmos com estruturas sequenciais [procedimentos lineares] -> afetando valor de variaveis de escopo local ou global em uma aplicação

### Orientação a Objetos
> baseado no conceito de "objetos", que possuem atributos, e codigos, na forma de procedimentos [metodos].

## Classes
> Toda a estrutura de codigo em Java é distribuido em arquivos `.java` denominados de [classes]

### As classes são compostas por : 
##### Identificador, Características, Comportamentos
* Classe(class) -> A estrutura que direciona a criação dos objetos de mesmo tipo.
* Identificador(identify) -> Proposito existencial dos objetos que serão criados.
* Caracteristicas(states) -> Conhecidos como atributos ou propriedades, é toda informação que representa o estado de um objeto.
* Comportamentos(behavior) -> Conhecido como ações [metodos], é toda parte comportamental que um objeto dispõe.
* Instanciar(new) -> É o ato de criar um objeto a partr da estrura definida em uma classe.

### Classificação das classes :
* Classe de modelo(model) -> Representam estrutura de domínio da aplicação [Cliente, Pedido, Nota Fiscal etc]
* Classe de serviço(service) -> Contém regras de negócio e validação do nosso sistema
* Classe de repositório(repository) -> Contém integração com banco de dados
* Classe de controller(controller) -> Possuem finalidade de disponibilizar uma conexão externa à nossa aplicação [http, web, webservicess]
* Classe utilitária(util) -> Contém recursos comuns à toda nossa aplicação

## Pacotes 
> O mecanismo de Pacotes é uma forma de organização do projeto -> Sendo composto por diversas categorias de classes com finalidades diferentes o empacotamento é uma forma de deixar todas essas classes em um único nível de documentos
> Os Pacotes são subdiretórios a partir da pasta SRC do nosso projeto onde estão localizadas as classes da linguagem e novas que forem criadas para o projeto. Existem algumas convenções para criação de pacotes já utilizados no mercado : 
* Nomenclatura
  * Comercial : com.powersoft
  * Governamental : gov.powersoft
  * Código aberto : org.powersoft

  
* Organização das classes mediante a proposta de sua existencia
  * Model : Classes que representam a camada e modelo da aplicação ( Cliente, Pedido, NotaFiscal, Usuario )
  * Repository : Classes ou interfaces que possuem a finalidade de interagir com tabelas do banco de dados
  * Service  : Classes que contém regras de negócio do sistema ( ClienteService possui o método para validar o CPF do cliente cadastrado )
  * Controller : Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações via padrão HTTP
  * View : Classes que possuem alguma interação com interfaces gráficas acessadas pelo usuário
  * Util : Pacote que contém classes utilitárias do sistema ( FormatadorNumeroUtil, ValidadorUtil ).
 

##### OBS :
> Quando uma classe é organizada por pacotes, ela passa a ter duas identificações. O nome simples [proprio nome] e o nome qualificado [endereçamento do pacote + nome],  exemplo: Classe Usuario dentro do pacote `com.controle.acesso.model` tem o nome qualificado de `com.controle.acesso.model.Usuario`

### Package versu Import
> Para a utilização de uma classe existente em outros pacotes, necessitamos realizar a importação das mesmas.

## Visibilidade dos recursos
> Em Java, utilizamos três palavbtras reservadas e um conceito default ( sem palavra reservada ) para definir os quatro tipos de visibilidade de atributos, métodos e até mesmo classes, no que se refere ao acesso por outras classes.

* Modificador de acesso `public`
  > Qualquer outra classe em qualquer outro pacote pode visualizar tais recursos.
* Modificador de acesso `default`
  > algumas implementações não precisam estar disponíveis para todo o projeto, e este modificdor de acesso restringe a visibilidade por pacotes.
* Modificador de acesso `private`
  >Este modificdor de acesso restringe a visibilidade por classes.

## Getters e Setters
##### Seguindo a convenção de Java Beans
> os metodos Getters e Setters são utilizados para buscar valores de atributos ou definir novos valores e atributos de instâncias de classes. 

### Getter
> O metodo Get é responsável por obter o valor atual do atributo.
> Precisa ser public e retornatr um tipo correspondente ao valor.
> Ex: `public String getNome() {}`
### Setter
> O metodo Set é responsável por definir ou moficicar o valor de um atributo em um objeto

> Precisa ser public, receber um parâmetro do mesmo tipo da variável mas não retorna nenhum valor (void).

> Ex: `oublic void setNome(String newNome) {}`


## Contrutores 
> Muitas vezes, na instanciação de um objeto, a linguagem solicite para quem for criar que defina algumas propriedades essenciais.
> O metodo construtor deve receber um nome identico ao nome da classe

> Ex:
> `public Pessoa (String atributo1, String atributo2){
this.atrinuto1 = atributo1;
this.atributo2 = atributo2
}`

## Enums
> É um tipo especial de classe onde os objetos são préviamente criados, imutáveis e disponíveis por toda aplicação.

> Usamos Enum quando nosso modelo de negócio contém leque de objetos de mesmo contexto préviamente estruturados com a certeza de não haver grande alteração de valores.

> Conjunto de objetos préestabelecidos na aplicação

> Como enum é um conjunto de objetos, esses objetos podem ter metodos e atributos

## UML
##### Linguagem de Modelagem Unificada
> É uma notação que possibilita a representação gráfica do projeto.

> 3 conceitos necessários :
* diagramas
* elementos
* relacionamentos

> As notações UML são distribuídas em duas categorias de diagramas, a estrutural e comportamental :

### Diagramas estruturais
* Diagrama de classe
  > Utilizado para fazer a representação de estruturas de classes de negócio, interfaces e outros componentes do sistema.

  > Este é considerado o mais importante para a UML, pois auxilia a maioria dos demais diagramas.  
* Diagrama de objeto
  > Representa os objetos existentes em um determinado instante ou fato na aplicação.
  
  > Assim podemos ter uma perspectiva do estado de nossos objetos mediante a interaçãodo usua+ários do sistema.

##### Em diagrama, a estrutura das classes é constituída por : 
* Identificação : Nome e / ou finalidade da classe 
* Atributos : Propriedades e / ou características
* Operações : Ações e / ou métodos


### Relacionamentos
> Em alguma etapa da palicação, haverá necessidade das classes se relacionarem e devemos compreender o níve de dependencia entre elas.

* Associação : Define um relacionamento entre duas classes, permitindo que um objeto tenha acesso a estrutura de um outro objeto.
  * Associação simples : Navegação de A para B (Um cliente tem uma profissão) 
  * Associação Bidirecional : As duas classes precisam se enxergar
  * Agregação : A classe principal tem relação com a outra, mas esta pode existir sem a classe agregadora. Ex: Uma profissão para um candidato. Não é obrigado que o candidato possua.
  * Composição : Caracteriza uma dependência existêncial entre a classe principal e a associada. Ex: Uma admissão só pode existir contendo suas informações bássicas e a composição do candidato selecionado. A admissão não pode existir sem um candidato.

##### Multiplicidade : 
> nem sempre o relacionamento entre as classes será de um para um.
* 1. -> Representa uma associação contendo um elemento
* *. -> Representa uma associação contendo uma lista de elementos
* 0..1 -> Representa uma associação contendo 0 ou 1 elemento
* 0..* -> Representa uma associação contendo 0 ou uma lista de elementos
* 1..* -> Representa uma associação contendo 1 ou uma lista de elementos

### Visibilidade
> Os atributos de uma classe podem receber níveis de visibilifafe representados por símbolos :
* (+) Visibilidade pública
* (#) Visibilidade protegida (muito associada com herança)
* (-) Visibilidade privada

