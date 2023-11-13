package SetterGetter;

public class SetterGetter {
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        System.out.println(nc.getName());
        nc.setName("Jahid");
        System.out.println(nc.getName());
        System.out.println(nc.getName());
    }
}
