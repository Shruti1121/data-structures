import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++)
            a[i]= sc.nextInt();
        for(i=1;i<n;i++)
        {
            int cv= a[i];
            for(j=i-1;j>=0 && a[j]>cv;j--)
            {
                    a[j+1]= a[j];
            }
            a[j+1]= cv;
        }
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
