public class ArrayFall {
    public static void main(String[] args) {
        int[] array = {50,6,1,9,3,22,590,44,90,93,9,28,3,25,80};
        printarrayvalues(array);


    }

    public static void printarrayvalues(int[] array)
    {
        int[] positions = {0,1,1,2,3,5,8,13};

        for(int position: positions)
        {
            if(position< array.length)
            {
                System.out.println("Values of position" + position+ ": " + array[position]);
            }
        }
    }
}
