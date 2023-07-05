public class ArrayFall {

    public static void main(String[] args) {
        int arr[] = {50, 6, 1, 9, 3, 22, 590, 44, 90, 93, 9, 28, 3, 25, 80};
         int a=0, b=1, occurence;

        System.out.println(arr[a]);
        System.out.println(arr[b]);


        try {


            for (int i = 0; i < arr.length; i++) {
                occurence = a + b;
                System.out.println(arr[occurence]);

                a = b;
                b = occurence;

            }
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }


    }






