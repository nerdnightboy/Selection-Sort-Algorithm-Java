/**
 * selcetionSort
 */
public class selcetionSort {
    static void selectionSort(int [] a){
        int n = a.length;

        for (int i = 0; i < n-1; i++) {
            int min_idx = i;
            for (int j = i+1; j < n; j++) {
                if(a[j] < a[min_idx]){
                    min_idx = j;
                }
            }
            int temp = a[i];
            a[i] = a[min_idx];
            a[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int [] a = {7,8,6,5,4,3};
        for (int i : a) {
            System.out.print(i + " ");
        }System.out.println("");
        selectionSort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}