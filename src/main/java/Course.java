import org.checkerframework.checker.units.qual.A;
import org.joda.time.DateTime;
import java.util.ArrayList;

class Course{

    String course_name;
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
    DateTime academic_start_date;
    DateTime academic_end_date;

    Course(String course_name, DateTime academic_start_date, DateTime academic_end_date){
        this.course_name = course_name;
        this.academic_start_date = academic_start_date;
        this.academic_end_date = academic_end_date;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void addModules(Module module) {
        modules.add(module);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public void setAcademic_start_date(DateTime academic_start_date) {
        this.academic_start_date = academic_start_date;
    }

    public void setAcademic_end_date(DateTime academic_end_date) {
        this.academic_end_date = academic_end_date;
    }

    public String getCourse_name() {
        return course_name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public DateTime getAcademic_start_date() {
        return academic_start_date;
    }

    public DateTime getAcademic_end_date() {
        return academic_end_date;
    }
}
