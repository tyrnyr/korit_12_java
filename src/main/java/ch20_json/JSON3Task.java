package ch20_json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@AllArgsConstructor
@Data
class Book {
    private Long bookID;
    private String title;
    private String author;
    private List<String> categories;// = new ArrayList<>();
}

public class JSON3Task {
    public static void main(String[] args) {
//        Book book1 = new Book(101L, "자바 마스터","안작가", Arrays.asList("프로그래밍", "컴퓨터공학"));
//        Book book2 = new Book(102L, "파이썬 입문","김철수", Arrays.asList("데이터분석"));
        Book book1 = new Book(101L, "자바 마스터","안작가", List.of("프로그래밍", "컴퓨터공학"));
        Book book2 = new Book(102L, "파이썬 입문","김철수", List.of("데이터분석"));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String book1Data = gson.toJson(book1);
        System.out.println(book1Data);
        // Map으로 변경
        Map<String, Objects> book1Map = gson.fromJson(book1Data, Map.class);
        System.out.println(book1Map);
        System.out.println("도서 제목 : " + book1Map.get("title"));

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        String bookData = gson.toJson(bookList);
        System.out.println(bookData);
    }
}
