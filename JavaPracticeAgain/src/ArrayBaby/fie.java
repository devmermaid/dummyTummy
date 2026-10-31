package ArrayBaby;

//Linear Search: Find targeted element
public class fie
{
    static void main() {
        int[] arr = {23, 12, 45, 56};
        int target=45;
        int index=-1; //can use any non index value
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
                break;
            }
        }
        if(index!=-1)
        {
            System.out.println("Found: "+ index);
        }
        else {
            System.out.println("Unable to find");
        }
    }
}
