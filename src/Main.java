public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {1, 7, 4, 9, 11};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println("\n");
        swap(array, 1, 2);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
    public static void swap(int[] array, int pos1, int pos2)
    {
        int temp = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = temp;
    }


}
