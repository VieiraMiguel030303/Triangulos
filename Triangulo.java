import java.util.Scanner;

public class Triangulo
{
    public static void main (String[]args)
    {
        Scanner input = new Scanner (System.in);
        int n1,  
            n2,
            n3;
        
        System.out.print("Enter first integer of triangle: ");
         n1= input.nextInt();

        System.out.print("Enter second integer of triangle: ");
        n2= input.nextInt();

        System.out.print("Enter third integer of triangle: ");
        n3= input.nextInt();

        if (n1==n2 && n1==n3)
            System.out.printf("%d == %d%n == %d%n O triangulo e Equilatero", n1 , n2, n3);

        if (n1!=n2 && n1!=n3 && n2!= n3)
            System.out.printf("%d != %d%n != %d%n O triangulo e Escaleno", n1 , n2, n3);

        if (n1!=n2 && n2==n3)
            System.out.printf("%d != %d%n == %d%n O triangulo e Isoceles", n1 , n2, n3); 

        if (n1==n2 && n1!=n3)
            System.out.printf("%d == %d%n != %d%n O triangulo e Isoceles", n1 , n2, n3);   
        
        if (n1==n3 && n2!=n3)
            System.out.printf("%d == %d%n == %d%n O triangulo e Isoceles", n1 , n2, n3);
    }
}





