public class PublicationTester {
    public static void main(String[] args) {
        // make some Publication objects
//        Publication p1 = new Publication();
//        System.out.println(p1);
//        Publication p2 = new Publication("some title", "some publisher", 100, 9.99);
//        System.out.println(p2);

        Book b1 = new Book();
        System.out.println(b1);
        Book b2 = new Book("some author");
        System.out.println(b2.generateCopyright());
        Publication p1 = b2; // p1 is a reference to a book object, the same book object that b2 reference
        System.out.println(p1.generateCopyright());

        Magazine m1 = new Magazine();
        System.out.println(m1);

        // polymorphism: same code, different behavior
        Publication[] pubs = new Publication[4];
        pubs[0] = b1;
        pubs[1] = b2;
        pubs[2] = p1; // p1 refers to the same object as b2
        pubs[3] = m1;

        System.out.println();
        for (Publication p : pubs) {
            System.out.println(p.getClass() + " " + p.hashCode());
            System.out.println(p); // dynamic binding is going resolve to the actual object type
            System.out.println(p.generateCopyright());
            System.out.println("*************");
        }

        // BOOK OBJECT <- b1
        // ^
        // |
        // pubs[0]

        // BOOK   OBJECT <- b2
        // ^   ^       ^
        // |   |       |
        // p1  pubs[1] pubs[2]

        // MAGAZINE OBJECT <- m1
        // ^
        // |
        // pubs[3]




    }
}
