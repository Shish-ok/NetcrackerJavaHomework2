package comm.netcracker.homework2.ch3.ex1_2;

import comm.netcracker.homework2.ch3.ex1_2.Employee;
import comm.netcracker.homework2.ch3.ex1_2.Measurable;

public class Main {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Bob", 50);
        Employee worker2 = new Employee("Tom", 60);
        Employee worker3 = new Employee("Fred", 70);

        Measurable[] workers = {worker1, worker2, worker3};

        System.out.println("Average salary of 3 workers is ".concat(Double.toString(average(workers))));
        System.out.println("Largest salary from workers have ".concat(((Employee) largest(workers)).getName()));
    }
    static double average(Measurable ... objects) {
        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }
    static Measurable largest(Measurable ... objects) {
        Measurable maxSalary = objects[0];
        for (Measurable obj : objects) {
            if (obj.getMeasure() > maxSalary.getMeasure()) {
                maxSalary = obj;
            }
        }
        return maxSalary;
    }
}
