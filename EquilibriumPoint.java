public class EquilibriumPoint {
    public static void main(String args[]) {
        int a[] = {1,3,5,2,2};
        int rightsum=0,leftsum=0,point=-1;
        for(int i:a)
            rightsum+=i;
        for(int i=0;i<a.length;i++){
            rightsum-=a[i];
            if(leftsum==rightsum){
                point=i;
                break;
            }
            leftsum+=a[i];
        }
        System.out.println(point);
    }
}
