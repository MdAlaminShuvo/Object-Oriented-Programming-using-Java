package pkgsuper;

public class SubClass extends SuperClass{
    // String s = "SubClass";
    // void print(){
    //     super.print();
    //     System.out.println("From SubClass");
    // }
    SubClass(){
        super();
        System.out.println("SubClass constructor");
    }

    public void Method(){
            System.out.println("SubClass Method");
    }
}
