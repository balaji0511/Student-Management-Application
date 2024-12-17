import java.util.*;

public class Register {
    public static Student RegisterStudent(){
        Scanner sc = new Scanner(System.in);
        int studentCount=0;
        System.out.println("____________________________");
        System.out.println("***REGISTER***");
        System.out.println("____________________________");
        Student s = new Student();
        try{
            s.setStudentId(++studentCount);
            try{
            System.out.println("Enter Student Name:");
            s.setStudentName(sc.nextLine());
            }catch(InputMismatchException e){
                System.out.println("please enter the name in correct format");
            }
            System.out.println("Enter Student roll:");
            s.setStudentRoll(sc.nextLine());
            System.out.println("Enter Student Stream:");
            s.setStream(sc.nextLine());
            System.out.println("Enter Student Email Id:");
            s.setStudentEmailId(sc.nextLine());
            s.setStudentPassword(s.getStudentEmailId());
            System.out.println("Enter Student Mobile:");
            s.setStudentMobileNum(sc.nextLong());
            // sc.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
        return s;
    }
}
