package ch12_inheritance.books;
//EBook 클래스에서
//EBook 클래스는 Book을 상속받도록 처리
//자식 고유의 필드로 private double fileSize / String format
public class EBook extends Book {
    private double fileSize;
    private String format;

    public EBook(String title, String author, double fileSize, String format) {
        super(title, author);
        this.fileSize = fileSize;
        this.format = format;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("파일의 크기 : " + fileSize);
        System.out.println("파일의 종류 : " + format);
    }
}
