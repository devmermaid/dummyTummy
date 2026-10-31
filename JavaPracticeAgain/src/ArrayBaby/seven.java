package ArrayBaby;

public class seven
{
    static void main() {
        int[] arr={23,32,45,12};
        int left=0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
