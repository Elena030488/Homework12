public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Book theLordOfTheRings = new Book ("The Lord of the Rings", tolkien, 1954);
        Author rowling = new Author("J.K.", "Rowling");
        Book harryPotter = new Book("Harry Potter and the Sorcerer's Stone", rowling, 1997);
        System.out.println("theLordOfTheRings.bookName = " + theLordOfTheRings.getBookName());
        System.out.println("theLordOfTheRings.author = " + theLordOfTheRings.getAuthor().getAuthorFirstName() + " " + theLordOfTheRings.getAuthor().getAuthorLastName());
        System.out.println("theLordOfTheRings.bookYear = " + theLordOfTheRings.getBookYear());
        System.out.println("harryPotter.bookName = " + harryPotter.getBookName());
        System.out.println("harryPotter.author = " + harryPotter.getAuthor().getAuthorFirstName() + " " + harryPotter.getAuthor().getAuthorLastName());
        System.out.println("harryPotter.bookYear = " + harryPotter.getBookYear());
        theLordOfTheRings.setBookYear(1955);
        System.out.println("theLordOfTheRings.bookYear = " + theLordOfTheRings.getBookYear());
    }
}
