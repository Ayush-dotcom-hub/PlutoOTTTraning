
public class Program3 {
    public static void main(String[] args) {
        int[] array1 = {2,9,0,44,58,289, 3,90,22,234,897};
        int[] array2 = new int[4];

        int j = 0;
        for (int i = 1; i < array1.length; i++) {
            if (i % 3 == 0) {
                array2[j] = array1[i];
                j++;
            }
        }

        for (int k = 0; k < j; k++) {
            System.out.print(array2[k]+ " ");
        }


    }






}


