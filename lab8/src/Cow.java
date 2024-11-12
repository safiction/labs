public class Cow extends Animal {
    private String name;

    public Cow(String name, float height, float weight, String color) {
        super(height, weight, color);
        this.name = name;
    }

    public Cow(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {return name;}
    public void setName(String newName) {
        if (newName.length()<20 && !newName.isEmpty())
            name = newName;
    }

    @Override
    protected void eat() {
        System.out.println("Cow " + getName() + " is eating");
    }

    @Override
    protected void sleep() {
        System.out.println("Cow " + getName() + " is sleeping");
    }

    @Override
    protected void makeSound() {
        System.out.println("Cow " + getName() + " is mooooing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { Name = " + getName() +
                ", Height = " + getHeight() +
                ", Weight = " + getWeight() +
                ", Color = " + getColor();
    }
}
