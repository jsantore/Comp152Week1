import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


void main() throws IOException {

    var allStudents = Files.readAllLines(Paths.get("ClassList.txt"));
    //print out the list of students
    for (var student : allStudents) {
        System.out.println(student);
    }
}
