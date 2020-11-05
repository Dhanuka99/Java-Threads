class A{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Class A "+i);
        }
    }
}
class B{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Class B "+i);
        }
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Start main");
        A a = new A();
        B b = new B();
        a.run();
        b.run();
        System.out.println("End main");
    }
}
