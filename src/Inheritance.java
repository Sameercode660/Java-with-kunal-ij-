



public class Inheritance
{
    public static void main(String[] args) {
        Sample smp1 = new Sample(9, 9, 9, 9);

        smp1.display();

    }
}

class Area {

    int length;
    int width;
    int radius;

    Area(int length, int width, int radius) {
        this.length = length;
        this.width = width;
        this.radius = radius;
    }

    void display() {
        System.out.println("Length is : "+ this.length);
        System.out.println("Width is : "+ this.width);
        System.out.println("Radius is : "+ this.radius);
    }
}

class Sample extends  Area {

    private  int  num ;

    Sample(int length, int width, int radius, int num) {
        super(length, width, radius);
        this.num = num;
    }

    void display() {

        System.out.println("Length is : "+ this.length);
        System.out.println("Width is : "+ this.width);
        System.out.println("Radius is : "+ this.radius);
        System.out.println("Num is: " + this.num);
    }


}


