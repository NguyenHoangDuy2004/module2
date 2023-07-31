package ss11_DSA_Stack_Queue.baitap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Employee {
    String name;
    String gender;
    String dob;

    public Employee(String name, String gender, String dob) {
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }
}

public class Demerging {
    public static void demerge(List<Employee> records) {
        Queue<Employee> femaleQueue = new LinkedList<>();
        Queue<Employee> maleQueue = new LinkedList<>();

        for (Employee record : records) {
            if (record.gender.equalsIgnoreCase("Female")) {
                femaleQueue.add(record);
            } else if (record.gender.equalsIgnoreCase("Male")) {
                maleQueue.add(record);
            }
        }

        while (!femaleQueue.isEmpty()) {
            Employee employee = femaleQueue.poll();
            System.out.println("Female: " + employee.name);
        }

        while (!maleQueue.isEmpty()) {
            Employee employee = maleQueue.poll();
            System.out.println("Male: " + employee.name);
        }
    }

    public static void main(String[] args) {
        List<Employee> records = new ArrayList<>();
        records.add(new Employee("Nguyen Van A", "Male", "01/01/1980"));
        records.add(new Employee("Tran Thi B", "Female", "02/03/1990"));
        records.add(new Employee("Pham Van C", "Male", "15/05/1985"));
        records.add(new Employee("Le Thi D", "Female", "10/07/1995"));
        records.add(new Employee("Hoang Van E", "Male", "30/09/1982"));

        demerge(records);
    }

}
