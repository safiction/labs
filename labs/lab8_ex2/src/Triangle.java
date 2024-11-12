class Triangle extends Shape{

    private float a;
    private float b;
    private float c;
    private float altA;

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

    public float getC() {return c;}
    public void setC(float newC) {
        if (newC > 0)
            c = newC;
    }

    public float getAltitude() {return altA;}
    public void setAltitude(float newAlt) {
        if (newAlt > 0)
            altA = newAlt;
    }

    @Override
    public float calculatePerimeter() {
        return a+b+c;
    }

    @Override
    public float calculateArea() {
        return (float)0.5 * a * altA;
    }

}
