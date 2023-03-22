package ch06;

class SafeArray {
    private int a[];    // 같은 클래스에만 접근 가능
    public int length;  // 전체에서 접근 가능

    // 간접 접근을 통해 멤버 변수 값 할당하는 생성자
    public SafeArray(int size) {  // ex: 5
        a = new int[size];  // 0, 1, 2, 3, 4
        length = size;      // 배열 길이: 5
    }

    // index 가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 return -1.
    // 조건에 해당될 경우 해당 index 의 값 get.
    public int get(int index) {
        if (index >= 0 && index < length) {
            return a[index];
        }

        return -1; // return -1 : 오류가 있음을 뜻함
    }

    // index 가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 msg 출력.
    // 조건에 해당될 경우 해당 index 에 값 push.
    public void put(int index, int value) {
        if (index >= 0 && index < length) {
            a[index] = value;
        } else {
            System.out.println("잘못된 인덱스 " + index);
        }
    }
}

public class SafeArrayTest {
    public static void main(String[] args) {

        // instance 생성
        SafeArray array = new SafeArray(3);

        // index 가 0 이상이고 배열 길이보다 -1 작은 조건에 해당되지 않으면 msg 출력. 해당되면 각 인덱스에 index * 10한 값을 put method를 통해 push
        for (int i = 0; i < (array.length + 1); i++) {
            array.put(i, i * 10);
        }
    }
}
