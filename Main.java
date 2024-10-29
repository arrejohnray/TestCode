


public class Main {
    public static void main(String[] args)throws Exception {
        int height = 6;

        //Outer loop would be the row
        //The inner loop should be the column
        for(int row = 1; row <= height; row++){
            for(int space = 0; space <= height - row; space++){
                System.out.print(" ");
            }
        
            for(int col = 1; col <= row * 2 - 1; col++){
                System.out.print("*");
            }

            System.out.println();
        }        


        for(int row = height - 1; row >= 1; row--){
            for(int space = height; space > row - 1; space--){
                System.out.print(" ");
            }
            for(int col = 1; col <= row * 2 - 1; col++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}