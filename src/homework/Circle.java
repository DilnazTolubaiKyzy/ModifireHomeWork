package homework;

public class Circle {
    private int pi;

    public void area(){
        int radius = pi / 2;
        System.out.println(3.14 * (radius * radius));
    }
    public void circumference(){
        int radius = pi / 2;
        System.out.println(3.14 * 2 * radius );

    }

    public Circle(int pi) {
        this.pi = pi;
    }

    public int getIp() {
        return pi;
    }

    public void setIp(int pi) {
        this.pi = pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "pi=" + pi +
                '}';
    }

}
