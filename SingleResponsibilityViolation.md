# SingleResponsibilityViolation

### **Melhoria:** A classe "Invoice" agora tem somente a responsabilidade de armazenar o valor da fatura, foi criada a classe "InvoicePrinter" para ter a responsabilidade de imprimir a fatura e a classe "InvoiceRepository" para salvar a fatura no Banco de Dados.
### **Princípio SOLID quebrado:** Single Responsiblity Principle (SRP) a classe "Invoice" possui 2 responsabilidades distintas, no entanto a classe deve ter somente responsabilidade relacionadas.