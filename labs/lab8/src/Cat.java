public class Cat extends Animal {

    private String name;
    public Cat(String name, float height, float weight, String color) {
        super(height, weight, color);
        this.name = name;
    }

    public String getName() {return name;}
    public void setName(String newName) {
        if (newName.length() < 20 && !newName.isEmpty())
            name = newName;
    }

    @Override
    protected void eat() {
        System.out.println("Cat " + getName() + " is eating");
    }

    @Override
    protected void sleep() {
        System.out.println("Cat " + getName() + " is sleeping");
    }

    @Override
    protected void makeSound() {
        System.out.println("Cat " + getName() + " is meowing");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { Name = " + getName() +
                ", Height = " + getHeight() +
                ", Weight = " + getWeight() +
                ", Color = " + getColor();
    }
}
