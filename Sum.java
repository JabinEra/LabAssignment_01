package problem_E12;

public class Sum {
    private int result;
    public Sum() {
        result = 0;
    }

    public int getResult(int number) {
        for(int loopcount =0; loopcount<=number;loopcount++) {
            result = result + loopcount;
        }
        return result;
    }
}
}
