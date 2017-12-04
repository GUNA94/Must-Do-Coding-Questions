public class SubarraySum {
    public static void main(String args[]) {
        int arr[]={1,2,3,7,5};
        int sum=12;
        int csum=0,start=0,end=0;
        for(int i=0;i<arr.length;){
            if(csum>sum){
                csum-=arr[start];
                start++;
            }
            else if(csum==sum){
                end=i;
                break;
            }else{
            csum+=arr[i];
            i++;
            }
            System.out.println(csum);
        }
        System.out.println(start+1+" "+end);
    }
}
