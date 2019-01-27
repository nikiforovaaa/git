package Rpis61.Nikiforova.wdad.learn.xml;

public class TestXmlTask {
    public static void main(String[] args) {
        XmlTask task = new XmlTask();
        Book book = new Book();
        book.setAuthorFirstName("Aleksandr");
        book.setAuthorSecondName("Pushkin");
        book.setGenre(Genre.EPOPEE);
        book.setName("ttt");
        book.setPrintYear(1999);
        book.setTakeDate("05.01.2018");

        XmlTask.getReaders().forEach(System.out::println);
    }
}