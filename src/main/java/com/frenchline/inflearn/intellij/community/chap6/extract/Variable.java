package com.frenchline.inflearn.intellij.community.chap6.extract;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

public class Variable {

    public void extractVariable() { //변수 뽑아내기, 변수 추출
        String message = String.format("%d + %d = %d", 1, 2, 1 + 2);
        System.out.println(message);
        System.out.println(String.format("%d + %d = %d", 1, 2, 1 + 2));

//        String.format() : 하나의 문자열을 만드는 코드
//        같은 코드가 대량으로 반복되는 경우, 변수를 생성하고 추가/변경이 필요하면 변수만 변경하도록 수정
//        ctrl+w로 원하는 포커스 블록지정 후 ctrl alt v로 변경 범위 및 변수 선언
    }

}

