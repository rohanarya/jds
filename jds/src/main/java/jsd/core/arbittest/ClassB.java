package jsd.core.arbittest;

public class ClassB extends ClassA {

    public void setVal(String obj) {
        System.out.println("In Class B");
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassA b = new ClassB();
        a.setVal("Rohan");
        b.setVal(new Object());
    }

}
