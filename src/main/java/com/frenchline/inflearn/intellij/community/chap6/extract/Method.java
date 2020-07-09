package com.frenchline.inflearn.intellij.community.chap6.extract;

import java.util.List;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

/**
 * 코드 리팩토링
 * : 코드를 리팩토링 하는 과정에서 보통 좋은 코드라고 하면
 * '하나의 메서드가 하나의 기능을 가진다.' 이야기를 한다.
 * 하나의 메서드가 하나의 기능만 하도록 뽑아낸다면 우리가 원하는 좋은 코드에 좀 더 가깝게 만들 수 있다
 * 사용 단축키 :
 * Ctrl + Alt + M (Method)
 */

public class Method {

//    public void extractMethod(List<Book>books) {
//        for (Book book : books) {
//            for (String s : book.getAuthors()) {
//                if("frenchline".equals(s)) {
//                    System.out.println("담당자가 맞습니다.");
//                }
//            }
//        }
//    }

    public void extractMethod(List<Book>books) { //Books라는 클래스의 리스트를 순회하는 기능
        for (Book book : books) {
            loopAuthors(book);
        }
    }

    private void loopAuthors(Book book) { // book이라는 인스턴스 안에 있는 작성자 리스트를 for문으로 계속 돌리는 기능
        for (String s : book.getAuthors()) {
            print(s);
        }
    }

    private void print(String s) { // 받은 문자열이 frenchline이면 println을 하는 프린트 기능
        if("frenchline".equals(s)) {
            System.out.println("담당자가 맞습니다.");
        }
    }


    // 이너 클래스 Book
    public static class Book {
        private String title;
        private long price;
        private List<String> authors;

        public String getTitle() {
            return title;
        }

        public long getPrice() {
            return price;
        }

        public List<String> getAuthors() {
            return authors;
        }
    }
}
