package opject.clas.oop;

public class Program {
    public static void main(String[] args) {
        Student st;
        st = new Student();
        Student st2 = new Student("quyet dc","quyet@email.com");
        System.out.println("Object");
        st.hello();
        st2.hello();
    }
}
