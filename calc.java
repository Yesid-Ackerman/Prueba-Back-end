//punto 3
import java.util.Scanner;
import javax.naming.spi.DirStateFactory.Result;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        
        Scanner sc = new Scanner(System.in);        

        System.out.println("*************");
        System.out.println("*Calculadora*");
        System.out.println("*************");

        System.out.println("1: Suma");
        System.out.println("2: Resta");
        System.out.println("3: Multiplicación");
        System.out.println("4: División");
        int opcion = sc.nextInt();
        double num1= 12, num2=21, result=0;

        do{
            switch(opcion) {
                
                case 1:
                        System.out.println(" SUMA");
                        System.out.println("------");
                            num1=sc.nextDouble();
                            num2=sc.nextDouble();
                            result = num1 + num2;
                        System.err.println("El resultado es: " + result);
                    break;

                case 2:
                        System.out.println(" RESTA ");
                        System.out.println("-------");
                            num1=sc.nextDouble();
                            num2=sc.nextDouble();                        
                            result = num1 - num2;
                        System.err.println("El resultado es: " + result);
                    break;
                    
                case 3:
                        System.out.println(" MILTIPLICACIÓN");
                        System.out.println("----------------");
                            num1=sc.nextDouble();
                            num2=sc.nextDouble();
                            result = num1 * num2;
                        System.err.println("El resultado es: " + result);
                    break;

                case 4:
                        System.out.println(" DIVISIÓN");
                        System.out.println("----------");
                            num1=sc.nextDouble();
                            num2=sc.nextDouble();
                            result = num1 / num2;
                        System.err.println("El resultado es: " + result);
                    break;

                default:

                System.out.println("Escriba un Valor de Opción Valido");
            }
        }while (opcion <=4);
    }
}
