package opject.clas.oop;

public class Student {
    private String fullName;
    private String email;
    private String address;
    public Student(){

    }
    public Student(String fullName,String email){
        this.fullName = fullName;
        this.email = email;
    }
    public Student(String fullName, String email, String address) {
        this.fullName = fullName;
        this.email = email;
        this.address = address;
    }

//    phuong thuc get/set
    public String getFullName(){
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //    hanh vi cua oop(method)
    public  void hello(){
        System.out.println("say heo lo");
    }
    public static void test(){
        System.out.println("static");
    }
}
