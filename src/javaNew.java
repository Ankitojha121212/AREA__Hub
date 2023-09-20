//import java.util.Scanner;
//
//class Square{
//    float length;
//    float area;
//    public void inputData(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the length of Square");
//        length = scan.nextFloat();
//    }
//    public void processData(){
//        area = length*length;
//    }
//    public  void outData(){
//        System.out.println("                                                                      The area of Square is:"+area);
//    }
//}
//class Rectangle{
//    float length;
//    float breadth;
//    float area;
//    public void inputData(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the length of Rectangle");
//        length = scan.nextFloat();
//        System.out.println("Enter the breadth of Rectangle:");
//        breadth = scan.nextFloat();
//    }
//    public void processData(){
//        area = length*breadth;
//    }
//    public  void outData(){
//        System.out.println("                                                                     The area of Rectangle is:"+area);
//    }
//}
//class Circle{
//    float radius;
//    float area;
//    public void inputData(){
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter the Radius of Circle:");
//        radius = scan.nextFloat();
//    }
//    public void processData(){
//        area= 3.14f*radius*radius;
//    }
//    public  void outData(){
//        System.out.println("                                                                        The area of Circle is:"+area);
//    }
//}
//public class javaNew {
//    public static void main(String[] args) {
//
//        Square s = new Square();
//        Rectangle r = new Rectangle();
//        Circle c = new Circle();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("                                                                             Welcome to our App                                 ");
//        System.out.println("                 Please use the given passcode ");
//        System.out.println("                                                                                                                     Press 1 for geting area of Square");
//        System.out.println("                                                                                                                     Press 2 for geting area of Rectangle");
//        System.out.println("                                                                                                                     Press 3 for geting area of Circle");
//        System.out.println("Enter the Passcode:           ");
//        int pass=scan.nextInt();
//        if(pass==1){
//            s.inputData();
//            s.processData();
//            s.outData();
//        }
//        else if (pass==2){
//            r.inputData();
//            r.processData();
//            r.outData();
//        }
//        else if(pass==3){
//            c.inputData();
//            c.processData();
//            c.outData();
//        }
//        else{
//            System.out.println("                                                                   Please enter the valid passcode");
//        }
//
//
//    }
//
//}
