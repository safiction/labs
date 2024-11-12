class Square extends Shape{
    private float side;

    public float getA() {return side;}
    public void setA(float newSide) {
        if (newSide > 0)
            side = newSide;
    }

    @Override
    public float calculatePerimeter() {
        return side*4;
    }

    @Override
    public float calculateArea() {
        return side*side;
    }

}
