//Dutch National Flag Algorithm, or 3-way Partitioning
public class Sort_0_1_2 {
    public static void main(String args[]) {
        int a[] = {1,2,0,1,1,0,0,2,1};
        int temp,pos_0=0,pos_1=0,pos_2=a.length-1;
        while(pos_1<pos_2){
            if(a[pos_1]==0){
                temp=a[pos_0];
                a[pos_0]=a[pos_1];
                a[pos_1]=temp;
                pos_0++;
                pos_1++;
            }else if(a[pos_1]==1){
                pos_1++;
            }else {
                temp=a[pos_1];
                a[pos_1]=a[pos_2];
                a[pos_2]=temp;
                pos_2--;
            }
        }
        for(int i:a)
            System.out.print(i+" ");
    }
}
