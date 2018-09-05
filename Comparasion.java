// Compara interior utilizando instruções if, operadores racionais
//e operadores de igualdade.
import java.util.Scanner; //programa utiliza a classe Scanner

public class Comparasion
{
    //Método main inicia a execução do  app Java
    public static void main (String[]args)
    {
        // cria Scanner para obter entrada a partir da linha comando
        Scanner input = new Scanner (System.in);
        int number1, // primeiro número a comparar 
                number2;// segundo número a comparar 
        System.out.print("Enter first integer: ");// prompt
        number1= input.nextInt();// le o primeiro número fornecido pelo user.

        System.out.print("Enter second integer: ");// prompt.
        number2= input.nextInt();// le o segundo número fornecido pelo user.
        
        if (number1 == number2)
            System.out.printf("%d == %d%n", number1, number2);

        if (number1 != number2)
            System.out.printf("%d != %d%n", number1,
            number2);

        if (number1 < number2)
            System.out.printf("%d < %d%n", number1,
            number2);

        if (number1 > number2)
            System.out.printf("%d > %d%n", number1,
            number2);

        if (number1 <= number2)
            System.out.printf("%d <= %d%n", number1,
            number2);
        
        if (number1 >= number2)
            System.out.printf("%d >= %d%n", number1,
            number2);
    }
}