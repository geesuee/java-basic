package ref;

public class NullMain3 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count); // 참조형은 null로 자동 초기화
        System.out.println("bigData.data = " + bigData.data);

        // NullPointerException 발생
        // bigData.data = null
        // bigData.data.value = null.value
        // null 에 접근했기 때문에 예외 발생
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
