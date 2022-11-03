package com.edureka.assignments.module2;
class EmployeeDetails{
    int emp_id;
    String name;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [emp_id = " + emp_id + ", name = " + name + "]";
    }

}
public class Employee1 {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails();

        emp.setEmp_id(001);
        emp.setName("John");
        System.out.println(emp);

        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setEmp_id(002);
        emp1.setName("Clark");
        System.out.println(emp1);

        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.setEmp_id(003);
        emp2.setName("Nancy");
        System.out.println(emp2);

        EmployeeDetails emp3 = new EmployeeDetails();
        emp3.setEmp_id(004);
        emp3.setName("Joe");
        System.out.println(emp3);

        EmployeeDetails emp4 = new EmployeeDetails();
        emp4.setEmp_id(005);
        emp4.setName("Mary");
        System.out.println(emp4);
    }
}
