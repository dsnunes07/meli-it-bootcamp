package School;

public class Student {
  private String name;
  private int age;
  private int registration;
  private int classroom;


  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getRegistration() {
    return this.registration;
  }

  public void setRegistration(int registration) {
    this.registration = registration;
  }

  public int getClassroom() {
    return this.classroom;
  }

  public void setClassroom(int classroom) {
    this.classroom = classroom;
  }

  @Override
  public String toString() {
    String name = "nome: " + getName();
    String age = "age: " + getAge();
    String registration = "registration: " + getRegistration();
    
  }


}
