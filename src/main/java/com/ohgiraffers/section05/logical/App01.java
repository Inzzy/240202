package com.ohgiraffers.section05.logical;

public class App01 {

    public static void main(String[] args) {

        /*수업목표. 논리연산에 대해 이해하고 활용할 수가 있다. */
        /* 필기.
        *   논리 연산자
        *   논리값(true or false)를 취급하는 연산자이다.
        *  */

        /* 필기.
        *   논리 연산자의 종류
        *   1. 논리 연결 연산자 :
        *       1-1 && (논리 AND) 연산자 : 두 개의 논리식 모두 참 일 경우 참을 반환, 둘 중 하나라도 거짓이면 거짓을 반환.
        *       1-2 || (논리 OR) 연산자 : 두 개의 논리식 중 하나라도 참 일 경우 참을 반환, 둘 다 거짓이면 거짓을 반환.
        *   2. 논리 부정 연산자
        *       1-1. ! (논리 NOT) 연산자 : 논리식의 결과가 참이면 거짓, 거짓이면 참을 반환.
        *  */

        /* 목차. 1. 논리 연산자 결과값 확인 */

        System.out.println("true와 true의 논리 and 연산 : " + (true && true));
        System.out.println("true와 false의 논리 and 연산 : " + (true && false));
        System.out.println("false와 true의 논리 and 연산 : " + (false && true));
        System.out.println("false와 false의 논리 and 연산 : " + (false && false));

        System.out.println("====================================================");
        System.out.println("true 와 true의 논리 or 연산 : " + (true || true));
        System.out.println("true 와 false의 논리 or 연산 : " + (true || false));
        System.out.println("false 와 true의 논리 or 연산 : " + (false || true));
        System.out.println("false 와 false의 논리 or 연산 : " + (false || false));
        System.out.println("====================================================");
        System.out.println("true의 논리 not 연산 : " + (!true));
        System.out.println("false의 논리 not 연산 : " + (!false));

    }

}
