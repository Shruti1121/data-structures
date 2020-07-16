import java.util.Scanner;

public class QuickSort {
    public static int Pivot(int []a,int s, int e )
    {
        int t,i;
        int pivot= a[s];
        int swapIndex= s;
        for(i=s+1;i<a.length;i++)
        {
            if(pivot> a[i])
            {
                swapIndex++;
                if(swapIndex!=i) {
                     t = a[swapIndex];
                    a[swapIndex] = a[i];
                    a[i] = t;
                }
            }
        }
        int x= a[s];
        a[s]= a[swapIndex];
        a[swapIndex]= x;
        return swapIndex;
    }
    public static void Sort(int []a, int s, int e)
    {
        if(s<e)
        {
            int index= Pivot(a,s,e);
            Sort(a,s,index-1);
            Sort(a,index+1,e);

        };
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
        QuickSort ob= new QuickSort();
        Sort(a,0,a.length-1);
        for (i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
