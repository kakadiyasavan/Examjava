public class pro1 {

    public static void main(String[] args) {

        book dp = new book();
        dp.book("5", "The Light");
        pen sk = new pen();
        sk.pen(512);

    }
}

class book {

    public void book(String book_id, String title) {
        System.out.println("Book ID : " + book_id);
        System.out.println("Book Title : " + title);
    }

}

class pen extends book {

    public void pen(int Book_page) {
        System.out.println("Book Page : " + Book_page);
    }

}
