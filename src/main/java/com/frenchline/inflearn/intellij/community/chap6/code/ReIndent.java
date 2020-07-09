package com.frenchline.inflearn.intellij.community.chap6.code;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

/**
 * 정렬 기능 : Ctrl + Alt + L (Lines)
 * 정렬되지 않은 코드를 일일히 정리할 필요없이 정렬기능을 이용해 일괄 정리
 */
public class ReIndent {
    public void rename() {
        String legacy = "a";
        for (int i = 0; i < 10; i++) {
            System.out.println(legacy);
        }
        System.out.println("한번더: " + legacy);
    }
}
