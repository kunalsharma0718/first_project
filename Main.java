import java.util.*;
public class Main {
    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
 System.out.println("enter length of array");
 int len=sc.nextInt(); int arr[]= new int[len];
 for(int i=0;i<len;i++ ){
    System.out.println("enter "+(i+1)+"element of array");
    arr[i]=sc.nextInt();
 }
 // BUBBLE SORT O(n^2)
 for(int i=0;i<len-1;i++ )
   { for(int j=0; j<len-1;j++){
    if(arr[j]>arr[j+1]){
    int temp=arr[j];arr[j]=arr[j+1]; arr[j+1]=temp;
    }}}
 System.out.println("SORTED ARRAY");
 for(int i=0;i<len;i++ ){
    System.out.print(arr[i]+" ");}
    //BINARY SEARCH
    System.out.println("enter target value to be searchred"); int target=sc.nextInt();
int low=0; int high=len-1; int count=0, index=0;
outer: while(low<=high){
   int mid=low+(high-low)/2;
   if(target>arr[mid]){
low=mid;
   }
   else if(target<arr[mid]){
      high=mid;
   }
   else{
count++; index=mid; break outer;}
}
if(count==1)
   System.out.println("Number entered "+target+"at index "+index);
else
   System.out.println("Number entered "+target+" not found");
}}  

