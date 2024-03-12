package com.revature.coll.list;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee>{


    @Override
    public int compare(Employee p1, Employee p2) {
        return Integer.compare(p1.getName(),p2.getName());
    }
}

}
