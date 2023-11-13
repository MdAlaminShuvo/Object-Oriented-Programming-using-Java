package JavaDemo;

/**
 * InnerNewClass
 */
interface InnerNewClass {

    void print();
}

public class NewClass implements InnerNewClass{
    public void print(){
        System.out.println("Hello World!");
    }
}
