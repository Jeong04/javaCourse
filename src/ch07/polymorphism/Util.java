package ch07.polymorphism;


public class Util {

    public static void selectionSort(Comparable[] values) {
        for(int i = 0; i < values.length; i++) {
            int minIdx = i;
            for(int j = i + 1; j < values.length; j++) {
                // 현재까지 찾은 최소값(values[minIdx])과
                // values[j]를 비교해서 values[j]가 더 작으면
                // minIdx 를 j로 설정 : minIdx = j
                if(values[minIdx].compareTo(values[j]) > 0) {
                    minIdx = j;
                }
            }
            swap(i, minIdx, values);
            // minIdx 값과 i 값을 교환
        }
    }

    private static void swap(int idx1, int idx2, Comparable[] values) {
        for(int i = idx1; i < idx2; i++) {
            Comparable tmp = values[idx1];
            values[idx1] = values[idx2];
            values[idx2] = tmp;
        }
    }
}
