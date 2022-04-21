public class TestBinarySearch {
    int[] arrnum = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    int TestBinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid])
                high = mid - 1;
            else if (key == list[mid])
                return mid;
            else
                low = mid + 1;
        }
        return -1;
    }

}