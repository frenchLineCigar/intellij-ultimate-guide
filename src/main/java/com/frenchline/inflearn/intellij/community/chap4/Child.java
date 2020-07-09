package com.frenchline.inflearn.intellij.community.chap4;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class Child implements Parent {
    // 구현해야하는 추상메서드들을 Parent에서 복붙하지 말고 ctrl + i

    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        return false;
    }
}
