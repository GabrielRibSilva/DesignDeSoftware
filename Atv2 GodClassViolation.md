# Exercicio 2 - GodClassViolation

### **Melhoria**: Uma abordagem melhor seria delegar a responsabilidade a uma classe de orquestração (ApplicationController), que apenas coordena as chamadas sem realizar as tarefas diretamente.

### **Princípio SOLID quebrado**: O código infringe o Princípio da Responsabilidade Única (Single Responsibility Principle - SRP) do SOLID.

### **Problema**: A classe GodClassViolation (o próprio nome já sugere) age como uma "God Class" (Classe Deus), pois:
#### **1-** Está diretamente responsável por múltiplas tarefas: autenticação, carregamento de dashboard, processamento de pagamentos e geração de relatórios.
#### **2-** Isso viola o SRP, pois a classe tem muitas razões para mudar. Se precisarmos alterar qualquer um desses processos, teremos que modificar GodClassViolation, tornando o código difícil de manter e testar.

```java
public class SRPCompliantApp  {
    public static void main(String[] args) {
        ApplicationController appController = new ApplicationController();
        appController.run();
    }
}

class ApplicationController {
    private final UserAuthenticator authenticator = new UserAuthenticator();
    private final DashboardLoader dashboardLoader = new DashboardLoader();
    private final PaymentProcessor paymentProcessor = new PaymentProcessor();
    private final ReportGenerator reportGenerator = new ReportGenerator();

    public void run() {
        authenticator.authenticateUser();
        dashboardLoader.loadDashboard();
        paymentProcessor.processPayments();
        reportGenerator.generateReports();
    }
}

class UserAuthenticator {
    public void authenticateUser() {
        System.out.println("Authenticating user...");
    }
}

class DashboardLoader {
    public void loadDashboard() {
        System.out.println("Loading dashboard...");
    }
}

class PaymentProcessor {
    public void processPayments() {
        System.out.println("Processing payments...");
    }
}

class ReportGenerator {
    public void generateReports() {
        System.out.println("Generating reports...");
    }
}
```
## **O que mudou?**: 
### **1-** Criamos a classe ApplicationController, que apenas orquestra os serviços, sem realizar nenhuma lógica de negócios.
### **2-** As classes UserAuthenticator, DashboardLoader, PaymentProcessor e ReportGenerator continuam com suas responsabilidades únicas.
### **3-** ApplicationController agora é responsável apenas pela execução do fluxo do sistema, mantendo o código mais organizado e seguindo o SRP.

## **Benefícios:**
### **1-** O código agora segue o Princípio da Responsabilidade Única (SRP).
### **2-** Cada classe tem apenas uma responsabilidade, facilitando futuras mudanças.
### **3-** Melhor legibilidade, manutenção e testabilidade do código.