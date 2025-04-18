public class Rectangle extends Shape{

    public Rectangle() {

    }
    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    private int sideA=0, sideB=0;

    @Override
    public void describe() {
        super.describe();
        System.out.println("Side A " + sideA
                + " Side B " + sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
        if (this.sideA ==rectangle.getSideA()
        && this.sideB == rectangle.sideB
        && this.getColor().equals(rectangle.getColor())) {
            return true;
        }
        else
            return false;
    }
}