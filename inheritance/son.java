package inheritance;

public class son extends father{
    public void add(){
        this.c = this.a * this.b;
        System.out.println("The sum of a and b is: " + this.c);
    }
}
