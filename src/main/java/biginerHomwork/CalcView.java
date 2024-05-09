package biginerHomwork;

import java.util.Scanner;

public class CalcView {
    // 뷰 역활 1) 사용자 입력값 받기 (스캐너) 2) 입력값을 컨트롤러로 넘겨서 연산 3) 연산된 결과값을 뷰에서 출력
    Scanner sc = new Scanner(System.in);

    public String inputNumber(NumberDTO number){
        System.out.println("두 수를 입력해주세요");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String op = sc.next();

        number.setNum1(num1);
        number.setNum2(num2);

        return op;
    }

    public void printResult(NumberDTO number,String op){
        System.out.printf("두 수 %d와 %d의 ",number.getNum1(),number.getNum2());

        switch (op) {
            case "+":
                System.out.printf("add 결과: %2f",number.getResult());
                break;
            case "-":
                System.out.printf("sub 결과: %2f",number.getResult());
                break;
            case "*":
                System.out.printf("mul 결과: %2f",number.getResult());
                break;
            case "/":
                System.out.printf("div 결과: %2f",number.getResult());
                break;
        }
    }
}
