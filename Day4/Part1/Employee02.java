public class Employee02 {

    int salary;
    int noOfHrs;

    public Employee02(int salary, int noOfHrs) {
        this.salary = salary;
        this.noOfHrs = noOfHrs;
    }

    public void getInfo(){
       System.out.println(salary);

    }
    public void AddSal(){
        if(salary<500)
            salary+=10;
    }
    public void AddWork(){
        if(noOfHrs>6)
            salary+=5;
    }


    public static void main(String[] args) {
        Employee02 emp=new Employee02(1000,8);
        emp.AddSal();
        emp.AddWork();
        emp.getInfo();

    }
}
