package org.example.e136;

public class E136AccessModifiers {

    private void privateMethod() {
        System.out.println("This is Private Method");
    }
    void defaultMethod() {
        System.out.println("This is Default Method");
    }
    protected void protectedMethod() {
        System.out.println("This is Protected Method");
    }
    public void publicMethod() {
        System.out.println("This is Public Method");
    }
    public static void main(String[] args) {
        E136AccessModifiers test=new E136AccessModifiers();

        test.privateMethod();
        test.defaultMethod();
        test.protectedMethod();
        test.publicMethod();

    }
}


