package ref;

public class VarChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        // 클래스 복사는 참조값(=주소값) 복사
        // 위치 값을 통해 같은 값(메모리)에 접근하기 때문에 하나만 바꿔도 둘 다 바뀜
        // dataA, dataB 는 위치를 가지고 있는 껍데기일 뿐
        // 실제 인스턴스는 하나임! (new 로 생성은 한 번 했으니까)
        System.out.println("dataA 참조값= " + dataA);
        System.out.println("dataB 참조값= " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);
    }
}
