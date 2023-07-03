package codewithharry.Constructor;

class cylinder{

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height)
-        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
+++
    private int radius;
}
public class Set1 {
    public static void main(String[] args) {

        cylinder mycylinder = new cylinder();
        mycylinder.setHeight(50);
        mycylinder.setRadius(20);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
    }

}
