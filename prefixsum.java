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

public class prefixsum {

    public static int rangeSum(int[] arr, int left, int right){
        int [] prefix=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i]=arr[i]+prefix[i-1];
        }
        if(left==0){
            return prefix[right];
        }
        else{
            return prefix[right]-prefix[left-1];
        }

    }
    public static void main(String[] args) {
        int[] arr={3, 7, 2, 5, 8};
        int left=1;
        int right=3;
        int sol=rangeSum(arr, left, right);
        System.out.println(sol);
        
    }
}