# Exercicio 5 - InterfaceSegregationViolation 

### **Melhoria**: Para corrigir esse problema, devemos separar as responsabilidades em interfaces menores e mais específicas, em vez de uma única classe que agrupa tudo.

### **Princípio SOLID quebrado**: O código viola o Princípio da Segregação de Interface (Interface Segregation Principle - ISP) do SOLID.

### **Problema**: 
#### A classe Printer implementa três funcionalidades diferentes:
####     **1-** Impressão (print())
####    **2-** Digitalização (scan())
####    **3-** Envio de fax (fax())
#### O problema é que nem todas as impressoras possuem todas essas funções. Por exemplo:
####    Uma impressora simples pode apenas imprimir.
####    Um scanner pode apenas escanear.
####    Um aparelho de fax pode apenas enviar fax.
#### Se tivéssemos uma impressora sem funcionalidade de fax, ela ainda herdaria o método fax(), o que não faz sentido. Isso força classes a implementar métodos que não fazem sentido para elas, violando o ISP.

```java
public class ISPCompliant {
    public static void main(String[] args) {
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}

interface IPrinter {
    void print();
}

interface IScanner {
    void scan();
}

interface IFax {
    void fax();
}

class BasicPrinter implements IPrinter {
    public void print() {
        System.out.println("Printing...");
    }
}

class MultiFunctionPrinter implements IPrinter, IScanner, IFax {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}

class ScannerDevice implements IScanner {
    public void scan() {
        System.out.println("Scanning...");
    }
}
```
## **O que mudou?**: 
### **1-** Removemos o bloco try-catch da classe Calculator.
####    Agora, divide() apenas lança uma exceção quando b == 0.
####    Isso segue o SRP, pois a Calculator apenas realiza cálculos.
### **2-** Criamos implementações específicas:
####    Agora main() é responsável por capturar e exibir mensagens de erro.
####    Isso permite que outras partes do sistema tratem exceções conforme necessário.
### **3-** Removemos o catch (Exception e).
####    Isso evita que erros inesperados sejam mascarados.


## **Benefícios:**
### **1-** Agora o código segue o Princípio da Segregação de Interface (ISP).
### **2-** Nenhuma classe é forçada a implementar métodos que não fazem sentido para ela.
### **3-** Maior flexibilidade, permitindo a criação de dispositivos específicos sem código desnecessário.
### **4-** Facilita a extensão do sistema sem modificar classes existentes (seguindo também o OCP - Open/Closed Principle).