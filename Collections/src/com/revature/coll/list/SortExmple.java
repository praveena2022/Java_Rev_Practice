package com.revature.coll.list;

import java.util.Collections;

public class SortExmple {
    public static void main(String[] args) {

        EmployeeNameComparator empName=new EmployeeNameComparator();


        Employee e1 = new Employee(01, "Praveena", 20000);

        Employee e2 = new Employee(02, "Anu", 40000);
        Employee e3 = new Employee(02, "Lavanya", 60000);

        Employee emp = new Employee();

        Collections.sort(emp,empName);
    }
}
