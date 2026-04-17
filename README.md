#☕ Cafe Order System (Builder Pattern)

📌 Description

This project is a simple Cafe Order System in Java.
It uses the Builder Design Pattern to create drinks step by step.

⸻

🧱 Structure

🔹 Drink (Product)

Represents the final drink with:

* size
* milk
* sugar
* chocolate

⸻

🔹 DrinkBuilder (Interface)

Defines building steps:

* setSize()
* addMilk()
* setSugar()
* addChocolate()
* build()

⸻

🔹 Builders

* CoffeeBuilder → builds coffee
* TeaBuilder → builds tea

⸻

🔹 Main

Creates the drink step by step using the builder:
```java
DrinkBuilder builder = new CoffeeBuilder();

builder.setSize("Large");

builder.addMilk();

builder.setSugar(2);

builder.addChocolate();

Drink drink = builder.build();
drink.showDrink();
```
⚙️ How it works

1. Choose builder
2. Set properties
3. Call build()
4. Show result

⸻

✅ Why Builder Pattern?

* Avoids complex constructors
* Easy to modify
* Flexible for different drinks

⸻
## 📸 Output

```
Size: Large
Milk: Yes
Sugar: 2
Chocolate: Yes
```
⸻

👩‍💻 Author

* sara21zu

