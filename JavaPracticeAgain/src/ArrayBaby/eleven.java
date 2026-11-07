package ArrayBaby;

public class eleven
{
    static void main() {
        int[] arr={8, 12, 15, 5, 10};
        int sum=0;
        int avg=0;
        int i=0;
        for(i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum/i);
    }
}
