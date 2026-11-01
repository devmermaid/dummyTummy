package ArrayBaby;
//find if array is sorted in ascending order
public class nine
{
    static void main() {
        int[] arr={12,13,14,15};
        int i;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }
        if(i==arr.length-1)
        {
            System.out.println("Sorted");
        }
        else
        {
            System.out.println("Not sorted");
        }
        boolean sorted=true;
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                sorted=false;
                break;
            }
        }
        if(sorted==true)
        {
            System.out.println("Sorted");
        }
        else {
            System.out.println("Not sorted");
        }
    }
}
