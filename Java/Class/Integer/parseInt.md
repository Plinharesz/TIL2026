# Integer.parseInt() in Java

O método `Integer.parseInt()` converte uma `String` em um tipo primitivo `int`. É amplamente utilizado tanto na resolução de problemas de algoritmos e estruturas de dados quanto no desenvolvimento backend (por exemplo, ao ler *path variables* ou dados de requisições em APIs).

## Basic Usage

A assinatura padrão recebe uma `String` em base 10.

```java
String input = "42";
int number = Integer.parseInt(input); // Result: 42

try {
    int userId = Integer.parseInt("104A");
} catch (NumberFormatException e) {
    // Log exception or handle invalid input
    System.out.println("Invalid integer format.");
}

// Binary to int (Base 2)
int fromBinary = Integer.parseInt("1010", 2); // Result: 10

// Hexadecimal to int (Base 16)
int fromHex = Integer.parseInt("FF", 16); // Result: 255


int primitive = Integer.parseInt("100"); // Alocação simples, mais rápido
Integer wrapper = Integer.valueOf("100"); // Aloca um objeto, compatível com Generics