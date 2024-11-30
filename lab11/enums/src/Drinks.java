public enum Drinks {
    COLA ("Coke Cola", 150),
    SPRITE ("Sprite", 220),
    FANTA("Fanta", 70);

    private final String name;
    private final int price;

    Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public int getPrice() {return price;}

    public void displayMenu(int number) {
        System.out.println(number + ". Name: " + this.name + "   price: " + this.price);
    }
}