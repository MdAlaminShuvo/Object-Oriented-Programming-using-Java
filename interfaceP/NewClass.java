package interfaceP;

interface First{
    void FirstMethod();
}

interface Second{
    void SecondMethod();
}

interface Third{
    void ThirdMethod();
}


public class NewClass implements First, Second, Third{
    public void FirstMethod(){
        System.out.println("FirstMethod");
    }

    public void SecondMethod(){
        System.out.println("SecondMethod");
    }

    public void ThirdMethod(){
        System.out.println("ThirdMethod");
    }
}
