
public class ArraySwap {
    public static void main(String[] args) {
        int[] array1 = {2,9,0,44,58,289, 3,90,22,234,897};
        int[] result = new int[array1.length/3];

        int j = 0;
        for (int i = 1; i < array1.length; i++) {
            if (i % 3 == 0) {
                result[j] = array1[i];
                j++;
            }
        }

        for (int k = 0; k < j; k++) {
            System.out.print(result[k]+ " ");
        }


    }






}


