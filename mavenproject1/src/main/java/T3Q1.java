
package Lab.Lab3;

import java.util.Scanner;

Tpublic class T3Q1 {
    public static void main(String[] args){
        Scanner scanner  = new Scanner(System.in);
        String [] temp;
        double result = 0;
        int num1, num2;
        char operand;
        String input;

        System.out.print("Enter two integer number: ");
        input = scanner.nextLine();
        temp = input.split(" ");

        num1 = Integer.parseInt(temp[0]);
        num2 = Integer.parseInt(temp[1]);

        System.out.print("Enter the operand: ");
        operand = scanner.next().charAt(0);


        switch (operand){
            case '+':
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1*num2;
                break;
            case '/' :
                result = (double)num1/num2;
                break; 
            case '%':
                result = num1 % num2;
                break;
        }

        if(num1%num2 == 0) System.out.println(num1 + " " + operand + " " + num2 + " = " + (int)result);
        else System.out.println(num1 + " " + operand + " " + num2 + " = " + result);
    }
}