package ch07.professorsExample;


public class Util {
    public static void selectionSort(int[] values) {
        for(int i = 0; i < values.length; i++) {
            int minIdx = i;
            for(int j = i + 1; j < values.length; j++) {
                // 현재까지 찾은 최소값(values[minIdx])과
                // values[j]를 비교해서 values[j]가 더 작으면
                // minIdx 를 j로 설정 : minIdx = j
                if(values[minIdx] > values[i]) {
                    minIdx = j;
                }
            }
            swap(i, minIdx, values);
            // minIdx 값과 i 값을 교환
        }
    }

    private static void swap(int idx1, int idx2, int[] values) {
        for(int i = idx1; i < idx2; i++) {
            System.out.println(values);
        }
    }
}
