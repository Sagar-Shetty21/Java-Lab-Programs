
// 11. Java program with Multiple classes.

package program_11;

class DemoA {
    static void functionA() {
        System.out.println(" DemoA ---> functionA() ");
    }
}

class DemoB {
    static void functionB() {
        System.out.println(" DemoB ---> functionB() ");
    }
}

class DemoC {
    static void functionC() {
        System.out.println(" DemoC ---> functionC() ");
    }
}

public class Main {
    public static void main(String args[]) {
        DemoA.functionA();
        DemoB.functionB();
        DemoC.functionC();
    }
}