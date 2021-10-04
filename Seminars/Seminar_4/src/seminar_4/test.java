package seminar_4;

// Classes
class Foo {
    private int i;

    public void f() { /* … */ }

    public void g() { /* … */ }
}

class Bar extends Foo {
    public int j;

    public void g() { /* … */ }
}


class Polymorphism2 {
    //    public static void main(String[] args) {
//        A ref1 = new C();
//        B ref2 = (B) ref1;
//        System.out.println(ref2.g());
//        Object o = new Object();
//        o.hashCode();
//        Boolean bbb;
//        boolean b1;
//        Number n;
//        Integer ii;
//        Byte bb;
//        Character car;
//        Double d;
//        Integer i = new Integer(-10);
//        Integer j = new Integer(-10);
//        Integer k = -10;
//        System.out.print((i==j) + "|");
//        System.out.print(i.equals(j) + "|");
//        System.out.print((i==k) + "|");
//        System.out.print(i.equals(k)); // Declarations:
//        Foo a = new Bar();
//        Bar b = new Bar();
//        b.f();
//
//    }public class MyClass {

//    public static void main(String[] args) {
//        A[] arrA;
//        B[] arrB;
//        arrA = new A[10];
//        arrB = new B[20];
//        arrA = arrB; 		// (1)
//        arrB = (B[]) arrA; 	// (2)
//        arrA = new A[10];
//        arrB = (B[]) arrA; 	// (3)
//
//    }
}

class MyClass {
    public static void main(String[] args) {
        Super x = null;
        Sub y = null;
        y = (Sub) x;
    }
}
class MySubclass extends MyClass {}
class A {
    A() {
        this("1", "2");
    }

    A(String s, String t) {
        this(s + t);
    }

    A(String s) {
        System.out.println(s);
    }
}
class Super {}
class Sub extends Super {}
    // Reference declarations:


class B extends A {
    B(String s) {
        System.out.println(s);
    }

    B(String s, String t) {
        this(t + s + "3");
    }

    B() {
        super("4");
    }
}