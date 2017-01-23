package gross_ryan;

import java.util.Random;

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

    public String oddNumbers() {
        String answer = "oddNumbers()\n" +
                "*** Output ***\n";
        for(int i = 1; i < 20; i = i + 2) {
            answer += i + "\n";
        }
       return answer;
    }

    public String squares() {
        String answer = "squares()\n" +
                "*** Output ***\n";
        int square = 0;
        for(int i = 1; square < 100; i++) {
            square = (int) Math.pow(i,2);
            answer += square + "\n";
        }
        return answer;
    }

    public String random4() {
        String answer = "random4()\n" +
                "*** Output ***\n";
        Random aRandom = new Random();
        for(int i = 0; i < 10; i++) {
            answer += aRandom.nextInt(10);
        }
        return answer;
    }

    public String even(int aNumber) {
        String answer ="even" + aNumber + "()" + "\n" + "*** Output ***\n";
        for (int i = 1; i < aNumber; i++) {
            if (i % 2 == 0) {
                answer += i + "\n";
            }
        }
        return answer;
    }

    public String tables(int x) {
        String answer = "";
        for(int i = 1; i <= x; i++) {
            String row = "";
            for(int j = 1; j <= x; j++) {
                row += " | " + (i * j);
            }
            answer += row + " |\n";
        }
        return answer;
    }

    public String powers(int n) {
        String answer = "*** Output ***\n";
        for(int i = 1; i <= n; i++) {
            answer += (int) Math.pow(2, i) + "\n";
        }
        return answer;
    }

    public String addSpaces(int numOfSpaces) {
        String spaces = "";

        for(int i = 0; i < numOfSpaces; i++) {
            spaces += " ";
        }
        return spaces;
    }


    public String tableSquares(int n ) {
        String finalAnswer = "";
        for (int i = 1; i <= n; i++) {
            String indivLine = "|";
            for (int j = 1; j <= n; j++) {
                int maxDigits = String.valueOf(n * n).length();
                int current = String.valueOf(i * j).length();
                if(current != maxDigits) {
                    indivLine += " " + addSpaces(maxDigits - current) + (i*j) + " |";
                } else {
                    indivLine += " " + (i*j) + " |";
                }
            }
            finalAnswer += indivLine + "\n";
        }
        return finalAnswer;
    }
    public static void main(String[] args) {
        Loops_Two main = new Loops_Two();
    //    main.oneToTen();
      //  main.oddNumbers();
       // System.out.println(main.tables(3));
        System.out.println(main.tableSquares(10));
    }
}
