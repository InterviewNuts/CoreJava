package com.sahu.spring.springCore.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class TestEmp {

	public static void main(String[] args) {

		
	    Employee employee = new Employee("Rajeev", 24);
        Employee employee1 = new Employee("Hara", 25);
        Employee employee2 = new Employee("Haraa", 24);

        HashSet<Employee> employees = new HashSet<Employee>();
        employees.add(employee);
//        System.out.println(employees.contains(employee2));
//        System.out.println("employee.hashCode():  " + employee.hashCode()
//        + "  employee2.hashCode():" + employee2.hashCode());
       
        
        Employee [] emp = new Employee[3];
        
        emp[0]=employee;
        emp[1]=employee1;
        emp[2]=employee2;
        
        //! Now sort the arrays
        Arrays.sort(emp);
        
        for (Employee e: emp )
        {
        	System.out.println(e.getAge() + " " + e.getName());
        }
        
        
        System.out.println("======================================= arraylist=============");
        
 
        ArrayList<Employee> obj = new ArrayList<>();
        obj.add(employee);
        obj.add(employee1);
        obj.add(employee2);
        for (Employee o : obj) {
            // printing the sorted objects in arraylist by
            // name and age
            System.out.format("%s  %d\n", o.name, o.age);
        }
        
       
        System.out.println(employee.getClass().getName());
        System.out.println(employee.hashCode());
        
        
	}

}
