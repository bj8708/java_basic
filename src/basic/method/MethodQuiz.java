//package basic.method;
//
//import javax.lang.model.SourceVersion;
//import java.util.Arrays;
//
//public class MethodQuiz {
//
//    static String[] foods = {"chicken", "pasta", "beef"};
//
//    // 배열 내부 한눈에 보기
//    static void printFoods() {
//        System.out.println(Arrays.toString(foods));
//    }
//
//
//    //foods 배열에서 특정 데이터의 인덱스를 반환
//    static int indexOf(String searchFood) {
//        for (int i = 0; i < foods.length; i++) {
//            if (searchFood.equals(foods[i])) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    static void push(String newFood) {
//        copy(temp);
//        temp[temp.length - 1]
//
//        static void copy ( int size){
//            String[] temp = makeNewArray(size)
//            for (int i = 0; i <; i++) {
//
//            }
//        }
//
//
//        public static void main (String[]args){
//
//            printFoods();
//            int idx = indexOf("cake");
//            System.out.println("idx = " + idx);
//s
//
//            static int indexOf (String searchTarget){
//                for (int i = 0; i < foods.length; i++) {
//                    if (searchTarget.equals(foods))
//                }
//
//                // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
//                static void push (String newFood){
//                    String[] temp = new String[foods.length + 1];
//                    for (int i = 0; i < foods.length; i++) {
//                        temp[i] = foods[i];
//                    }
//                    temp[temp.length - 1] = newFood;
//                    foods = temp;
//                    temp = null;
//
//                }
//                // static void push(String newFood)
//                static void insert ( int targetIndex, String newFoodName){
//                    if (isOutOfBounds(targetIndex)) return;
//                }
//
//                // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
//                // static boolean isOutOfBounds(int targetIndex)
//                // 작성이 완료되면
//            }
//
//            static boolean inInclude (String searchTarget){
////            int idx =indexOf(searchTarget);
////            if (idx == -1) return false;
////            else return true;
//                return indexOf(searchTarget) != -1;
//            }
//
//            public static void main (String[]args){
//
//            }
//            int idx = indexOf("apple")
//        }
//    }