import java.util.ArrayList;
import java.util.List;

public class QuickSort {

        public static void quickSort(int[] array, int start, int end){
            if(start>=end) return;

            int p = partition(array, start, end);

            quickSort(array, start, p-1);
            quickSort(array, p+1, end);

        }

        public static int partition(int[] array, int start, int end){
            int pivot = array[end];
            int p = start;

            for(int i=start; i<=end-1; i++){
                if(array[i]<=pivot){
                    int temp = array[i];
                    array[i] = array[p];
                    array[p] = temp;
                    p++;
                }
            }
            int temp = array[p];
            array[p] = array[end];
            array[end] = temp;
            return p;
        }

}
