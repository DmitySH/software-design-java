package HWsem4.HW;

class A {
    public A(int pubValue, int prValue) {
        this.pubValue = pubValue;
        this.prValue = prValue;
    }

    public void AClone() { // Кидает исключение, каждый объект клонируется по-своей логике.
        // Нужно реализовывать клон самому.
//        super.clone();
    }

    @Override
    public A clone() {
        return new A(this.pubValue, this.prValue);
    }

    public int pubValue;
    private int prValue;
}

class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        A a = new A(5, 10);
        A anotherA = a.clone();
    }


}