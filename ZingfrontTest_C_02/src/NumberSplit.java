import java.util.Scanner;

/**
 * 2. 整数拆分

 */
public class NumberSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int flag = 0;
        int beginNumber, endNumber;
        for (beginNumber = 1; beginNumber < number;
             beginNumber++) {
            for (endNumber = beginNumber + 1; endNumber
                    < number; endNumber++) {
                // 任何可以进行分解的整数，必然满足(m+n)(n-m+1)/2 的形式
                int sum = (beginNumber + endNumber) *
                        (endNumber - beginNumber + 1) / 2;
                if (sum == number) {
                    flag = 1;
                    for (int i = beginNumber; i <=
                            endNumber; i++) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
        }

        if (0 == flag) {
            System.out.println("NONE");
        }
    }
}
