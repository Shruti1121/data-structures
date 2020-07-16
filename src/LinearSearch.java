import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        int i,s,n,c=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array");
        n= sc.nextInt();
        int [] a= new int[n];
        System.out.println("Enter elements in array");
        for(i=0;i<n;i++)
            a[i]= sc.nextInt();
        System.out.println("Enter number to be searched");
        s= sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i] == s)
            {
                System.out.println("Number Found");
                break;
            }
            c++;
        }
        if(c== n)
        System.out.println("NUMBER NOT FOUND");
    }
}
