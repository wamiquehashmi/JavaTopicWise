public class RecursionPractice {
    public static void main(String[] args) {
        int[] arr = {5, 10, 23, 43, 22, 10, 54, 25, 23, 25, 30, 31};
        System.out.println(lastOccr(arr, 0, 10));
        allIndices(arr, 10, 0, 0);
    }

    // using this method to get the last occurrence of the an element in array
    public static int lastOccr(int[] arr, int idx, int data) {
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

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }
        if (arr[idx] == x) {
            int[] iarr = allIndices(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = allIndices(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}