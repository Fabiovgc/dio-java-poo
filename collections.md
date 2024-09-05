# Collections

## Definição
> É uma estrutura de dados que serve para agrupar muitos elementos em uma única unidade. Esses elementos precisam ser [OBJETOS]

> Podem ter coleções homogêneas e heterogêneas.

> O nícleo principal das coleções é formado por interfaces que permitem manipular a coleção independente do nível de detalhes que elas representam.

> 4 grandes tipos de coleções :
*1. `List` (Lista)
*2. `Set` (Conjunto)
*3. `Queue` (Fila)
*4. `Map` (Mapa)
> Embora a interface `Map` não seja filha direta da interface `Collection` ela também é considerada uma coleção devido à sua função

> TODAS as interfaces e classes são encontradas dentro do pacote [package] `java.util` 

# Tipo Generico
> É uma classe genérica ou uma interface que é parametrizada em relação a tipos.

> É possível usarmos o Diamond Operator a partir do JAVA 7, no contexto de tipos genéricos em Jvaa para inferir automaticamente o tipo com base no contexto.

> Usando Tipos Genericos em uma `public class Box{}` usamos `public class Box<T>{}` onde `<T>` representa " Type "

`public class Box<T> {
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }
}`











