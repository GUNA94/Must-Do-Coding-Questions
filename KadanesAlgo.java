public class KadanesAlgo {
    public static void main(String args[]) {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int max=a[0];
        int curr_max=a[0];
        for(int i=1;i<a.length;i++){
            curr_max=Math.max(a[i],curr_max+a[i]);
            max=Math.max(max,curr_max);
        }
        System.out.println(max);
    }
}
