package pkgThread;

import static java.lang.Thread.sleep;

public class InterfaceThread {
    public static void main(String[] args){
        A1 a = new A1();
        B1 b = new B1();

        Thread ta = new Thread(a);
        ta.start();
        Thread tb = new Thread(b);
        tb.start();

        Thread t = new Thread(new Runnable(){
            public void run(){
                for(int i=0; i<10; i++){
                    try{
                        sleep(1000);
                    } catch(InterruptedException e){
                        System.out.println(e);
                    }
                    System.out.println("Inner Thread");
                }
            }
        });

        t.start();
        
    }
}


class A1 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("A");
        }
    }
}


class B1 implements Runnable{
    public void run(){
        for(int i=0; i<10; i++){
            try{
                sleep(1000);
            } catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println("B");
        }
    }
}
