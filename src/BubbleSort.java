import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int n, i, j, t;
        boolean noSwap;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter elements in array");
        for (i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for(i=n;i>0;i--) {
            noSwap= true;
            for (j = 0; j < (i-1); j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    noSwap = false;
                }
            }
            if(noSwap) break;
        }
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
