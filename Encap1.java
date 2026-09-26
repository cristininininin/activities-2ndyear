 class Employee {
    private String name;
    private int age;
    private long empId;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public void setEmpId(long newEmpId) {
        this.empId = newEmpId;
    }

    public long getEmpId() {
        return this.empId;
    }
}

public class Encap1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Richard");
        e.setAge(41);
        e.setEmpId(12465789);

        System.out.println("Employee's name: " + e.getName());
        System.out.println("Employee's age: " + e.getAge());
        System.out.println("Employee's ID: " + e.getEmpId());
    }
}
