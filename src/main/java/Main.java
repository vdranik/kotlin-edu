public class Main {

    private static String name = null;

    public static void main(String[] args) {

//        if(name!=null){
//            System.out.println(name.length());
//        }
//        else {
//            System.out.println("null");
//        }
//
//
//        for (int i = 0; i <= 100; i++){
//            System.out.println(i);
//        }

        int[] array = new int[101];
        for(int i = 0; i< array.length; i++){
            array[i] = i;
        }

        for (int i: array){
            System.out.println(i);
        }


    }
}
