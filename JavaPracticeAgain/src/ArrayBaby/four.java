package ArrayBaby;

// find smallest element of array
public class four
{
    static void main() {
        int[] arr={23,43,12,56};
        int small=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<small)
            {
                small=arr[i]; // bcz we want arr[i] value to be max to continue with comparison
            }
        }
        System.out.println(small);
    }
}
