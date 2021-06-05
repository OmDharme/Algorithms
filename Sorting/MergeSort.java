public class MergeSort {

    public static void mergeSort(int[] array){
        int n = array.length;
        if(n<2) return;
        int mid = n/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n-mid];

        for(int i=0; i<mid; i++){
            leftArray[i] = array[i];
        }
        for(int i=mid; i<n; i++){
            rightArray[i-mid] = array[i];
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    public static void merge(int[] leftArray, int[] rightArray, int[] array){
        int nl = leftArray.length;
        int nr = rightArray.length;
        int k = 0;
        int i = 0;
        int j = 0;

        while(i<nl && j<nr){
            if(leftArray[i]<=rightArray[j]){
                array[k] = leftArray[i];
                i++;
            }else{
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while(i<nl){
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while(j<nr){
            array[k] = rightArray[j];
            j++;
            k++;
        }

    }

}
