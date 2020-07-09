package com.frenchline.inflearn.intellij.community.chap4;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public interface Parent {

    // Parent는 인터페이스이고, 3개의 추상 메서드를 갖고 있음

    void buy(Long amount);
    void drive(String name);
    boolean isWishList(String item);

    // 오버라이드 자동완성 기능

}
