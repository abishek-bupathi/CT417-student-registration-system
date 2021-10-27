import java.util.ArrayList;

class Module{

    String module_name;
    ArrayList<Student> students = new ArrayList<Student>();
    ArrayList<Course> courses = new ArrayList<Course>();

    Module(String module_name){
        this.module_name = module_name;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public String getModuleName() {
        return module_name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

}