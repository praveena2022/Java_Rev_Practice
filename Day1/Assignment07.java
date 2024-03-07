/*7. The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
*/

class Assignment07{
public static void main(String[] args)
 {
double totalStudents=90.0;
int boys=45;
double students_A_Grade=(50.0/100.0)*totalStudents;

System.out.println(students_A_Grade);

double girls_A_Grade=students_A_Grade-20;

System.out.println("Girls who got A grade are: "+girls_A_Grade);


}}