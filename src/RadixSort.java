import java.util.Scanner;

public class RadixSort {
    public static int getMax(int[]a, int n)
    {
        int i, g=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>g)
                g=a[i];
        }
        return g;
    }
    public static void CountSort(int []a, int n, int exp)
    {
        int []o= new int[n];
        int i;
        int []count= new int[10];
        for(i=0;i<n;i++)
        count[(a[i]/exp)%10]++;
        for(i=1;i<10;i++)
            count[i]+=count[i-1];
        for(i=n-1;i>=0;i--) {
            o[count[(a[i] / exp) % 10]-1]= a[i];
            count[(a[i] / exp) % 10]--;
        }
        for(i=0;i<n;i++)
            a[i]= o[i];
    }
    static void Sort(int []a, int n){
        int m = getMax(a,n);
        for(int exp=1; m/exp>0;exp*=10)
            CountSort(a,n,exp);
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
        Sort(a,n);
        for (i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
