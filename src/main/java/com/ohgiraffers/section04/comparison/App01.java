package com.ohgiraffers.section04.comparison;

public class App01 {

    public static void main(String[] args) {

        /* 수업목표. 비교연산자에 대해 이해하고 활용할 수 있다.*/
        /* 필기
        *   비교연산자
        *   비교연산자는 피연산자 사이에서 상대적인 크기를 판단하여 참 혹은 거짓을 반환하는 연산자이다.
        *   연산자 중 참 혹은 거짓을 반환하는 연산자는 삼항연산자의 조건식이나 조건문의 조건절에 많이 사용된다.
        *   많이 사용된다는 것은 많이 연습해야 된다는 것이다.
        *  */

        /* 목차. 1. 숫자값 비교 */
        /* 목차. 1-1. 정수 비교 */
        int inum1 = 10;
        int inum2 = 20;

        System.out.println("=================정수값 비교=================");
        System.out.println("inum1과 inum2가 같은 지 비교 : " + (inum1 == inum2));
        System.out.println("inum1과 inum2가 같지 않은지 비교 : " + (inum1 != inum2));
        // 구분선
        System.out.println("inum1과 inum2 보다 큰 지 비교 : " + (inum1 > inum2));
        System.out.println("inum1과 inum2 보다 크거나 같은 지 비교 : " + (inum1 >= inum2));
        System.out.println("inum1과 inum2 보다 작은 지 비교 : " + (inum1 < inum2));
        System.out.println("inum1과 inum2 보다 작거나 같은 지 비교 : " + (inum1 <= inum2));

        /* 목차. 2. 문자값 비교 */
        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("===============문자값 비교===============");
        System.out.println("ch1과 ch2가 같은 지 비교 : " + (ch1 == ch2));
        System.out.println("ch1과 ch2가 같지 않은 지 비교 : " + (ch1 != ch2));
        System.out.println("ch1과 ch2 보다 큰 지 비교 : " + (ch1 > ch2));
        System.out.println("ch1과 ch2 보다 크거나 같은 지 비교 : " + (ch1 >= ch2));
        System.out.println("ch1과 ch2 보다 작은 지 비교 : " + (ch1 < ch2));
        System.out.println("ch1과 ch2 보다 작거나 같은 지 비교 : " + (ch1 <= ch2));

        /* 목차. 3. 논리값 비교 */
        boolean bool1 = true;
        boolean bool2 = false;
        /* 필기. 논리값은 == 과 != 비교가 가능하지만, 대소비교는 불가능하다. */
        System.out.println("===============논리값 비교===============");
        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 == bool2));
        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 != bool2));
        System.out.println("==================================");
//        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 > bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 >= bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 <= bool2));
//        System.out.println("bool1과 bool2가 같은 지 비교 : " + (bool1 < bool2));

        /* 목차. 4. 문자열 값 비교 */
        /* 필기. 문자열도 == 과 != 은 비교가 가능하지만, 대소 비교는 불가능하다.*/
        String str1 = "java";
        String ste2 = "java";

        System.out.println("====================문자열 값 비교====================");
        System.out.println("str1과 str2가 같은지 비교 : " + (str1 == ste2));
        System.out.println("str1과 str2가 다른지 비교 : " + (str1 != ste2));
        System.out.println("============================================");
//        System.out.println("str1과 str2가 다른지 비교 : " + (str1 > ste2));
//        System.out.println("str1과 str2가 다른지 비교 : " + (str1 >= ste2));
//        System.out.println("str1과 str2가 다른지 비교 : " + (str1 < ste2));
//        System.out.println("str1과 str2가 다른지 비교 : " + (str1 <= ste2));

    }
}
