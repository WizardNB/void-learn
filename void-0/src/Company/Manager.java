package Company;

public class Manager extends Employee {

    private int level=1;
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        setLevel(1);
        setBonus(bonus);
    }

    @Override
    public int getLevel() {
        return level;
    }

    @Override
    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public void setName(String name) {
        this.name = "༺" + name + "༻";
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return name + "[基础工资" + getSalary() + ",奖金" + getBonus() + "]";
    }
}
