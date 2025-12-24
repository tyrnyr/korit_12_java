package ch06_loops;
/*
         *
        **
       ***
      ****
     *****

     *****
      ****
       ***
        **
         *
 */
public class Loop08Star3 {
    public static void main(String[] args) {

        for(int i = 1 ; i < 6 ; i++) {
            for (int j = 0; j < 6; j++) {
                if(j < (6-i)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5 ; i > 0 ; i--) {
            for (int j = 0; j < 6; j++) {
                if(j < (6-i)) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
