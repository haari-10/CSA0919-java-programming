class Parent {
    void print() {
        System.out.println("Parent class");
    }
}

class Subclass1 extends Parent {
    void print() {
        System.out.println("Subclass 1");
    }
}

class Subclass2 extends Parent {
    void print() {
        System.out.println("Subclass 2");
    }
}

public class test {
    public static void main(String args[]) {
        Parent a;

        a = new Subclass1();
        a.print();

        a = new Subclass2();
        a.print();
    }
}