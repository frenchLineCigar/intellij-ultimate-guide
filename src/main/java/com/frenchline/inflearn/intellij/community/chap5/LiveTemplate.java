package com.frenchline.inflearn.intellij.community.chap5;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class LiveTemplate {
    // psvm, sout 같이 지정된 코드를 자동으로 만들어주는 축약어를 보통 라이브템플릿이라고 부름
    // 라이브템플릿 목록 보기 : ctrl + j
    public static void main(String[] args) {
        System.out.println();
        String a = "a";

        if (a == null) { //ifn
        }

        if (a != null) { //inn
        }

        for (String arg : args) { //iter : forin
        }

        for (int i = 0; i < args.length; i++) { //itar
            String arg = args[i];
        }

    }
}
