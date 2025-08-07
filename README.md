# 📚 Library Management System (Java OOP Project)

## 🎯 Objective
A mini Java-based Library Management System to demonstrate core Object-Oriented Programming (OOP) concepts like Abstraction, Inheritance, Encapsulation, and Polymorphism. This version includes **tracking of issued books per user**, with strict validation on return.

---

## 🛠️ Tech Stack
- Java (JDK 8 or above)
- IDE: VS Code
- Terminal or Command Prompt

---

## 📁 Project Structure

---

## ✅ Features

- Add new books to the library
- View all books with status (Available / Issued to user)
- Issue a book to a specific user
- Prevent issuing a book that is already issued
- Return book only if the **same user** tries to return it
- Prevent unauthorized return by another user

---

## 🧠 OOP Concepts Demonstrated

| Concept             | Implementation |
|---------------------|----------------|
| **Abstraction**     | Classes like `Book`, `User`, and `Library` hide implementation |
| **Encapsulation**   | All fields are private with public getters/setters |
| **Polymorphism**    | `toString()` method overridden in classes |
| **Inheritance**     | Extendable via class hierarchy (`AdminUser` etc.) |
| **Constructor Chaining** | Constructors initialize class state |
| **HAS-A**           | Library *has-a* collection of books |
| **Dynamic Binding** | `toString()` resolves at runtime |
| **Super Keyword**   | Can be added in future subclasses |

---

## ▶️ How to Run

1. Open terminal and navigate to project folder:
   ```bash
   cd "path/to/LibraryManagementSystem"


