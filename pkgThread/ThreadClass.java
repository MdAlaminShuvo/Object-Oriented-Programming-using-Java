package pkgThread;

public class ThreadClass {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
 
        a.start();
        b.start();
    }
}


class A extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("A_m1");
        }
    }
}


class B extends Thread{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("B_m2");
        }
    }
}
