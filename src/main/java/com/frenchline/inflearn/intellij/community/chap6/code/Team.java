package com.frenchline.inflearn.intellij.community.chap6.code;

/**
 * moveInnerClass 메서드의 기능이 변경되거나 혹은 QA 과정에서
 * Team 이라는 클래스가 InnnerClass 안에만 있으면 안되고 밖으로 여러 곳에서 사용되야하는 클래스가 될 경우
 * : 이때, Team 이라는 이너 클래스를 밖으로 뽑아내보자! 새롭게 안 만들어도 된다
 * 패키지가 다를 경우 임포트까지 자동으로 지원이 된다
 *
 * 이너 클래스로 만들어 놓은 애를 공용으로 써야하는 상황!
 * 혹은 기획이 변경되서 밖으로 빼야되는 상황에서
 * 기존에는 하나의 클래스를 새로 만들어서 거기에 코드를 붙여넣고 임포트문 다시 입력하고
 * 기존의 코드가 잘 돌아가는지 다시한번 테스트 해야되는데, 인텔리제이에 있는 move라는 기능을 이용해서
 * 이너 클래스를 밖으로 추출하거나(하나의 외부 클래스로) 또는 다른 클래스의 이너 클래스로 변경할 수 있다.
 *
 * 단축키 : F6
 */

public class Team {
    private String name;
    private String code;

    public Team(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
