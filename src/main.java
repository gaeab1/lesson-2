class Main {
    public static void main(String[] args) {
        int[] foo = {0, 1, 2, 3, 4};

        int[] bigfoo = new int[100];
        for(int i = 0; i < 100; i++){
            bigfoo[i] = i;
        }
        System.out.println("The number of even numbers in foo is:");
        System.out.println(countEvenNum(foo, 5));

        System.out.println("The number of even numbers in bigfoo is:");
        System.out.println(countEvenNum(bigfoo, 100));

    }



    private static int countEvenNum(int[] arr, int size){
        int count = 0;

        for(int i = 0; i < size; i++){
            if(arr[i] % 2 == 0){
                count++;
            }
            else{

            }
        }

        return count;
    }
}
