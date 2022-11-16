import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

      
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha operador: +, -, *, or /");
        operator = input.next().charAt(0);

   
        System.out.println("Primeiro número");
        number1 = input.nextDouble();

        System.out.println("Segundo número");
        number2 = input.nextDouble();

        switch (operator) {

           
            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

        
            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

       
            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

      
            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Invalido operador!");
                break;
        }

        input.close();
    }
}
