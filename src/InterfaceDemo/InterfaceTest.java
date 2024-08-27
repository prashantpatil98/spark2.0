package InterfaceDemo;

interface  Demo
{
    void displays();
}

class Test implements Demo
{
    public void displays(){
        System.out.println("hello");
    }
}

public class InterfaceTest {

    public static void main(String[] args) {
        Test t = new Test();
        t.displays();
    }
}
