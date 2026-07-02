// Find the sum of elements from index l=2 to index n=4 using Prefix Sum 
// arr = {2, 4, 1, 6, 3}

public class prefixsum {
    public static void main(String[] args) {
        int l=2;
        int n=4;
        int[] arr= {2, 4, 1, 6, 3};
        //          2, 6, 7, 13,16
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        if(l>=1){
            System.out.println(prefix[n]-prefix[l-1]);
        }else{
            System.out.println(prefix[n]);
        }
    }
    
}