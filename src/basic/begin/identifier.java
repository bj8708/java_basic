package basic.begin;

public class identifier
{
    public static void main(String[] args) {

        //1. 식별자는 대/소문자를 철저하게 구분함!
        int age = 35;
//int age = 40;
int Age = 40;

// 2. 식별자는 숫자로만 이루어지거나 숫자로 시작하면 안됨!
//        int 700 = 365; (x)
//        int 7number = 7; (x)
        int number7 = 7;
        int num7ber = 7;

        // 3. 식별자에 공백 못들어가요!
//        int my birth day = 19921013;
        int myBirthDay = 19921013; // camel case 표기법

        // 4. 식별자에 특수기호는 밑줄(_), 달러기호($) 뿐입니다.
        // 사용 권장 X. 이미 사용하기로 약속한 곳이 있음
        String hello = "안녕";

        // 5. 키워드 (예약어)는 식별자로 사용할 수 없음!
        // 키워드란 이미 어떠한 기능을 내포하고 있는 단어.
//        String class = "8반"; (x)
        String Class = "8반"; // 권장x
        String myClass = "8반";

        // 6. 한글이나 한자 같은 식별자도 문법적으로 허용하기는하지만
        // 권장x
    }
}