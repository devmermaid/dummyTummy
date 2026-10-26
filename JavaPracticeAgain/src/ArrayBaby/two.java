package ArrayBaby;

//find sum of all array elements
//O(n): bcz we visited each elements once for sum.
public class two
{
    static void main() {
        int[] arr={10,20,30,40,50};
        int sum1=0;
        int sum2=0;
        for(int i=0;i<arr.length;i++)//normal for
        {
            sum1=sum1+arr[i];
        }

        for(int j:arr)//for each
        {
            sum2=sum2+j;
        }
        System.out.println(sum1);
        System.out.println(sum2);

    }
}
