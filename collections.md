# Collections

## Definição
> É uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade. Esses elementos precisam ser [OBJETOS]

> Podem ter coleções homogêneas e heterogêneas.

> O nícleo principal das coleções é formado por interfaces que permitem manipular a coleção independente do nível de detalhes que elas representam.

> 4 grandes tipos de coleções :
 * 1. `List` (Lista)
 * 2. `Set` (Conjunto)
 * 3. `Queue` (Fila)
 * 4. `Map` (Mapa)
> Embora a interface `Map` não seja filha direta da interface `Collection` ela também é considerada uma coleção devido à sua função

> TODAS as interfaces e classes são encontradas dentro do pacote [package] `java.util` 

## Tipo Generico
> É uma classe genérica ou uma interface que é parametrizada em relação a tipos.

> É possível usarmos o Diamond Operator a partir do JAVA 7, no contexto de tipos genéricos em Jvaa para inferir automaticamente o tipo com base no contexto.

> Usando Tipos Genericos em uma `public class Box{}` usamos `public class Box<T>{}` onde `<T>` representa " Tipe "

> Os nomes de parâmetros de tipo mais comuns :

  * E - Elemento (Exclusivamente usado pelo java Collections Framework)
  * K - Chave
  * N - Número
  * T - Tipo
  * V - valor
  * S, U, V, etc. - 2º, 3º, 4º tipos

  ## Comparable X Comparator

  ##### Comparable
  * Fornece uma única sequencia de ordenação, ou seja, podemos ordenar a coleção com base em um único elemento, como id, nome e preço.
  * Afeta a classe original, ou seja, a classe original é modificada.
  * Fornece o método `compareTo()` para ordenar elementos
  * Está presente no pacote `java.lang`
  * podemos ordenar os elemento da lista do tipo `comparable` usando método `Collections.sort(List)`

  #### Comparator
  *Fornece o método `compare()`para ordenar elementos.
  * O `comparator` fornece múltiplas sequências de ordenação, ou seja, podemos ordenar a coleção com base em múltiplos elementos, com base emmúltiplos elementos como id, nome, preço etc.
  * O comparator não afeta a classe original,  ou seja, a classe original não é modificada.
  * `comparator está presente no pacote `java.util`
  *  Podemos ordnar os elementos da lista do tipo `comparator` usando o metodo `Colleftions.sort(List, Comparator)`

  #### Collections
  * Classe utilitária do Java para operações com coleções.
  * Fornece metodos para ordenação, busca, manipulação e sincronização de coleções.
  * O metodo `sort()` é usado para ordenar uma lista em ordem ascendente.
  * O metodo `sort()` em conjunto com `Collections.reverseOrder()` permite ordenar em ordem descendente

## LIST
> É uma coleção ordenada que permite inclusão de elementos duplicados

> As classes de implementação comuns são `ArrayList` e `LinkedList`

> A lista se assemelha a uma Matriz com comportamento dinâmico, permitindo adicionar ou remover elementos

> A interface `List` fornece métodos úteis para adicionar elementos em posições específicas, remover ou substituir elementos com índice e obter sublistas usando índices

> A classe `Collections` fornece algoritmos úteis para a manipulação de `List`. Commo ordenação (sort), embaralhamento(shuffle), reversão(reverse) e busca binária (binarySearch)

##### ArrayList:
> Implementação da interface `List` que armazena os elementos em uma estrutura de array redimensionável. Isso significa que ele pode crescer automaticamente à medida que novos elementos são adicionados. A principal vantagem do Array list é o acesso a elementos por meio de índices, que permite recuperar um elemento específico de forma eficiente. No entanto, adiocionar ou remover elementos no meio da lista pode ser um processo mais longo pois é necessário realocar elementos na lista.
##### LinkedList:
>É uma implementação do da interface `List` que armazena os elementos em uma lista duplamente vinculada. cada elemento contem referências patra o elemento anterior e o próximo da lista. A primcipal vantagem é a adição e remoção de elementos no início e final da lista pius não é necessário realocar elementos. No entanto, ter acesso a elementos no meioi da lista pode ser um processo mais longo pela necessidade de iterar a lista até o elemento desejado.
##### Vector:
> Implementação antiga da interface `List` que se assemelha ao `Arraylist`, mas é sincronizada, ou seja é thread-safe. Isso significa que várias threads podem manipular um objeto Vectorao mesmmo tempo sem causar problemas de ocorrência. No entanto essa sincronização adiciona uma sobrecarga de desempenho, tornando o vector menos eficiênte que o `ArrayList` em cenários que desempenho não é um problema.

## Set
> A interface `Set` é uma coleção que não aceita itens duplicados

> Essa interface representa o conceito matemático de um conjunto e é usada para representar conjuntos, como um baralho de cartas;

> A plataforma Java possui três implementações de `Set` de uso geral: `HashSet`, `TreeSet` e `LinkedSet`.

> A interface `Set` não permite acesso aleatório a um elemento na coleção.

> Para percorrer os elementos de um `Set`, você pode usar um loop foreach.

##### HashSet: 
> O HashSet é um implementação da interface `Set` que armazena os elementos em uma tabela hash. Ele não mantém uma ordem específica dos elemetos. A principal vantagem do `HashSet` é que ele oferece um desempenho de busca muito eficiente, pois usa funções hashpara indexar os elementos. No entanto, a ordem em que os elementos são adicionados pode não ser preservada ao percorrer o conjunto 
##### TreeSet: 
> O TreeSet é uma implementação da interface `Set` que armazena os elementos em uma ´arvore binárea´ balanceada. Isso significa que os elementos são armazenados em uma ordem classificada e são mantidos automaticamente em ordem crescente. A principal vantagem do `TreeSet` é que os elementos são sempre retornados na ordem classificada, o que facilita a obtenção de elementos em uma determinada ordem. No entanto a busca e a inserção são mais lentas do que no `HashSet`
##### LinkedSet: 
> O `LinkedHashSet` é uma implementação da interface `Set` que mantém a ordem de inserção dos elementos, além de usar uma tabela Hash para aobter um bom desempemnho de busca. Ela é semelhante ao `HashSet` mas também mantém uma lista duplamente vinculada que preserva a ordem de inserção. Isso permite que os elementos sejam percorridos na ordem em que foram adicionados. O `LinkedHashSet` é util quando você precisa manter a ordem de inserção dos elementos e também ter um bom desempenho de busca.


## Map
> A interface `Map` é usada para mapear dados na forma de chaves e valores.

> O `Map` do java é o Objeto que mapeia chaves e valores

> Um `Map` não pode conter chaves duplicadas: Cada chave pode mapear no máximo um vaor.

> A plataforma Java possui três implementações gerais de `Map`: `HashMap`, `TreeMap`, `LinkedHashMap`.

> As operações básicas do `Map` são: put (Inserir), get (Obter), containsKey (Verificar se contém uma chave), containsValue (Verificar se contém um valor), size (Obter o tamanho) e isEmpty (verificar se está vazio).

##### HashTable
> É uma implementação antiga da interface `Map` que é sincronizada e thread-safe, tornando-a adequada para o uso em ambientes concorrentes. Ela não permite chaves ou valores nulos e os elementos não são mantidos em uma ordem específica.
##### LinkedHashMap
> É uma implementação da interface `Map` que preserva a ordem de inserção dos elementos. Cada elemento possui referências ao próximo e ao anterior, formando uma lista encadeada. Isso permite que elementos sejam iterados na ordem em que foram inseridos. Além disso, o LinkedHashMap também permite chaves ou valores nulos.
##### 
> É uma implementação da interface `Map` que não mantém uma ordem específica dos elementos. Armazena os elementos internamente utilizando uma função de hash para melhorar a eficiência das operações de pesquisa e acesso. O HashMap também permite chaves ou valores nulos.












