public class Student {
    private String name;
    private int age;
    private int studentNumber;
    private int phoneNumber;

    public Student(String name, int age, int studentNumber) throws NegAgeException {
        this.setName(name);
        this.setAge(age);
        this.setStudentNumber(studentNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws NegAgeException {
        if (age <= 0) throw new NegAgeException("Age should be positive");
        else this.age = age;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
