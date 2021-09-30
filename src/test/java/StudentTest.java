import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getUsername() {

        Course BP4 = new Course("Electronic and Computer Engineering", DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));

        Module CT417 = new Module("Software Programming III");
        Module EE445 = new Module("Digital Signal Processing");

        ArrayList<Module> modules = new ArrayList<>();
        modules.add(CT417);
        modules.add(EE445);

        BP4.addModules(CT417);
        BP4.addModules(EE445);

        Student student1 = new Student("Abishek", 20, "08/12/2000", 18280072, BP4, modules);

        assertEquals("Abishek20", student1.getUsername());
    }

}