import java.util.Scanner;

public class MergeSort {
    public static void Merge(int []arr, int[] a, int [] b)
    {
        int i=0, j=0,k=0;
        while(i<a.length && j<b.length)
        {
            if(a[i]< b[j])
            {
                arr[k]= a[i];
                i++;
                k++;
            }
            else
            {
                arr[k]= b[j];
                k++;
                j++;
            }
        }
        while(i<a.length)
        {
            arr[k]= a[i];
            k++;
            i++;
        }
        while(j<b.length)
        {
            arr[k]= b[j];
            k++;
            j++;
        }
    }
    static void Ms(int [] arr)
    {
        int n= arr.length;
        if(n<2)
        return;
            int mid= n/2;
            int []l= new int[mid];
            int []r= new int[n-mid];
            for(int i=0;i<mid;i++) {
                l[i]=arr[i];
            }
            for(int i=mid;i<n;i++)
                r[i-mid]=arr[i];
            Ms(l);
            Ms(r);
            Merge(arr,l,r);
    }
    static void printArray(int []arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        int i,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++) {
            a[i]= sc.nextInt();
        }
        MergeSort ob= new MergeSort();
        ob.Ms(a);
        printArray(a);
    }
}
