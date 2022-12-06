package ru.mirea.task17.task1;

import ru.mirea.task17.task2.Employee;
import ru.mirea.task17.task2.EmployeeControler;
import ru.mirea.task17.task2.EmployeeView;

public class MVCPatternDemo2
{
    public static void main(String[] args) {
        Employee model = retriveEmployeeFromDatabase();
        EmployeeView view = new EmployeeView();
        EmployeeControler controller = new EmployeeControler(model, view);
        controller.updateView();
        controller.setEmployeeName("Student1");
        controller.setEmployeekol(168);
        System.out.println("After updating, Student Details are as follows");
        controller.updateView();
    }
    private static Employee
    retriveEmployeeFromDatabase()
    {
        Employee employee = new Employee();
        employee.setName("Student2");
        employee.setkol(153);
        return employee;
    }
}