package employee;

public class Parttime extends Employee {
    private int hour;

    public Parttime() {
    }

    @Override
    public int getSalary() {
        return hour * 100000;
    }

    public Parttime(int hour) {
        this.hour = hour;
    }

    public Parttime(int code, String name, int age, String phone, String email, int hour) {
        super(code, name, age, phone, email);
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}