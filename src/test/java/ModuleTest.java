import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    @Test
    void getModuleName() {

        Module module_test = new Module("CT417");

        assertEquals("CT417", module_test.getModuleName());
    }

    @Test
    void getCourses() {

        Course course1 = new Course("ECE",  DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));
        Course course2 = new Course("CSIT",  DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));
        Course course3 = new Course("EEE",  DateTime.parse("2021-09-06"), DateTime.parse("2022-05-06"));

        ArrayList<Course> courses_test = new ArrayList<>();

        Module module = new Module("CT417");

        //  Adding the course to module and a test arraylist
        module.addCourse(course1);
        courses_test.add(course1);
        module.addCourse(course2);
        courses_test.add(course2);
        module.addCourse(course3);
        courses_test.add(course3);

        assertEquals(courses_test, module.getCourses());
    }
}