package com.frenchline.inflearn.intellij.community.chap1.view;

/**
 * Created by frenchline707@gmail.com on 2020-07-06
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class EmailSender {
    private Long id;
    private String name;
    private String email;

    public EmailSender(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public static void receive(String from, String to) {
        System.out.println(from+"님으로부터 "+ to +"님이 메일을 받았습니다.");
    }

    public void send(String to) {
        System.out.println(this.email + "님이 "+ to +"님에게 메일을 보냅니다.");
    }

    public String getEmail() {
        return email;
    }
}
