package ArrayBaby;
//find duplicates
public class twelve
{
    static void main() {
        int[] arr={5,6,3,2,5,6};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Found: "+ arr[i]);
                }
            }
        }
    }
}
