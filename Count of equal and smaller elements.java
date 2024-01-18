/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static int countofsmaller(int arr[],int x){
        int l=0;
        int h=arr.length;
        int mid=0;
        while(l<=h){
            mid=(l+h)/2;
            if(arr[mid]==x){
                return h-l+1;
            } else if(arr[mid]>x){
                h=mid-1;
            } else {
                l=mid+1;
            }
        }
        return mid+1;
    }
	public static void main(String[] args) {
	    int arr[]={1,3,5,7,9};
	    int x=8;
	    System.out.print(countofsmaller(arr,x));
	    
	}
}
