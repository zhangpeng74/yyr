public class A {
    C c = new C();

    A() {
        this("A");
        System.out.println("A");
    }

    A(String s) {
        System.out.println(s);
    }
}
