# Exercicio 3 - HardCodedDependencies

### **Melhoria**: Podemos corrigir esse problema introduzindo uma interface (IReportGenerator) para definir um contrato genérico para qualquer tipo de gerador de relatórios.

### **Princípio SOLID quebrado**: O código infringe o Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP) do SOLID.

### **Problema**: A classe HardCodedDependencies depende diretamente da implementação concreta GeneratePDF. Isso significa que, se quisermos mudar a forma como os relatórios são gerados (por exemplo, gerar um CSV ou um HTML em vez de um PDF), teremos que modificar a classe principal. Isso viola o DIP, pois o código de alto nível (main()) não deveria depender diretamente de uma implementação específica. Em vez disso, ambos devem depender de uma abstração.

```java
public class DIPCompliant {
    public static void main(String[] args) {
        IReportGenerator reportGenerator = new GeneratePDF(); 
        reportGenerator.generateReport();
    }
}

interface IReportGenerator {
    void generateReport();
}

class GeneratePDF implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating PDF Report...");
    }
}

class GenerateCSV implements IReportGenerator {
    public void generateReport() {
        System.out.println("Generating CSV Report...");
    }
}
```
## **O que mudou?**: 
### **1-** Criamos a interface IReportGenerator, que define um método genérico generateReport().
### **2-** A classe GeneratePDF implementa essa interface, mas agora podemos adicionar outras implementações, como GenerateCSV, sem modificar main().
### **3-** No main(), a variável reportGenerator é declarada como IReportGenerator, permitindo a troca da implementação sem alterar o código principal.

## **Benefícios:**
### **1-** O código agora segue o Princípio da Inversão de Dependência (DIP).
### **2-** Podemos facilmente adicionar novos tipos de relatórios sem modificar o código existente (Aberto para extensão, fechado para modificação - Princípio do Aberto/Fechado - OCP).
### **3-** O código se torna mais flexível e testável, facilitando a substituição de implementações e o uso de mocking em testes unitários.