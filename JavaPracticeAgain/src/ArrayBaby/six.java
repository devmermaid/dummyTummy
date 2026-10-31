package ArrayBaby;
//find count of even and odd numbers in array
public class six
{
    static void main() {
        int[] arr={4,3,2,1,4,5,7};
        int even=0;
        int odd=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);
    }
}
