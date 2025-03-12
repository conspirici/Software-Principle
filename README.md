# **Understanding the Single Responsibility Principle (SRP) with a Robot Assistant**

**[Watch the video on YouTube](https://youtu.be/kqOjI39NmzA)**
## **What is the Single Responsibility Principle (SRP)?**
The **Single Responsibility Principle (SRP)** is one of the **SOLID** principles of software design. It states that:  

> **"Each module or class should be assigned a single, well-defined responsibility or purpose, reducing complexity and promoting maintainability."**  

This means that every **class or module should have only one reason to change**.  
By following SRP, we keep our code **organized, easier to understand, and more adaptable** to future changes.  

---

## **Why is SRP Important?**
- **Reduces Complexity** – By dividing responsibilities, each class is simpler and more focused.  
- **Improves Maintainability** – Changes in one module don’t break others.  
- **Enhances Readability** – Code is easier to understand.  
- **Increases Reusability** – Modules can be reused in different projects.  
- **Simplifies Debugging** – Issues are easier to locate and fix.  

---

## **Robot Assistant Example**
To demonstrate SRP, we created a **Robot Assistant** that can:
1. **Speak** messages.
2. **Walk** to a destination.
3. **Charge** its battery.  

### **Bad Design (Without SRP)**
Initially, we put all these responsibilities inside **one** `Robot` class.  
This violates SRP because **one class is handling multiple tasks**:  
- Storing robot details  
- Managing movement  
- Handling speech  
- Charging the battery  

This makes the class **hard to modify and maintain**.  

### **Good Design (With SRP)**
To follow SRP, we **separated concerns** into different classes:
1. `Robot` – Stores robot details.  
2. `SpeechModule` – Handles speaking functionality.  
3. `MovementModule` – Handles walking and battery consumption.  
4. `ChargingModule` – Handles charging functionality.  

Each class now has **only one responsibility**, making the code **modular, reusable, and easy to maintain**.  

---
**In the given repo I have added two java files one without the implementation of the principle,
and one with the implementaion of principle,
along with a video explaining the code**
