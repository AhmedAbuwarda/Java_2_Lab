 /*
  * To change this template file, choose Settings | Editor | File and Code Templates
  * and change the template in the editor.
  */

 package Java_HW.Question_11_02;

 /**
  * @author AHMED ABUWARDA.
  */
 public class Test {

     /**
      * @param args the command line here.
      */
     public static void main(String[] args) {
         // TODO code application logic here.

         // Create a Person, Student, Employee, Faculty, and Staff objects.
         Person person = new Person("John", "12 Bell street",
                 "3473339999", "john12@aol.com");

         Student student = new Student("Mary", "100 Town Ave", "5149993333",
                 "mary100@aol.com", Student.FRESHMAN);

         Employee employee = new Employee("Mike", "34 West street", "6189999999",
                 "mike80@aol.com", 910, 60000);

         Faculty faculty = new Faculty("Sue", "28 Well street", "4133333333",
                 "sue28@aol.com", 101, 50000, "4pm to 6pm", "Professor");

         Staff staff = new Staff("Tom", "90 Country road", "2030000000",
                 "tomcat@aol.com", 12, 65000, "Executive Assistant");

         // Invoke toString of Person, Student, Employee, Faculty and Staff.
         System.out.println(person.toString());
         System.out.println(student.toString());
         System.out.println(employee.toString());
         System.out.println(faculty.toString());
         System.out.println(staff.toString());

     }

 }