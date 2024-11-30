public class Animal {
    private String name;
    private double height;
    private double weight;

    public Animal() {
        name = null;
        height = 0;
        weight = 0;
    }

    public Animal(String name) {
        this.name = name;
        height = 1;
        weight = 1;
    }

    public double getHeight() {return height;}
    public void setHeight(double height) {this.height = height;}

    public double getWeight() {return weight;}
    public void setWeight(double weight) {this.weight = weight;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + ": name " + name + ", height " + height + ", weight " + weight + "]";
    }
}
