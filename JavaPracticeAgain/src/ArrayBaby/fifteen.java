package ArrayBaby;
//print non duplicate(unique) elements

public class fifteen
{
    static void main() {
        int[] arr = {2, 5, 2, 8, 5, 9, 2};
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }

            if(count==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
