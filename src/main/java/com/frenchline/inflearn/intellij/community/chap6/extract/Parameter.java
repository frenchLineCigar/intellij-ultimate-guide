package com.frenchline.inflearn.intellij.community.chap6.extract;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

/**
 * 변수 추출하기
 * Ctrl + Alt + V(Variable)
 */

public class Parameter {
    public void extractParameter() {
        extractParameter(10);
    }

    public void extractParameter(int num) {
        System.out.println(num);
        System.out.println(num);
    }
}

//  10이라는 숫자가 하드코딩이 되어있는데, 이 숫자가 extractParameter의 Parameter로 넘어와야 되는 상황
//  기존의 메소드는 유지한채, 파라미터가 갯수가 다른 오버로딩 메서드를 새롭게 생성할 수 있다
