import sun.tools.jstat.Jstat;

public class ClassTester {
    public static void main(String[] args) {
        // NESTED CLASSES
        // a class thats defined inside the body of another class
        // outer class (AKA enclosing): this is a class that is not nested, but maybe
        // has a nested class as a member
        // outer class can be public or package-private

        // 4 types of nested classes
        // 1. static nested class
        // 2. non-static nested class (AKA inner class)
        // 3. local inner class (non-static nested class defined inside a method)
        // 4. anonymous class (local inner class without a name)

        // static field
        System.out.println(OuterClass.staticField);

        // non-static field (instance-level)
        OuterClass outerClass = new OuterClass();
        // instance field
        System.out.println(outerClass.instanceField);
        // play with staticField to prove there is only variable shared amongst all OuterClass objects

//        OuterClass outerClass2 = new OuterClass();
//        outerClass.staticField++;
//        System.out.println(outerClass.staticField);
//        outerClass2.staticField++;
//        System.out.println(outerClass2.staticField);
//        OuterClass.staticField++;
//        System.out.println(outerClass.staticField);
//        outerClass.instanceField++; // 1 + 1 = 2
//        System.out.println(outerClass.instanceField);
//        outerClass2.instanceField += 5; // 1 + 5 = 6
//        System.out.println(outerClass2.instanceField);
//        System.out.println(outerClass.instanceField + " " + outerClass2.instanceField);

        OuterClass.StaticNestedClass staticNestedClass = new OuterClass.StaticNestedClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        outerClass.instanceMethod();

    }
}
