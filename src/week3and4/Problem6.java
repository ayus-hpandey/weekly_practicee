package week3;

public class Problem6 {

    static void findFloorCeil(int[] arr, int target) {
        int floor = -1, ceil = -1;

        for (int i : arr) {
            if (i <= target) floor = i;
            if (i >= target) {
                ceil = i;
                break;
            }
        }

        System.out.println("Floor: " + floor);
        System.out.println("Ceiling: " + ceil);
    }

    public static void main(String[] args) {
        int[] arr = {10, 25, 50, 100};

        findFloorCeil(arr, 30);
    }
}