package com.example; // needs to be first line of non-comment java code

// imports go here

import com.sprint.gina.MyOtherClass;

public class Main {
    public static void main(String[] args) {
        // package: a grouping of related types (classes and interfaces)
        // java.lang (we get this imported free)
        // java.util
        // java.awt
        // etc.

        // why would you use package?
        // 1. project structure (folders/files)
        // packages are name in a convention such
        // that we use a reverse domain name
        // domain name: oracle.com gonzaga.com apple.com
        // developer.apple.com
        // reverse ... com.apple.developer
        // goes general to specific
        // 2. namespace management
        // 3. access control (package-private)

        System.out.println(String.class.getPackage().toString());
        System.out.println(Main.class.getPackage().toString());

        // task: make a package corresponding to
        // com.sprint.gina
        // one more class
        // print out package name from main() here
        System.out.println(MyOtherClass.class.getPackage().toString());

    }
}
