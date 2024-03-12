import java.util.ArrayList;
import java.util.stream.Collectors;

public class Name {
    public static void main(String[] args) {



        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101,"Praveena",600000));
        emp.add(new Employee(102,"Arya",300000));
        emp.add(new Employee(100,"Lavanya",900000));
        emp.add(new Employee(203,"Manu",200000));


        System.out.println("Employees having salary greater than 400000");
        emp.stream().filter(emps->emps.getSalary()>400000).forEach(System.out::println);

        System.out.println("Employees salary after updating them by 25%");
        emp.stream().map(emps->emps.getSalary()*0.25+emps.getSalary()).forEach(System.out::println);

        System.out.println("Employees names after converting them to uppercase");
        ArrayList<String> newEmps= (ArrayList<String>) emp.stream().map(emps->emps.getName().toUpperCase()).collect(Collectors.toList());
        System.out.println(newEmps);






    }

}
