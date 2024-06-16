package access;

public class Speaker {
    private int volume;
    // private 접근 제어자는 모든 외부 호출을 막음
    // private 접근 제어자가 붙은 경우, 해당 클래스 내부에서만 호출 가능

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("음량을 10 감소합니다.");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}
