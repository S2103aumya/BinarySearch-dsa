/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main {
    public static int smallestDivisor(int[] nums, int threshold) {
        int ans=Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            maxi = Math.max(maxi, nums[i]);
        }
        int low=1;
        int high=maxi;
        while(low<=high){
            int  mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++){
                sum+=Math.ceil((double)nums[i]/(double)mid);
            }
            if(sum>threshold){
                low=mid+1;
            } else {
                 high=mid-1;
            }
        }
        return low;
    }
    public static void main(String args[]){
        int arr[]={1,2,5,9};
        int threshold=6;
        System.out.println(smallestDivisor(arr,threshold));
    }
}