package Practice;

public class LargestElement {
    public static int largest(int[] arr)
    {
        int max = arr[0];
        for(int num:arr)
        {
            if(num>max) max = num;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {234,57544,23,34,34,3453,23423,45,4};
        int large = largest(arr);
        System.out.println("The Largest element is "+large);
    }
}
