package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
         nameField = nameParameter;
        // 변수명이 달라서 this 붙이지 않아도 동일하게 작동

        // this.nameField = nameParameter;
        // 코딩 스타일로 멤버 변수에 접근할 땐 변수명이 달라도 this 를 붙이는 방식이 있었음
        // 권장하지 않음, 요즘 잘 쓰지 않음
        // this 써주지 않아도 IDE 가 색깔로 구분해주기 때문에 굳이 할 필요 없음
    }
}
