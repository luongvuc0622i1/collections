package employee;

public class Fulltime extends Employee {
    private int bonus;
    private int fine;
    private int money;

    public Fulltime() {
    }

    @Override
    public int getSalary() {
        return money + (getBonus() - getFine());
    }

    public Fulltime(int bonus, int fine, int money) {
        this.bonus = bonus;
        this.fine = fine;
        this.money = money;
    }

    public Fulltime(int code, String name, int age, String phone, String email, int bonus, int fine, int money) {
        super(code, name, age, phone, email);
        this.bonus = bonus;
        this.fine = fine;
        this.money = money;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
