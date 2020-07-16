import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int i,s,n,l,r,mid;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n= sc.nextInt();
        l=0;
        r=n-1;
        int [] a= new int[n];
        System.out.println("Enter sorted array");
        for(i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println("Enter number to be searched");
        s= sc.nextInt();
        while(l<=r)
        {
            mid= (l+r)/2;
            if(a[mid]== s)
            {
                System.out.println("NUMBER FOUND");
                break;
            }
            else if(a[mid]> s)
                r= mid-1;
            else
                l= mid+1;

        }
        if(l>r)
            System.out.println("NUMBER NOT FOUND");
    }
}
