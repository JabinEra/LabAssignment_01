package problem_E13;

public class MultiplicationNumber {
    private int result;
    public MultiplicationNumber() {
        result = 1;
    }

    public int getResult(int number) {
        for(int loopcount =0; loopcount<=number;loopcount++) {
            result = result * loopcount;
        }
        return result;
}
