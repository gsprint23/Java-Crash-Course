// recall: an object is an instance of a class
public class MyClass {
    // one staticCounter variable, shared by all objects
    // note: cannot have static local variable in Java
    static int staticCounter = 0;
    // each object has its own instanceCounter
    int instanceCounter = 100;

    public static void staticMethod() {
        // can only access static members
        // NO THIS REFERENCE because don't need an object to invoke static method
        // <class name>.staticMethod(); if outside of class
        // staticMethod() if inside of class
        // OR
        // <object reference>.staticMethod();
        System.out.println("Hello from staticMethod()");
        System.out.println("staticCounter: " + staticCounter);
        System.out.println("Goodbye from staticMethod()");
    }

    public void instanceMethod() {
        // can access static and non-static members
        System.out.println("Hello from instanceMethod()");
        System.out.println("Calling staticMethod()");
        staticMethod();
        // has this reference because need an object to invoke
        // <object reference>.instanceMethod();
        // this refers to same object as <object reference> in calling code does
        System.out.println("instanceCounter: " + instanceCounter);
        System.out.println("Goodbye from instanceMethod()");
    }
}
