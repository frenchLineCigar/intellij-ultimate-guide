package com.frenchline.inflearn.intellij.community.chap6.code;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

/**
 * 이름 일괄 변경 : Shift + F6
 * 인텔리제이에서는 변수/메소드를 일괄적으로 변경하는 기능을 지원
 * 클래스,메소드,필드,파라미터,변수 모두에게 통용된다
 */

public class Rename {

    public void rename() {
        String name = "a";

        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }

        System.out.println("변수값: " + name);
    }
}
