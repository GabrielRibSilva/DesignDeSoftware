# Exercicio 1 - DependencyInversionViolatio

### **Melhoria**: Para corrigir essa violação, podemos introduzir uma interface (ILight) para abstrair o comportamento das lâmpadas e fazer a classe principal depender dessa abstração.

### **Princípio SOLID quebrado**: A classe DependencyInversionViolation está infringindo o Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP), que é o último princípio do SOLID.

### **Problema**: A classe DependencyInversionViolation depende diretamente da implementação concreta LightBulb. Isso significa que, se precisarmos mudar o tipo de lâmpada (por exemplo, substituir LightBulb por LEDLight), seremos forçados a modificar a classe principal. Isso viola o DIP, pois o código de alto nível não deve depender diretamente de implementações de baixo nível, mas sim de abstrações.

```java
public class DependencyInversionSolution {
    public static void main(String[] args) {
        ILight bulb = new LightBulb();
        bulb.turnOn();
    }
}

interface ILight {
    void turnOn();
    void turnOff();
}

class LightBulb implements ILight {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}
```
## **O que mudou?**: 
### **1-** Criamos a interface ILight, que define o comportamento de uma lâmpada.
### **2-** A classe LightBulb agora implementa essa interface.
### **3-** No método main, declaramos a variável bulb como ILight, permitindo que possamos substituir LightBulb por qualquer outra implementação sem modificar o código principal.

## **Benefícios:**
### **1-** O código agora segue o Princípio da Inversão de Dependência (DIP).
### **2-** Podemos facilmente trocar LightBulb por outra classe, como LEDLight, sem modificar main().
### **3-** O código se torna mais flexível e testável, facilitando a injeção de dependências e o uso de mocking em testes unitários.