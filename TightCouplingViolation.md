# TightCouplingViolation

### **Melhoria:** Criar uma interface para "Engine", de modo que a "Car" dependa da abstração em vez de uma implementação concreta, possibilitando diferentes tipos de motores a serem utilizados.
### **Princípio SOLID quebrado:** Dependency Inversion Principle (DIP), a "Car" depende diretamente da implementação concreta da classe "Engine".