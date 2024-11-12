class Rectangle extends Shape {
    private float a;
    private float b;

    public float getA() {return a;}
    public void setA(float newA) {
        if (newA > 0)
            a = newA;
    }

    public float getB() {return b;}
    public void setB(float newB) {
        if (newB > 0)
            b = newB;
    }

    @Override
    public float calculatePerimeter() {

        return (a+b)*2;
    }

    @Override
    public float calculateArea() {
        return a*b;
    }

}
