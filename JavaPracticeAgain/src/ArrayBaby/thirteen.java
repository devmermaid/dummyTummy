package ArrayBaby;

public class thirteen
{
    static void main() {
        int[] arr={4, 4, 4, 6, 6, 8};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            boolean duplicate=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    duplicate=true;
                    break;
                }
            }
            if(!duplicate)
            {
                for(int j=i+1;j<arr.length;j++)//start count with index 0 as we are counting duplicats from index 0 not 1
                {
                    count++;
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
        System.out.println("Count: "+count);
    }
}
