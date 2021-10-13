import java.util.ArrayList;

class Student{

    String name, dob, username;
    int age, id;
    Course course;
    ArrayList<Module> modules;

    Student(String name, int age, String dob, int id, Course course, ArrayList<Module> modules){
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.course = course;
        this.modules = modules;
        username = name.concat(Integer.toString(age)); // Creating Username by concatenating Name and age
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDob() {
        return dob;
    }

    public int getId() {
        return id;
    }

    public Course getCourse() {
        return course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public String getUsername() {
        return username;
    }
}