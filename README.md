# SOLID Principles Java Lab

Laboratorio práctico en Java para aplicar y comprender los principios SOLID de diseño orientado a objetos.

## 📌 Objetivo

Implementar ejemplos prácticos de cada uno de los cinco principios SOLID utilizando Java 17 y pruebas unitarias con JUnit 5.

---

## 🧱 Principios Implementados

### 1 SRP – Single Responsibility Principle
Cada clase tiene una única responsabilidad.

Ejemplo:
- `Invoice`
- `InvoiceCalculator`

---

### 2️ OCP – Open/Closed Principle
Las clases están abiertas para extensión, pero cerradas para modificación.

Ejemplo:
- `Shape`
- `Circle`
- `Rectangle`
- `AreaCalculator`

---

### 3️ LSP – Liskov Substitution Principle
Las subclases pueden sustituir a sus clases base sin alterar el comportamiento esperado.

Ejemplo:
- `Bird`
- `FlyingBird`
- `Sparrow`

---

### 4️ ISP – Interface Segregation Principle
Los clientes no deben depender de interfaces que no usan.

Ejemplo:
- `Workable`
- `Eatable`
- `HumanWorker`
- `RobotWorker`

---

### 5️ DIP – Dependency Inversion Principle
Los módulos de alto nivel no deben depender de módulos de bajo nivel, sino de abstracciones.

Ejemplo:
- `MessageService`
- `EmailService`
- `Notification`

---

## 🛠️ Tecnologías Utilizadas

- Java 17
- Maven
- JUnit 5

---

## 📂 Estructura del Proyecto

```text
src/
├── main/
│   └── java/
│       └── com/
│           └── example/
│               └── solid/
│                   ├── srp/
│                   ├── ocp/
│                   ├── lsp/
│                   ├── isp/
│                   └── dip/
│
└── test/
    └── java/
        └── com/
            └── example/
                └── solid/
                    ├── srp/
                    ├── ocp/
                    ├── lsp/
                    ├── isp/
                    └── dip/
```


### Ejecutar pruebas
```bash
mvn test

