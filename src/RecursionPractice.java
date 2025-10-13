public class RecursionPractice {
    public static void main(String[] args) {
        int[] arr = {5, 10, 23, 43, 22, 10, 54, 25, 23, 25, 30, 31};
        System.out.println(lastOccr(arr, 0, 10));
    }

    static int lastOccr(int[] arr, int idx, int data) {
        if(idx == arr.length) {
            return -1;
        }

        int liisa = lastOccr(arr, idx+1, data);
        if (liisa == -1) {
            if(arr[idx] == data) {
                return idx;
            } else {
                return -1;
            }
        } else {
            return liisa;
        }
    }
}