package inheritance;

public class father {
    public int a = 10;
    public int b = 20;
    public int c;

    public void add(){
        this.c = this.a + this.b;
        System.out.println("The sum of a and b is: " + this.c);
    }
}
