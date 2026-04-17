// Product
class Drink {
    String size;
    boolean milk;
    int sugar;
    boolean chocolate;

    public void showDrink() {
        System.out.println("Size: " + size);
        System.out.println("Milk: " + (milk ? "Yes" : "No"));
        System.out.println("Sugar: " + sugar);
        System.out.println("Chocolate: " + (chocolate ? "Yes" : "No" ));
    }
}

// Builder Interface
interface DrinkBuilder {
    void setSize(String size);
    void addMilk();
    void setSugar(int sugar);
    void addChocolate();
    Drink build();
}

// Coffee Builder
class CoffeeBuilder implements DrinkBuilder {
    private Drink drink = new Drink();

    public void setSize(String size) {
        drink.size = size;
    }

    public void addMilk() {
        drink.milk = true;
    }

    public void setSugar(int sugar) {
        drink.sugar = sugar;
    }

    public void addChocolate() {
        drink.chocolate = true;
    }

    public Drink build() {
        return drink;
    }
}

// Tea Builder
class TeaBuilder implements DrinkBuilder {
    private Drink drink = new Drink();

    public void setSize(String size) {
        drink.size = size;
    }

    public void addMilk() {
        drink.milk = false; // شاي بدون حليب
    }

    public void setSugar(int sugar) {
        drink.sugar = sugar;
    }

    public void addChocolate() {
        drink.chocolate = true;
    }

    public Drink build() {
        return drink;
    }
}

// Main
public class Main {
    public static void main(String[] args) {

        // خذي الـ builder
        DrinkBuilder builder = new CoffeeBuilder();

        // بناء المشروب
        builder.setSize("Large");
        builder.addMilk();
        builder.setSugar(2);
        builder.addChocolate();

        // النتيجة
        Drink drink = builder.build();
        drink.showDrink();
    }
}

