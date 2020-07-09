package com.frenchline.inflearn.intellij.community.chap6.extract;

/**
 * Created by frenchline707@gmail.com on 2020-07-07
 * Blog : http://frenchline707.tistory.com
 * Github : http://github.com/frenchLineCigar
 */

import com.frenchline.inflearn.intellij.community.chap6.code.Team;

/**
 * 내부 클래스(Inner Class) :
 * 하나의 클래스 안에 그 클래스 안에서만 사용하도록 보통 이너 클래스를 만든다
 * 아래 코드를 보면, InnerClass 라는 클래스 안에 Team 이라는 정적 클래스(Static Class)가 있다
 *
 */
public class InnerClass {

    public void moveInnerClass() { //새로운 Team을 하나 생성해서, 그것을 출력하는 기능
        Team team = new Team("개발팀", "develop");
        System.out.println(team.getCode());
    }

    // 이너 클래스 Team
//    public static class Team {
//        private String name;
//        private String code;
//
//        public Team(String name, String code) {
//            this.name = name;
//            this.code = code;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public String getCode() {
//            return code;
//        }
//    }


}
