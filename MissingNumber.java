public class MissingNumber {
    public static void main(String args[]) {
        int a[] = {1,2,3,4,5,6,7,8,10};
        int x=0;
        for(int i=0;i<a.length;i++)
            x^=a[i];
        for(int i=1;i<=a.length+1;i++)
            x^=i;
        System.out.println(x);
    }
}
