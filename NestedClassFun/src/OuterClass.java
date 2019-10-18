public class OuterClass {
    // fields
    static int staticField = 0; // static, class level... one staticField variable shared amongst
    // all instances of OuterClass
    int instanceField; // non-static, instance level.... each instance of OuterClass gets its own instanceField

    // constructor
    public OuterClass() {
        instanceField = 1;
        System.out.println("Hello from OuterClass constructor");
    }

    // 1. static nested class
    public static class StaticNestedClass {
        // nested classes are members of the enclosing class
        // static nested classes can access static members of the enclosing class
        // static nested classes ARE NOT ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS
        // no this reference for StaticNestedClass and no this reference for OuterClass

        // constructor
        public StaticNestedClass() {
            System.out.println("Hello from StaticNestedClass constructor");
            System.out.println(staticField);
        }
    }

    // 2. inner class
    public class InnerClass {
        // inner classes ARE ASSOCIATED WITH AN INSTANCE OF THE ENCLOSING CLASS
        // inner classes can access static and non-static members of the enclosing class

        // instance level field
        int instanceField;

        // constructor
        public InnerClass() {
            instanceField = 100;
            System.out.println("Hello from InnerClass constructor");
            System.out.println("staticField: " + staticField);
            System.out.println("instanceField: " + this.instanceField);
            // this refers to this instance of InnerClass
            // OuterClass.this refers to this instance of OuterClass that this instance
            // of InnerClass belongs to
            System.out.println("OuterClass' instanceField: " + OuterClass.this.instanceField);
        }
    }

    // 3. and 4. local classes
    // need a method
    public void instanceMethod() {
        final int localVar = 500;

        // 3. local class
        class LocalClass {
            // constructor
            public LocalClass() {
                System.out.println("Hello from LocalClass constructor");
                System.out.println("localVar: " + localVar);
                System.out.println("instanceField: " + instanceField);
            }
        }
        // instantiate a LocalClass object
        LocalClass localClass = new LocalClass();

        // local classes can access the local variables of the enclosing method
        // only if the local variables are final or "effectively final"

        // 4. anonymous class
        // we need the name of an interface to implement or a class to extend in order
        // to create an anonymous class
        // lets extend object
        Object myAnonymousClassObject = new Object() {
            // override methods

            @Override
            public String toString() {
                return "HELLO";
            }
        };

        System.out.println(myAnonymousClassObject);
    }
}
