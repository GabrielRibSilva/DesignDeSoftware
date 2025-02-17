# OpenClosedViolation

### **Melhoria:** Criar uma interface para "DiscountStrategy" e implementações específicas para cada tipo de cliente.
### **Princípio SOLID quebrado:** Open-Closed Principle (OCP), a classe "DiscountCalculator" precisa ser modificada sempre que um novo tipo de cliente for adicionado, no entanto, o OCP diz que as classes devem estar abertas para extensão, mas fechadas para modificação.