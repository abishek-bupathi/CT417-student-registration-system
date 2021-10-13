import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUsername() {

        // Creating a Course object
        Course BP4 = new Course("Electronic and Computer Engineering", DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));

        // Creating Module objects
        Module CT417 = new Module("Software Programming III");
        Module EE445 = new Module("Digital Signal Processing");

        // Creating an arraylist and adding the modules to the list
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(CT417);
        modules.add(EE445);

        // Adding modules to the BP4 course
        BP4.addModules(CT417);
        BP4.addModules(EE445);

        // Creating student object with name,age, dob, id, Course and Modules
        Student student1 = new Student("Abishek", 20, "08/12/2000", 18280072, BP4, modules);

        // Checking for expected output from getUsername() function of student class
        assertEquals("Abishek20", student1.getUsername());
    }

}