package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 기본형 복사는 각각 별개의 값
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("변경 a = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
