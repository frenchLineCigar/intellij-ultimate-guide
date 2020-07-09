package com.frenchline.inflearn.intellij.community.chap1.view;

/**
 * Created by frenchline707@gmail.com on 2020-07-06
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */
public class ViewDefinition {

    public void viewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "frenchline", "frenchline707@gmail.com");

        emailSender.send("test@gmail.com");

    }
}
