public class Modulo {

    /*
    If a number is a multiple of 2, print out
    the string “Upper”. If a number is a multiple of 3, print out the string “Line”. And if a number
    is a multiple of both 2 AND 3, print out the string “UpperLine”.
    @param num - takes in a number as an argument
    */
    private static void multiple (int num){
        if(num % 2 == 0 && num % 3 == 0){
            System.out.println("UpperLine");
        }else if(num % 2 == 0){
            System.out.println("Upper");
        }else if(num % 3 == 0){
            System.out.println("Line");
        }
    }

    public static void main(String[] args){
        //for testing purposes
        for(int i = 1; i <= 20; ++i){
            //System.out.print(i + " ");
            multiple(i);
        }
    }
}
