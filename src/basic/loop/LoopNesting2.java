package basic.loop;

public class LoopNesting2 {

    public static void main(String[] args) {

        /*
         *
         **
         ***
         ****
         *****
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
                *
               **
              ***
             ****
            *****
         */

        for (int i = 1; i <= 5; i++) {
            // 별 찍기 전에 공백부터 만드는 for문
            for (int k=4; k >= i; k--) {
                System.out.print(" ");
            }
            // 별찍는 for문
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
    }

        /*
        *****
         ****
          ***
           **
            *
         */

        for (int p=1; p<=5; p++) {
            for (int q=0; q<p-1; q--) {
            System.out.print(" ");

                      }

        }
}}
