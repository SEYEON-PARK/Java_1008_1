/*
두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)

첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.
*/

import java.util.Scanner; // 스캐너를 사용하기 위해

public class Main{ // Main 클래스 정의
    public static void main(String[] args){ // main() 메소드
        Scanner scanner = new Scanner(System.in); // 스캐너 scanner 생성
        int A, B; // 변수 선언
        
        A=scanner.nextInt(); // 사용자로부터 정수 입력받기
        B=scanner.nextInt();
        
        System.out.println((double)A/B); // 결과 출력하기
    }
}
