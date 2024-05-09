package biginerHomwork;

public class Java2CalcMain {

    public static void main(String[] args) {

        ICalcService service = new CalcServiceBiz();
        CalcContorlloer contorlloer = new CalcContorlloer(service);

        contorlloer.applicationStart();
    }
}
