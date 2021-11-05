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

    public void setCourseName(String course_name) {
        this.course_name = course_name;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void setAcademicStartDate(DateTime academic_start_date) {
        this.academic_start_date = academic_start_date;
    }

    public void setAcademicEndDate(DateTime academic_end_date) {
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

    public DateTime getAcademicStartDate() {
        return academic_start_date;
    }

    public DateTime getAcademicEndDate() {
        return academic_end_date;
    }
}
