import java.util.Scanner;
abstract class Shape{
    float area;
    Scanner scan = new Scanner(System.in);
    abstract public void inputData();
    abstract public void processData();
    public void outData(){
        System.out.println("The Area is : "+area);
    }


}
class Square extends Shape{
    private float length;

    public void inputData(){
        System.out.println("Enter the Length of the Square: ");
        length=scan.nextFloat();
    }
    public void processData(){
        area=length*length;
    }
}
class Rectangle extends Shape{
    private float length;
    private float breadth;
    public void inputData(){
        System.out.println("Enter the Length of the Rectangle:  ");
        length=scan.nextFloat();
        System.out.println("Enter the Breadth of the Rectangle: ");
        breadth=scan.nextFloat();
    }
    public void processData(){
        area= length*breadth;
    }
}
class Circle extends Shape{
    private float radius;
    public void inputData(){
        System.out.println("Enter the Radius of circle: ");
        radius=scan.nextFloat();
    }
    public void processData(){
        area=3.14f*radius*radius;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        Shape ref;
        calculation cl = new calculation();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - Welcome to the Area HuB - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println("FOR YOU WE FIND THE AREA OF SOME SHAPES.....\n");
        System.out.println("------- There are some Passcode's-------");
        System.out.println(" -------------------------------");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println("|    1   -    Area of Square    |");
        System.out.println("|    2   -    Area of Rectangle |");
        System.out.println("|    3   -    Area of Circle    |");
        System.out.println("|                               |");
        System.out.println("|                               |");
        System.out.println(" -------------------------------");

        System.out.println("Enter Any passcode");
        int pass = scan.nextInt();
        if(pass==1)
            cl.showData(s);
        else if(pass==2)
            cl.showData(r);
        else if(pass==3)
            cl.showData(c);
        else
            System.out.println("Enter valid Passcode");


    }
}
class calculation{
    public void showData( Shape ref){
        ref.inputData();
        ref.processData();
        ref.outData();
    }
}
