package com.frenchline.inflearn.intellij.community.chap2.special;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Created by frenchline707@gmail.com on 2020-07-06
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class FocusHierarchy {

    public void increaseFocus() {

        System.out.println(Optional.of(new Member().getCourse())); //ctrl+w , shift+ctrl+w
        System.out.println(LocalDate.of(2020,5,14));

    }
}
