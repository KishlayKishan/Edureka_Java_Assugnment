package com.edureka.assignments.module2;
class EmployeeDetail{
    int emp_id, salary;
    String name;

    public int getEmp_id() {
        return emp_id;
    }
    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [emp_id = " + emp_id + ", salary = " + salary + ", name = " + name + "]";
    }

}
public class Employee {
    public static void main(String[] args) {
        EmployeeDetail emp = new EmployeeDetail();

        emp.setEmp_id(00);
        emp.setName("John");
        emp.setSalary(600000);
        emp.setEmp_id(01);
        System.out.println(emp);

        EmployeeDetail emp1 = new EmployeeDetail();
        emp1.setName("Clark");
        emp1.setSalary(550000);
        System.out.println(emp1);

        EmployeeDetail emp2 = new EmployeeDetail();
        emp2.setName("Nancy");
        emp2.setSalary(500000);
        System.out.println(emp2);

        EmployeeDetail emp3 = new EmployeeDetail();
        emp3.setName("Joe");
        emp3.setSalary(500000);
        System.out.println(emp3);

        EmployeeDetail emp4 = new EmployeeDetail();
        emp4.setName("Mary");
        emp4.setSalary(300000);
        System.out.println(emp4);
    }
}
