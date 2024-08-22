package Company;

public class Employee implements Comparable<Employee>,Cloneable{

    private final int ID;
    public String name;
    private int level=0;
    private int salary;

    public Employee(String name, int salary) {
        setName(name);
        setSalary(salary);
        ID=1;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + "[基础工资" + getSalary() + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name)+(this.getLevel()-o.getLevel())*10;
    }
}
