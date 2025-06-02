import java.util.Random;
import java.util.Scanner;
import java.awt.Point;


//void main()  {
//  var first = new Point(1, 1);
//  var second = new Point(4, 5);
//  var distance = calcDistance(first, second);
//  System.out.println(distance);
//  var value1 = 30;
//  var value2 = 4.5f;
//  paramDemo(value1, value2);
//  System.out.println("Value1 "+value1);
//
//}

public static int calcDistance(Point p1, Point p2){
    var deltaX = p2.x - p1.x;
    var deltaY = p2.y - p1.y;
    return (int) Math.sqrt(deltaX * deltaX + deltaY * deltaY);
}

public static void paramDemo(int number1, float number2)
{
   System.out.println("number1: " + number1);
   number1 = 10;
   System.out.println("number1: " + number1);
}

public static void returnDemo(){
    System.out.println("blewfliugjkhgsdff ");
}

static double Balance(double oldBalance, double interestRate){
    var newBalance = oldBalance *interestRate+oldBalance;
    return newBalance;
}


void main(){
    var newBalance = Balance(10, 0.2);
    System.out.println("After a year your Balance is:"  + newBalance );
}