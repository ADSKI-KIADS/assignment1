class Main {
    public static void main(String[] args) {
        //TAsk 1 - Rectangle

        Rectangle r = new Rectangle();
        r.setWidth(10);
        r.setHeight(10);
        System.out.println(r.area());
        System.out.println(r.perimeter());
        System.out.print(r.toString());

        Rectangle r1 = new Rectangle();
        r1.setWidth(8);
        r1.setHeight(5);
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
        System.out.print(r1.toString());

        // Task 2 - class Book

        Book b = new Book();
        b.setYear(1600);
        b.setAuthor("Shokan");
        b.setTitle("Book");
        System.out.print(b.toString());

        // TAsk 3
        LibraryApp app = new LibraryApp();
        app.run();
    }
}




