package com.frenchline.inflearn.intellij.community.chap2.editor;

/**
 * Created by frenchline707@gmail.com on 2020-07-06
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class FocusEditor {
    public void focus() {
        String s = "안녕하세요. 반갑습니다. IntelliJ IDEA Ultimate 2020 Version";
        //Ctrl 을 누르고 이동하면 단어 별로 이동, Shift 추가 시 그만큼 선택
        //Fn 을 누르고 이동하면 단어 맨처음, 맨끝으로 이동(상/하/좌/우), Shift 추가 시 그 줄 전체 선택
        System.out.println(s);
    }

    /**
     * Page
     */
    public void page() {
        System.out.println("간격을 넓히기 위한 코드1");
        System.out.println("간격을 넓히기 위한 코드2");
    }

    public void page2() {
        System.out.println("간격을 넓히기 위한 코드1");
        System.out.println("간격을 넓히기 위한 코드2");
    }

    public void page3() {
        System.out.println("간격을 넓히기 위한 코드1");
        System.out.println("간격을 넓히기 위한 코드2");
    }




}
