package pkgAbstract;

abstract class NewClass {
    abstract void Demo();
}

class Help extends NewClass{
    void Demo() {
        System.out.println("This is my Abstract Demo");
    }
}
