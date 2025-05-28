import java.util.Scanner;


void main(){
    var commandLineReader = new Scanner(System.in);
    System.out.print("How old are you?:");
    var age = commandLineReader.nextInt();
    var dogYears = age*7;
    System.out.println("You are "+ age +
            " years old, so you are "+
            dogYears +" in dog years.");
}
