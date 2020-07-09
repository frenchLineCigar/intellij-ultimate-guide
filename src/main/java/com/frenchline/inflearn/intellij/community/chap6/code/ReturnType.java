package com.frenchline.inflearn.intellij.community.chap6.code;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

/**
 * 타입 일괄 변경 : Shift + Ctrl + F6
 * String -> Integer로 일괄 변경 예
 */
public class ReturnType {
    public void print() {
        Integer num = calculate();
        System.out.println(num);
    }

    private Integer calculate() { return 1; }
}
