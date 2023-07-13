package codewithharry.Constructor;

class cylinder{

    private int height;
    private int radius;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height){
      this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
  public double surfacearea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
  }

}
public class Set1 {
    public static void main(String[] args) {

        //problem 1 give the cylider hight and radius

        cylinder mycylinder = new cylinder();
        mycylinder.setHeight(50);
        mycylinder.setRadius(20);
        System.out.println(mycylinder.getHeight());
        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.surfacearea());
    }

}
