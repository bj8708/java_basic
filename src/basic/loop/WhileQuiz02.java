package basic.loop;

import javax.imageio.event.IIOReadProgressListener;
import java.util.Scanner;

public class WhileQuiz02 {

    public static void main(String[] args) {

        /*
        - 정수 3개를 입력 받습니다. (변수 하나씩 선언해서 따로따로 받으세요.)
        - 가장 큰 값, 가장 작은 값, 중간값을 구해서 출력해보세요.
        # max, mid, min이라는 변수를 미리 선언하셔서
        판별이 될 때마다 각각의 변수에 값을 넣어줍니다.
        마지막에 한번에 출력하시면 되겠습니다.
         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("정수1: ");
        int num1 = sc.nextInt();
        System.out.println("정수2: ");
        int num2 = sc.nextInt();
        System.out.println("정수3: ");
        int num3 = sc.nextInt();

        int max, mid, min;

        // num1이 max인 경우!
        if (num1 > num2 && num1 > num3) {
            max = num1;
            if (num2 > num3) {
                mid = num2;
                min = num3;
            } else {
                mid = num3;
                min = num2;
                }
            }else if (num2 > num1 && num2 > num3) { // num2ㅏㄱ max인 경우
            max = num2;
            if (num1 > num3) {
                mid = num1;
                min = num3;
            } else {
                mid = num3;
                min = num1;
            }
        } else { // num3가 max인 경우
            max = num3;
            if (num2 > num1) {
                mid = num2;
                min = num1;}
            else {
                mid = num1;
                min = num2;
            }
        }
        System.out.println("================================");
        System.out.println("max: " + max
        ); */
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("정수: ");
            int num = sc.nextInt();

            int i = 1; //begin
            int cnt = 0; // 약수의 개수를 기억할 변수

            while (i <= num) { //end
                if (num % i == 0) {
                    cnt++;
                }
                1++; // step
            }

            if (cnt == 2) {
                System.out.println(num + "은(는) 소수입니다.");
            } else {
                System.out.println(num + "은(는) 소수가 아닙니다.");
            }

        System.out.println("======================================");

        int j = 2;

        while (num % j != 0) {
            j++;
        }

            System.out.printf("%d은(는) %s\n", num, num == j ? "소수입니다." : "소수가 아닙니다");

        {
            Scanner sc = new Scanner(System.in);

            System.out.println("정수1: ");
            int num1 = sc.nextInt();

            System.out.println("연산을 선택하세요. [+, -, *, /]: ");
            String operator = sc.next();

            System.out.println("정수2: ");
            int num2 = sc.nextInt();

            int result = 0;
            boolean flag = false;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("연산할 수 없는 입력값 입니다.");
                        flag = true;
                        break;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("연산 기호를 정확하게 입력하세요. [+, -, *, /]");
            }
            if (!flag) { //flag == false
                System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);
            }

            sc.close();

        }


    }


}

