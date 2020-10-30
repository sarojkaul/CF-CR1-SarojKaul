public class Main {
    static void calculateRectArea(int a,int b){
        int area = a*b;
        System.out.println(area + "cm");    /* Method for calculating area of rectangle*/
    }
    static void squarePerimeter(int c) {
        int squarearea = 4*c;
        System.out.println(squarearea + "cm");     /* Method for calculating Perimeter of square*/
    }
    static void squareArea(int d){
           int square = d*d;
           System.out.println(square + "cm");
    }

    public static void main (String[] args){
        System.out.println("Area of Rectangle: ");
        calculateRectArea(30,40);
        System.out.println("Area of Rectangle: ");
        calculateRectArea(40,50);
        System.out.println("Area of square ");
        squarePerimeter(2);
        System.out.println("Perimeter of square ");
        squareArea(4);
    }

    }

