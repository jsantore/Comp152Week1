import java.util.Scanner;
import java.util.ArrayList;


void main(){
    var classList = new ArrayList<String>();
    var reader = new Scanner(System.in);
    while(true){
        System.out.println("Enter student name");
        var studentName = reader.nextLine();
        if(studentName.equals("")){
            break;
        }
        classList.add(studentName);
    }
    for(var name : classList) {
        System.out.println(name);
    }
}
