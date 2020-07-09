package com.frenchline.inflearn.intellij.community.chap4;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class Student {

    private Long id;
    private String email;
    private String name;

    // generate getter, setter and constructor
    // generate : alt + insert (macOS : command + n)


    public Student() { //select none : 기본 생성자 생성
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
