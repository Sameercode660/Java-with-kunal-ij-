package inheritance;

public class Inheritance {
    public static void main(String[] args) {

        BoxColor color = new BoxColor(8, 8, "Red");
        BoxWeight weight = new BoxWeight(5, 5, 5.6);
        BoxName name = new BoxName(4, 3, "Big Box");

        System.out.println("color class constructor: ");
        color.display();

        System.out.println("weight class constructor: ");
        weight.display();

        System.out.println("name class constructor: ");
        name.display();
    }
}


class Box {
     int left;
     int right;

    Box(int left, int right) {
        this.left = left;
        this.right = right;
    }
}

class BoxColor extends  Box{
    private String color;

    BoxColor(int left, int right, String color) {
        super(left, right);
        this.color = color;
    }

    void display() {
        System.out.println(this.left);
        System.out.println(this.right);
        System.out.println(this.color);
    }

}

class BoxWeight extends Box {
    private double weight;

    BoxWeight(int left, int right, double weight) {
        super(left, right);
        this.weight = weight;
    }

    void display() {
        System.out.println(this.left);
        System.out.println(this.right);
        System.out.println(this.weight);
    }
}

class BoxName extends Box {
    private String boxName;

    BoxName(int left, int right, String boxName) {
        super(left, right);
        this.boxName = boxName;
    }

    void display() {
        System.out.println(this.left);
        System.out.println(this.right);
        System.out.println(this.boxName);
    }
}




