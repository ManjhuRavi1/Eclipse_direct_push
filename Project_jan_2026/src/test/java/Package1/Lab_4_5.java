
package Package1;
import java.util.*;

public class Lab_4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Employee4> map = new HashMap<>();
        EmployeeService4 service = new EmployeeServiceImpl4();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Show by Insurance Scheme");
            System.out.println("3. Delete Employee");
            System.out.println("4. Show All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            String ch = sc.nextLine();

            switch (ch) {
                case "1":
                    try {
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine());
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(sc.nextLine());
                        System.out.print("Enter Designation: ");
                        String desig = sc.nextLine();

                        Employee4 e = new Employee4(id, name, salary, desig);
                        if (service.addEmployee(map, e)) {
                            System.out.println("Employee Added");
                        } else {
                            System.out.println("ID Exists");
                        }
                    } catch (Exception ex) {
                        System.out.println("Invalid Input");
                    }
                    break;

                case "2":
                    System.out.print("Enter Scheme: ");
                    String scheme = sc.nextLine();
                    List<Employee4> list = service.getEmployeesByScheme(map, scheme);
                    if (list.isEmpty()) System.out.println("No Records");
                    else list.forEach(System.out::println);
                    break;

                case "3":
                    try {
                        System.out.print("Enter ID: ");
                        int del = Integer.parseInt(sc.nextLine());
                        if (service.removeEmployee(map, del))
                            System.out.println("Deleted");
                        else
                            System.out.println("Not Found");
                    } catch (Exception ex) {
                        System.out.println("Invalid ID");
                    }
                    break;

                case "4":
                    if (map.isEmpty()) System.out.println("No Employees");
                    else map.values().stream()
                            .sorted(Comparator.comparingInt(Employee4::getId))
                            .forEach(System.out::println);
                    break;

                case "5":
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}

class Employee4 {
    private int id;
    private String name;
    private double salary;
    private String designation;
    private String insuranceScheme;

    public Employee4(int id, String name, double salary, String designation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
    }

    public int getId() { return id; }
    public double getSalary() { return salary; }
    public String getDesignation() { return designation; }
    public String getInsuranceScheme() { return insuranceScheme; }
    public void setInsuranceScheme(String s) { this.insuranceScheme = s; }

    public String toString() {
        return id + " | " + name + " | " + salary + " | " + designation + " | " + insuranceScheme;
    }
}

interface EmployeeService4 {
    void determineInsuranceScheme(Employee4 e);
    boolean addEmployee(Map<Integer, Employee4> map, Employee4 e);
    boolean removeEmployee(Map<Integer, Employee4> map, int id);
    List<Employee4> getEmployeesByScheme(Map<Integer, Employee4> map, String scheme);
}

class EmployeeServiceImpl4 implements EmployeeService4 {

    public void determineInsuranceScheme(Employee4 e) {
        double s = e.getSalary();
        String d = e.getDesignation();

        if (s > 40000 && d.equalsIgnoreCase("Manager"))
            e.setInsuranceScheme("Scheme A");
        else if (s >= 20000 && s <= 40000 && d.equalsIgnoreCase("Programmer"))
            e.setInsuranceScheme("Scheme B");
        else if (s >= 5000 && s < 20000 && d.equalsIgnoreCase("System Associate"))
            e.setInsuranceScheme("Scheme C");
        else
            e.setInsuranceScheme("No Scheme");
    }

    public boolean addEmployee(Map<Integer, Employee4> map, Employee4 e) {
        if (map.containsKey(e.getId())) return false;
        determineInsuranceScheme(e);
        map.put(e.getId(), e);
        return true;
    }

    public boolean removeEmployee(Map<Integer, Employee4> map, int id) {
        return map.remove(id) != null;
    }

    public List<Employee4> getEmployeesByScheme(Map<Integer, Employee4> map, String scheme) {
        List<Employee4> list = new ArrayList<>();
        for (Employee4 e : map.values()) {
            if (e.getInsuranceScheme().equalsIgnoreCase(scheme))
                list.add(e);
        }
        return list;
    }
}
