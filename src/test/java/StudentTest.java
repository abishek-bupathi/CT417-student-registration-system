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

        // Creating student object with name,age, dob, id, Course and Modules
        Student student1 = new Student("Abishek", 20, "08/12/2000", 18280072, BP4, modules);

        // Checking for expected output from getUsername() function of student class
        assertEquals("Abishek20", student1.getUsername());
    }


    @Test
    void getModules() {

        // Creating a Course object
        Course BP4 = new Course("CSIT", DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));

        // Creating Module objects
        Module CT417 = new Module("CT417");
        Module ME123 = new Module("ME123");
        Module EE987 = new Module("EE987");

        // Creating an arraylist and adding the modules to the list
        ArrayList<Module> modules_test = new ArrayList<>();
        modules_test.add(CT417);
        modules_test.add(ME123);
        modules_test.add(EE987);

        // Creating student object with name,age, dob, id, Course and Modules
        Student student1 = new Student("Abishek", 20, "08/12/2000", 18280072, BP4, modules_test);

        assertEquals(modules_test, student1.getModules());
    }
}