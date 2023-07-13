package codewithharry.Constructor;

class cyclider{
    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;
}

class VD44_pratice_set_constructor {
    public static void main(String[] args) {

        cyclider mycyclider = new cyclider();
        mycyclider.setHeight(50);
        mycyclider.setRadius(80);
        System.out.println(mycyclider.getHeight());
        System.out.println(mycyclider.getRadius());


    }


}
