import java.util.Scanner;
import java.util.*;

public class Login {
    public static Student tempStudent;
    public static ArrayList<Student> studentList;
    public static boolean isloggedIn=false;
    public static void loginStudent(ArrayList<Student> students){
        Scanner sc = new Scanner(System.in);
        studentList=students;
        String name,password;
        System.out.println("____________________________");
        System.out.println("***LOGIN***");
        System.out.println("____________________________");

        try{
            System.out.println("Enter Student Name:");
            name=sc.nextLine();
            System.out.println("Enter Student paswword:");
            password=sc.nextLine();
            boolean isStudent=false;
            for(Student s:students){
                isStudent=true;
                if(name.equals(s.getStudentName())){
                    if(password.equals(s.getStudentPassword())){
                        tempStudent=s;
                        isloggedIn=true;
                        System.out.println("### Logged in Successfully");
                        System.out.println("@@@ Hello "+s.getStudentName());
                        display();
                        break;
                    }else{
                        System.out.println("wrong password");
                    }
                }
            }
            if(!isStudent){
                System.out.println("Student does not exist");

            }
        }
        catch(Exception e){
            System.out.println("Login failed");
            System.out.println(e);
        } 
    }
    public static void display(){
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
            System.out.println("1.view Profile");
            System.out.println("2.Logout");
            int a=sc.nextInt();
            switch(a){
                case 1:
                  if(isloggedIn){
                    tempStudent.displayStudentDetails();
                  }
                  else{
                    System.out.println("Login First----->");
                    loginStudent(studentList);
                  }
                  break;
                case 2:
                  isloggedIn=false;
                  System.out.println("logged out sucessefully");
                  return;
                default:
                  System.out.println("default Main menu");
                  run=false;
                  break;
            }
        } 
    }
}
