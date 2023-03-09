package Exercises1.Ex3;

public class SortArray { //Sắp xếp các đối tượng implement comparrator
    public <T extends MyComparator <T>> void sorted(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].compare(arr[j]) > 0) {
                    T temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public <T extends MyComparator <T>> void printArray(T[] arr) {
        System.out.println("Array: ");
        for (T a : arr) {
            System.out.println(a + "\t");
        }
    }
}
