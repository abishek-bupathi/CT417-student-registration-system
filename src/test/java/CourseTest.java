import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getModules() {

        Module module_test_1 = new Module("CT417");
        Module module_test_2 = new Module("EE420");
        Module module_test_3 = new Module("ME123");

        ArrayList<Module> modules_test = new ArrayList<>();

        Course course = new Course("ECE",  DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));

        course.addModule(module_test_1);
        modules_test.add(module_test_1);
        course.addModule(module_test_2);
        modules_test.add(module_test_2);
        course.addModule(module_test_3);
        modules_test.add(module_test_3);

        assertEquals(modules_test, course.getModules());
    }


    @Test
    void getCourse_name() {

        // Creating course with an initial name
        Course course = new Course("ECE",  DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));
        // Checking the course name
        assertEquals("ECE", course.getCourse_name());

        // Changing the course name
        course.setCourse_name("CSIT");
        // Checking the changed course name
        assertEquals("CSIT", course.getCourse_name());


    }

}