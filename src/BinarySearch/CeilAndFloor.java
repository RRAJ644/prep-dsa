package BinarySearch;

public class CeilAndFloor {
    public static void main(String[] args) {
        int[] arr=  {10,20,30,40,50};
        int val = 25;
        int l = 0;
        int h = arr.length-1;
        int ceil = 0;
        int floor = 0;
        while (l<=h){
            int mid = l+(h-l)/2;
            if (arr[mid] > val){
                h=mid-1;
                floor = arr[mid];
            }
            else if (arr[mid]<val){
                l=mid+1;
                ceil= arr[mid];
            }
            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }
        System.out.println(ceil+" ceil");
        System.out.println(floor+" floor");

    }
}
