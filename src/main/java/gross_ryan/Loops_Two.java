package gross_ryan;

/**
 * Created by ryangross on 1/16/17.
 */
public class Loops_Two {

    public String oneToTen() {
        String answer = "oneToTen()\n*** Output ***\n";
        for(int i = 1; i <= 10; i++) {
            answer += i + "\n";
        }
        return answer;
    }

    public static void main(String[] args) {
        Loops_Two main = new Loops_Two();
        main.oneToTen();
    }
}
