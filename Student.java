public class Student {
    private int studentId;
    private String studentName;
    private String studentRoll;
    private String stream;
    private long studentMobileNum;
    private String studentEmailId;
    private String studentPassword;
    
    public void setStudentId(int id){
        this.studentId=id;
    }
    public void setStudentName(String name){
        this.studentName=name;
    }
    public void setStudentRoll(String roll){
        this.studentRoll=roll;
    }
    public void setStream(String stream){
        this.stream=stream;
    }
    public void setStudentMobileNum(long mobileNumber){
        this.studentMobileNum=mobileNumber;
    }
    public void setStudentEmailId(String emailId){
        this.studentEmailId=emailId;
    }
    public void setStudentPassword(String passwword){
        this.studentPassword=passwword;
    }
    public int getStudentId(){
        return studentId;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentRoll(){
        return studentRoll;
    }
    public String getStream(){
        return stream;
    }
    public long getStudentMobileNum(){
        return studentMobileNum;
    }
    public String getStudentEmailId(){
        return studentEmailId;
    }
    public String getStudentPassword(){
        return studentPassword;
    }
    public String toString(){
        return studentName;
    }
    public void displayStudentDetails(){
        System.out.println(studentName+"\n1"+studentRoll+"\n2"+studentEmailId+"\n3"+studentMobileNum);
    }
    public Student(int id,String name,String roll,String stream,long mobileNumber,String emailId,String password){
        this.studentId=id;
        this.studentName=name;
        this.studentRoll=roll;
        this.stream=stream;
        this.studentMobileNum=mobileNumber;
        this.studentEmailId=emailId;
        this.studentPassword=password;
    }
    public Student(){
        
    }
}

