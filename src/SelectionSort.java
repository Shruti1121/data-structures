import java.util.Scanner;

public class SelectionSort {
        public static void main(String[] args) {
        int n,i,j,k,t,kin;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++)
            a[i]= sc.nextInt();
        for(i=0;i<n;i++)
        {
            k=a[i];
            kin = i;
            for(j=i; j<n ; j++)
            {
                if(a[j]< k) {
                    k = a[j];
                    kin= j;
                }
            }
            t= a[i];
            a[i]= k;
            a[kin]= t;

        }
        for(i=0;i<n;i++)
            System.out.println(a[i]);
    }
}
