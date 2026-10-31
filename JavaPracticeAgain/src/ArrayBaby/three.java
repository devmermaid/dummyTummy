package ArrayBaby;
//find max ele from all
public class three
{
    static void main() {
        int[] arr={23,32,12,45};
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(max>arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
