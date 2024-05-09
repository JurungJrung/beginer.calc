package biginerHomwork;

public class CalcContorlloer {
    // 컨트롤려 역활 1) 뷰에서 받은 사용자 입력값으로 연산 처리 2) 연산 결과값 뷰로 전달 3) 예외 로직 추가

    ICalcService service;
    public CalcContorlloer(ICalcService service){
        this.service =service;
    }

    public void applicationStart(){
        CalcView view = new CalcView();
        NumberDTO number = new NumberDTO(0,0);

        while (true){
            String op = view.inputNumber(number);
            switch (op){
                case "+":
                    service.add(number);
                    break;
                case "-":
                    service.sub(number);
                    break;
                case "*":
                    service.mul(number);
                    break;
                case "/":
                    service.div(number);
                    break;
            }
            view.printResult(number,op);
        }
    }
}
