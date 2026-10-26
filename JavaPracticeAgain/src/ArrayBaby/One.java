package ArrayBaby;

//print all elemtns in given array
//O(n): bcz we visit every element once
public class One
{
    static void main() {
        int[] arr={10,20,30,40,50};
        System.out.println(arr);//returns memory address, for each loop
        for(int i:arr)//simplest way to do it
        {
            System.out.println(i);
        }

        for(int i=0;i<arr.length;i++)//normal for loop
        {
            System.out.println(arr[i]);
        }
    }
}
