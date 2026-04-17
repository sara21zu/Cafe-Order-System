# ☕ Cafe Order System (Builder + Abstract Factory)

📌 Project Description

This project is a simple Cafe Order System implemented in Java.
It demonstrates the use of two important Design Patterns:

* Builder Pattern 🏗️
* Abstract Factory Pattern 🏭

The system allows creating different types of drinks (Coffee ☕ or Tea 🍵) with customizable options such as:

* Size
* Milk
* Sugar
* Chocolate

⸻

🏗️ Design Patterns Used

🔹 Builder Pattern

Used to construct a Drink object step by step.
It allows flexibility in adding different options to the drink.

⸻

🔹 Abstract Factory Pattern

Used to create different types of drink builders without specifying their exact classes.

Factories included:

* CoffeeFactory
* TeaFactory

Each factory returns:

* CoffeeBuilder
* TeaBuilder

⸻

🧩 Project Structure

* Drink → Represents the final drink
* DrinkBuilder → Builder interface
* CoffeeBuilder, TeaBuilder → Concrete builders
* DrinkFactory → Abstract factory
* CoffeeFactory, TeaFactory → Concrete factories
* Main → Runs the program

⸻

▶️ How It Works

1. Choose the drink type (Coffee or Tea)
2. The factory creates the appropriate builder
3. The builder sets drink options
4. The drink is built and displayed

⸻
##💻 Example Usage
```java
DrinkFactory factory = new CoffeeFactory();
DrinkBuilder builder = factory.createDrinkBuilder();

builder.setSize("Large");
builder.addMilk();
builder.setSuger(2);
builder.addChocolate();

Drink drink = builder.build();
drink.showDrink();
```

⸻
##📸Output
```
Coffee ☕
Size: Large
Milk: Yes
Sugar: 2
Chocolate: Yes
```

⸻
##🧾Drink Options
| Option     | Description            |
|------------|------------------------|
| Size       | Small / Medium / Large |
| Milk       | Add milk or not        |
| Sugar      | Amount of sugar        |
| Chocolate  | Add chocolate or not   |

⸻
✅ Features

* Supports multiple drink types ☕🍵
* Customizable drink options
* Clean and simple design
* Easy to extend

⸻

👩‍💻 Author

Sara ✨

⸻
⭐ If you like this project, give it a star ⭐
