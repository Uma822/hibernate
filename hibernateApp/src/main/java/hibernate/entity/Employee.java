package hibernate.entity;

public class Employee {
    private int id;
    private String gender;
    private int salary;
    private String name;

    public Employee() {
    }

    public Employee(int id, String gender, int salary, String name) {
        this.id = id;
        this.gender = gender;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", gender='" + gender + '\'' +
                ", color='" + salary + '\'' +
                ", name='" + name + '\'' +
                '}';

    }
}
