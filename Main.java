import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Student> studentList=new ArrayList<Student>();
        System.out.println("---------------Welcome to Student portal---------------");
        // int totalStudents=0;
        boolean run=true;
        while(run){
          System.out.println("Please select the option");
          System.out.println("1.Register");
          System.out.println("2.Login");
          System.out.println("3.Show Students");
          System.out.println("4.exit");
          System.out.println("");
          System.out.println("Enter the option:");
          int userInput=input.nextInt();
          System.out.println("--------------------------");
        switch(userInput){
            case 1:
              try{
                Student s= Register.RegisterStudent();
                studentList.add(s);
                System.out.println("### Student Registered");
                System.out.println("--------------------------");
                // totalStudents++;
              }
              catch(Exception e){
                System.out.println("### An error occured");
                System.out.println("--------------------------");
              }
              break;
            case 2:
              Login.loginStudent(studentList);
              System.out.println("--------------------------");
              break;
            case 3:
              System.out.println(studentList.toString());
              System.out.println("--------------------------");
              break;
            case 4:
              run=false;
              System.out.println("### Exited from the Application");
              System.out.println("____________________________");
              break;
            default:
              System.out.println("exit default");
        }
       }
       input.close();
    }
    public static void createStudent(){
        // Student s1=new Student(101, "Balaji", "1A1", "CSM", 9550690852l, "balajita@gmail.com","pswd");
        // System.out.println(s1);
    }
}