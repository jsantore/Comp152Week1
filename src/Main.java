import java.util.Random;
import java.util.Scanner;


void main()  {
    var scanner = new Scanner(System.in);
    var random = new Random();
    var number = random.nextInt(10)+1;
    while (true) {
        System.out.println("Guess a number between 1 and 10");
        int guess = scanner.nextInt();
        if (guess == number) {
            System.out.println("You got it!");
            break;
        } else {
            System.out.println("You didn't get it!");
        }
    }
}

//Felipe here


//jeremias here!