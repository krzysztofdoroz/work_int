package partition;

/**
 *
 * @author krzysztof
 */
public class PartitionProc {


    // running time: T(N) = T(N/2) + O(N)
    static int kselect(int a[], int l, int r, int k){

        int i = l;
        int tmp;
        // a[l] is the partition element
        for(int j = l + 1; j < r; j++){
                if(a[j] < a[l]){
                    i++;
                    tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
        }

        tmp = a[i];
        a[i] = a[l];
        a[l] = tmp;

        if(k == i){
            return a[k];
        } else if(k > i){
            System.out.println("invoking:" + i + " " + r + " " + k);
            return kselect(a, i + 1, r, k);
        } else {
            return kselect(a, l, i, k);
        }

    }

    
    public static void main(String[] args) {

        int[] arr = new int[5];

        arr[0] = 2;
        arr[1] = 23;
        arr[2] = 1;
        arr[3] = 45;
        arr[4] = 5;

        System.out.println(kselect(arr, 0, 5, 2));

        for(int a : arr){
            System.out.print(a  + " ");
        }

        // TODO code application logic here
    }

}
