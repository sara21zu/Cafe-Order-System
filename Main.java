class Drink {
    String size;
    boolean milk;
    int sugar;

    public void showDrink() {
        System.out.println("Size: " + size);
        System.out.println("Milk: " + milk);
        System.out.println("Sugar: " + sugar);
    }
}

interface DrinkBuilder {
    void setSize(String size);
    void addMilk();
    void setSugar(int sugar);
    Drink build();
}

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

    public Drink build() {
        return drink;
    }
}

public class Main {
    public static void main(String[] args) {
        CoffeeBuilder builder = new CoffeeBuilder();

        builder.setSize("Large");
        builder.addMilk();
        builder.setSugar(2);

        Drink coffee = builder.build();
        coffee.showDrink();
    }
}
