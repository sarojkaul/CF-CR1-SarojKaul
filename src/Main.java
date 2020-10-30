import java.util.Scanner;

public class Main {
    static void calculateRectArea(int a, int b) {
        int area = a * b;
        System.out.println(area + "cm");    /* Method for calculating area of rectangle*/
    }

    static void squarePerimeter(int c) {
        int squarearea = 4 * c;
        System.out.println(squarearea + "cm");     /* Method for calculating Perimeter of square*/
    }

    static void squareArea(int d) {
        int square = d * d;
        System.out.println(square + "cm");
    }

    public static void main(String[] args) {
        System.out.println("Area of Rectangle: ");
        calculateRectArea(30, 40);
        System.out.println("Area of Rectangle: ");
        calculateRectArea(40, 50);
        System.out.println("Area of square ");
        squarePerimeter(2);
        System.out.println("Perimeter of square ");
        squareArea(4);

        /*Bonus points sloution*/
        /*could you please tell me the right way of doing it
        i think i done this with the repition */

        int[] intArray = new int[6];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 6; i++)

        {
            System.out.println("Please enter a number width & height:");
            intArray[i] = input.nextInt();
        }

                for (int i = 0; i < 1; i++)
                    {
                    int arearec1 = intArray[0] * intArray[1];
                    int arearec2 = intArray[2] * intArray[3];
                    int arearec3 = intArray[4] * intArray[5];
                    System.out.println(arearec1 + "cm");
                    System.out.println(arearec2 + "cm");
                    System.out.println(arearec3 + "cm");
                }
            }
        }









