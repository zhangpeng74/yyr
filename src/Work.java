import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        System.out.println("请输入一个表达式：");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        int result = 0;
        switch (operator) {
            case "+" :
                result = num1 + num2;
                break;
            case "-" :
                result = num1 - num2;
                break;
            case "*" :
                result = num1 * num2;
                break;
            case "/" :
                result = num1 / num2;
                break;
        }
        System.out.println("表达式值为：" + result);
    }
}
