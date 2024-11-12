public class Animal {
    protected float height;
    protected float weight;
    protected String color;

    public Animal() {
    }

    public Animal(float height, float weight, String color) {
        this.color = color;
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {return height;}
    public void setHeight(float newHeight) {
        if (newHeight > 0)
            height = newHeight;
    }

    public double getWeight() {return weight;}
    public void setWeight(float newWeight) {
        if (newWeight > 0)
            weight = newWeight;
    }

    public String getColor() {return color;}
    public void setColor(String newColor) {
        color = newColor;
    }

    protected void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    protected void sleep() {
        System.out.println(getClass().getSimpleName() + " is sleeping");
    }

    protected void makeSound() {
        System.out.println(getClass().getSimpleName() + " is making sound");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " { Height = " + height +
                ", weight = " + weight +
                ", color = " + color + " }";
    }
}
