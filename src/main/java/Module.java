class Module{

    String module_name;
    Student[] students;
    Course[] courses;

    Module(String module_name, Student[] students, Course[] courses){
        this.module_name = module_name;
        this.students = students;
        this.courses = courses;
    }

    public void setModule_name(String module_name) {
        this.module_name = module_name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public String getModule_name() {
        return module_name;
    }

    public Student[] getStudents() {
        return students;
    }

    public Course[] getCourses() {
        return courses;
    }
}