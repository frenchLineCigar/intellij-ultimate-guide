package com.frenchline.inflearn.intellij.community.chap2.special;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by frenchline707@gmail.com on 2020-07-06
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class FocusCopy {

    public void copyFocus() {
        List<String> members = new ArrayList<>();

        //Clone Caret Above/Below : ctrl + ctrl(누른 상태로) + 위/아래
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
    }
}
