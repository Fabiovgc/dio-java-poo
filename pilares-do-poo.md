# pilares do POO
-> Paradigma de programação baseado no conceito de "objetos".
> Podem conter dados na forma de atributos e códigos, na forma de procedimentos, também conhecidos como métodos

> Estruturação de objetos com características e comportamentos

> Para uma linguagem ser considerada orientada a objetos, esta deve seguir o que denominamos como `Os quatro pilares da orientação a objetos` :

* Encapsulamento
  > Nem tudo precisa estar visivel. Dividimos nossos calgorítmo em métodos com finalidades específicas que complementam uma ação em nossa aplicação.
* Herança
  > Catsarteristicas e comportamentos comuns podem ser compartilhados [herdados] através de uma hierarquia de objetos. 
* Abstração
  > É indisponibilidade de determiinar a lógica de um ou vários comportamentos em um objeto. Ou seja, existe mais de uma maneira de realizar a mesma operação.
* Polimorfismo
  > São as inúmeras maneiras de se realizar uma mesma ação.

## Encapsulamento
> Mesmo sendo necessárias alguns processos, não é um requisito que tenham visibilidade públuca. Apenas a própria classe tem responsabilidade pela própria ação. Imagina se um usuário, ao utilizar umaplicativo de mensagens, necessitasse verificar se o computador está conectado à internet e depoiois salvar mensagens em um histórico. Ou se ao tentar enviar um SMS, primeiro precisasse consultar seu saldo. Não seria experiência agradável aos usuários, por isso essas estapas são omitidas do usuario. Consiste em esconder os detalhes internos de uma classe, expondo apenas o que é necessário para o uso dela. Ele promove o acesso controlado aos atributos e métodos, garantindo que dados importantes não sejam modificados de maneira inadequada.

> Geralmente, atributos de uma classe são declarados como private e acessados ou modificados através de métodos públicos chamados getters (para obter o valor) e setters (para definir o valor). Isso permite que a lógica de acesso e modificação seja controlada e validada conforme necessário.

## Herança
##### Nem tudo se copia, as vezes se herda.
> A herança é um dos pilares da Programação Orientada a Objetos (POO) e permite que uma classe (chamada de "classe filha" ou "subclasse") herde atributos e métodos de outra classe (chamada de "classe pai" ou "superclasse"). Com a herança, é possível criar novas classes que reutilizam, estendem ou modificam o comportamento de classes existentes, promovendo a reutilização de código e a organização hierárquica.

## Abstração
##### Para ser, é preciso fazer
> A abstração envolve definir uma classe que representa uma ideia geral ou conceito, com atributos e métodos necessários para representar o comportamento e as características dessa ideia. Essa classe serve como uma "interface" para interagir com o objeto, sem a necessidade de conhecer seus detalhes internos. Os detalhes sobre como os atributos se comportam internamente não precisam ser conhecidos por quem utiliza a superclasse.

## Polimosrfismo
> O polimorfismo é um conceito chave da Programação Orientada a Objetos (POO) que permite que um mesmo método ou operação tenha diferentes comportamentos, dependendo do objeto que o está executando. Em outras palavras, o polimorfismo permite que métodos com o mesmo nome, em diferentes classes, realizem ações específicas de acordo com o contexto.

> Dois tipos principais :
* Polimorfismo de Sobrecarga (ou Polimorfismo Estático) :
  > Ocorre quando há vários métodos com o mesmo nome dentro de uma mesma classe, mas com diferentes assinaturas (diferentes tipos ou números de parâmetros). O compilador decide qual método usar com base na lista de argumentos fornecidos na chamada do método.
* Polimorfismo de Sobrescrita (ou Polimorfismo Dinâmico) :
  > Ocorre quando uma subclasse redefine um método da superclasse com a mesma assinatura. O método da subclasse é chamado, mesmo que o tipo do objeto seja da superclasse. Isso permite que uma chamada de método execute o comportamento adequado com base no tipo real do objeto em tempo de execução.

## interface 
> É um conceito de abstração dentro da linguagem que possui a capacidade de ter um mesmo objeto que possuea propriedade e papéis diferentes em um mesmo projeto.

> Uma classe não pode ter herança multipla, mas é possível implementar mais de uma superclasse 



flowchart TD
%% Nodes
    A("fab:fa-youtube <a rel="noopener" href="https://www.youtube.com/watch?v=T5Zthq-QR2A&amp" target="_blank">Starter Guide</a>")
    B("fab:fa-youtube <a rel="noopener" href="https://www.youtube.com/watch?v=rfQ_yGJ8QAQ&amp" target="_blank">Make Flowchart</a>")
    C("fa:fa-book-open <a rel="noopener" href="https://mermaid.js.org/syntax/flowchart.html" target="_blank">Learn More</a>")
    D{"Use the editor"}
    E(fa:fa-shapes Visual Editor)
    F("fa:fa-chevron-up Add node in toolbar")
    G("fa:fa-comment-dots AI chat")
    H("fa:fa-arrow-left Open AI in side menu")
    I("fa:fa-code Text")
    J(fa:fa-arrow-left Type Mermaid syntax)

%% Edge connections between nodes
    A --> B --> C --> D -- Build and Design --> E --> F
    D -- Use AI --> G --> H
    D -- Mermaid js --> I --> J

%% Individual node styling. Try the visual editor toolbar for easier styling!
    style E color:#FFFFFF, fill:#AA00FF, stroke:#AA00FF
    style G color:#FFFFFF, stroke:#00C853, fill:#00C853
    style I color:#FFFFFF, stroke:#2962FF, fill:#2962FF

%% You can add notes with two "%" signs in a row!
