class Circle extends Shape {
    private float radius;

    public float getRadius() {return radius;}
    public void setRadius(float newRadius) {
        if (newRadius>0)
            radius = newRadius;
    }

    @Override
    public float calculateArea() {
        return pi * radius * radius;
    }
    @Override
    public float calculatePerimeter() {
        return 2 * pi * radius;
    }
}
