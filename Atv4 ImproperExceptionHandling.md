# Exercicio 4 - ImproperExceptionHandling 

### **Melhoria**: A melhor abordagem é separar a responsabilidade de lidar com exceções e deixar a classe Calculator apenas realizar os cálculos. O tratamento de erros deve ser feito na classe que usa o Calculator (neste caso, main).

### **Princípio SOLID quebrado**: O código viola o Princípio da Responsabilidade Única (Single Responsibility Principle - SRP) do SOLID e também apresenta um problema de tratamento inadequado de exceções.

### **Problema**: 
### **1-** Violação do SRP (Princípio da Responsabilidade Única):
####    A classe Calculator tem duas responsabilidades:
####        Executar a operação de divisão.
####        Lidar com erros/exceções.
####    O tratamento de exceções não deveria estar diretamente na classe de cálculo, pois isso mistura a lógica de negócios com a lógica de manipulação de erros.
### **2-** Tratamento inadequado de exceções:
####    O código trata exceções dentro do próprio método em vez de delegá-las.
####    O catch (Exception e) genérico é um problema, pois pode ocultar erros inesperados, tornando a depuração mais difícil.

```java
public class ProperExceptionHandling {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            int result = calculator.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

class Calculator {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero"); 
        }
        return a / b;
    }
}
```
## **O que mudou?**: 
### **1-** Removemos o bloco try-catch da classe Calculator.
####    Agora, divide() apenas lança uma exceção quando b == 0.
####    Isso segue o SRP, pois a Calculator apenas realiza cálculos.
### **2-** Movemos o tratamento de erro para main().
####    Agora main() é responsável por capturar e exibir mensagens de erro.
####    Isso permite que outras partes do sistema tratem exceções conforme necessário.
### **3-** Removemos o catch (Exception e).
####    Isso evita que erros inesperados sejam mascarados.


## **Benefícios:**
### **1-** O código agora segue o Princípio da Responsabilidade Única (SRP).
### **2-** O tratamento de exceções está corretamente separado da lógica de negócios.
### **3-** O código é mais flexível e reutilizável.
### **4-** Evitamos ocultar exceções inesperadas.