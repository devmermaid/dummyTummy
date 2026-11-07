package ArrayBaby;
//count number of duplicates all elementszz
public class fourteen
{
    static void main() {
        int[] arr={2,3,2,4,5,4};
        for(int i=0;i<arr.length;i++)//finding index
        {
            boolean alreadyCounter=false;
            for(int j=0;j<i;j++)
            {
                if(arr[i]==arr[j])
                {
                    alreadyCounter=true;
                    break;
                }
            }
            if(!alreadyCounter)
            {
                int count=0;
                for(int j=0;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        count++;
                    }
                }
                if(count>1)
                {
                    System.out.println(arr[i]+ ":"+count);
                }
            }
        }
    }
}
