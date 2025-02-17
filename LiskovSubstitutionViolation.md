# LiskovSubstitutionViolation

### **Melhoria:** Criar uma hierarquia mais bem estruturada, separando pássaros que podem voar (interface) e garantir que cada subclasse cumpra as expectativas de comportamento da superclasse.
### **Princípio SOLID quebrado:** Liskov Substitution Principle (LSP), a subclasse "Ostrich" modifica o comportamento esperado da classe "Bird" gerando uma exceção inesperada, pois "Ostrich" herda de "Bird" mas ele não pode voar.