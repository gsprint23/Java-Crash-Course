public class MyClassTester {
    public static void main(String[] args) {
        // don't need an object to access static (class-level) member
        System.out.println("staticCounter: " + MyClass.staticCounter);

        MyClass object1 = new MyClass();
        MyClass object2 = new MyClass();
        // can use object to access static member
        object1.staticCounter++;
        System.out.println("staticCounter: " + MyClass.staticCounter);
        object2.staticCounter++;
        System.out.println("staticCounter: " + MyClass.staticCounter);

        // need object to access non-static (instance-level) member
        System.out.println("object1's instanceCounter: " + object1.instanceCounter);
        object1.instanceCounter++;
        System.out.println("object1's instanceCounter: " + object1.instanceCounter);

        // object2 has its own instanceCounter
        System.out.println("object2's instanceCounter: " + object2.instanceCounter);
        object2.instanceCounter++;
        System.out.println("object2's instanceCounter: " + object2.instanceCounter);

        MyClass.staticMethod(); // note the italics
        object1.instanceMethod();
        object2.instanceMethod();
    }
}
