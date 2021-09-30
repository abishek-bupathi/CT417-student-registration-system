import org.joda.time.DateTime;

class Course{

    String course_name;
    Module[] modules;
    Student[] students;
    DateTime academic_start_date;
    DateTime academic_end_date;

    Course(String course_name, Module[] modules, Student[] students, DateTime academic_start_date, DateTime academic_end_date){
        this.course_name = course_name;
        this.modules = modules;
        this.students = students;
        this.academic_start_date = academic_start_date;
        this.academic_end_date = academic_end_date;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    public void setStudents(Student[] students) {
        this.students = students;
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

    public Module[] getModules() {
        return modules;
    }

    public Student[] getStudents() {
        return students;
    }

    public DateTime getAcademic_start_date() {
        return academic_start_date;
    }

    public DateTime getAcademic_end_date() {
        return academic_end_date;
    }
}
