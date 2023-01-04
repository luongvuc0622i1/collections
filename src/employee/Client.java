package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Employee employee1 = new Fulltime(001, "a", 22, "0923", "@gmail.com", 50, 30, 20);
        Employee employee2 = new Fulltime(002, "b", 22, "0923", "@gmail.com", 900000, 10, 200000);
        Employee employee3 = new Fulltime(003, "c", 22, "0923", "@gmail.com", 80, 0, 20);

//        System.out.println(employee1.getSalary());
//        System.out.println(employee2.getSalary());
//        System.out.println(employee3.getSalary());

        Employee employee4 = new Parttime(004, "d", 30, "878", "@gmail.com", 13);
        Employee employee5 = new Parttime(005, "e", 30, "878", "@gmail.com", 10);
        Employee employee6 = new Parttime(006, "f", 30, "878", "@gmail.com", 20);

//        System.out.println(employee4.getSalary());
//        System.out.println(employee5.getSalary());
//        System.out.println(employee6.getSalary());

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        for (Employee employee : employeeList) {
            System.out.println(employee.getSalary());
        }

        int agv = 0;
        for (Employee employee : employeeList) {
            agv = agv + employee.getSalary()/employeeList.size();
        }
        System.out.println(agv);
        for (Employee employee : employeeList) {
            if (employee instanceof Fulltime && employee.getSalary() >= agv) {
                System.out.println(employee.getName());
            }
        }

        List<Fulltime> fulltimeList = new ArrayList<Fulltime>();
        for (Employee employee : employeeList) {
            if (employee instanceof Fulltime) {
                fulltimeList.add((Fulltime) employee);
            }
        }
        for (Fulltime fulltime : fulltimeList) {
            System.out.println(fulltime.getName());
        }
        Collections.sort(fulltimeList, new Comparator<Fulltime>() {
            @Override
            public int compare(Fulltime o1, Fulltime o2) {
                return o1.getSalary() - o2.getSalary();
            }
        });
        for (Fulltime fulltime : fulltimeList) {
            System.out.println(fulltime.getName());
        }
    }
}
