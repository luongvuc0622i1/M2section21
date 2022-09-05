package th_Singleton;

public class Client {
    public static void main(String[] args) {
        System.out.println("BEGIN TESTING SINGLETON PATTERN");

        BookBorrower phong = new BookBorrower();
        BookBorrower linh = new BookBorrower();

        phong.borrowBook();
        System.out.println("Phong asked to borrow the book");
        System.out.print("Phong: ");
        System.out.println(phong.getAuthorAndTitle());
        System.out.print("Linh: ");
        System.out.println(linh.getAuthorAndTitle());
        System.out.println();

        linh.borrowBook();
        System.out.println("Linh asked to borrow the book");
        System.out.print("Phong: ");
        System.out.println(phong.getAuthorAndTitle());
        System.out.print("Linh: ");
        System.out.println(linh.getAuthorAndTitle());
        System.out.println();

        phong.returnBook();
        System.out.println("Phong returned book");
        System.out.print("Phong: ");
        System.out.println(phong.getAuthorAndTitle());
        System.out.print("Linh: ");
        System.out.println(linh.getAuthorAndTitle());
        System.out.println();

        linh.borrowBook();
        System.out.println("Linh asked to borrow the book");
        System.out.print("Phong: ");
        System.out.println(phong.getAuthorAndTitle());
        System.out.print("Linh: ");
        System.out.println(linh.getAuthorAndTitle());
        System.out.println();

        System.out.println("END TESTING SINGLETON PATTERN");
    }
}
