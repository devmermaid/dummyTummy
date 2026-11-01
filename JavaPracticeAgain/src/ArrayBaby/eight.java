package ArrayBaby;
//find second largest
public class eight
{
    static void main() {
        int[] arr={23,12,24,45};
        int large=Integer.MIN_VALUE;
        int slarge=Integer.MIN_VALUE;
        for(int num:arr)
        {
            if(num>large)
            {
                slarge=large;
                large=num;
            }
            else if(num==slarge && num!=large)
            {
                slarge=num;
            }
        }
        System.out.println(slarge);
    }
}
