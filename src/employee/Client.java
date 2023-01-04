package employee;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new Fulltime(001, "a", 22, "0923", "@gmail.com", 50, 30, 20);
        Employee employee2 = new Fulltime(002, "b", 22, "0923", "@gmail.com", 60, 10, 20);
        Employee employee3 = new Fulltime(003, "c", 22, "0923", "@gmail.com", 80, 0, 20);

        System.out.println(employee1.getSalary());
        System.out.println(employee2.getSalary());
        System.out.println(employee3.getSalary());

        Employee employee4 = new Parttime(004, "d", 30, "878", "@gmail.com", 13);
        Employee employee5 = new Parttime(005, "e", 30, "878", "@gmail.com", 10);
        Employee employee6 = new Parttime(006, "f", 30, "878", "@gmail.com", 20);

        System.out.println(employee4.getSalary());
        System.out.println(employee5.getSalary());
        System.out.println(employee6.getSalary());
    }
}
