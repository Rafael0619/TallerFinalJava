
package calculadora;

import java.util.Scanner;

/**
 *
 * @author rafae
 */
public class Calculadora {

    
    public static void main(String[] args) {
       Operaciones operacion = new Operaciones();
        System.out.println("Esoja la operacion que desea realizar");
        System.out.println("1. SUMA");
        System.out.println("2. RESTA");
        System.out.println("3. MULTIPLICACIÓN");
        System.out.println("4. DIVISION");
        System.out.println("5. MODULO");
        Scanner input = new Scanner(System.in);
        int opcion = input.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Digite el primer numero");
                double a = input.nextDouble();
                System.out.println("Digite el segundo numero");
                double b = input.nextDouble();
                System.out.println(a+"+"+b+"="+operacion.suma(a,b));
                break;
            case 2:
                 System.out.println("Digite el primer numero");
                 a = input.nextDouble();
                 System.out.println("Digite el segundo numero");
                 b = input.nextDouble();
                System.out.println(a+"-"+b+"="+operacion.resta(a,b));
                break;
            case 3:
                 System.out.println("Digite el primer numero");
                 a = input.nextDouble();
                System.out.println("Digite el segundo numero");
                b = input.nextDouble();
                System.out.println(a+"*"+b+"="+operacion.multiplicacion(a,b));
                break;
            case 4:
                 System.out.println("Digite el primer numero");
                 a = input.nextDouble();
                System.out.println("Digite el segundo numero");
                b = input.nextDouble();
                double resultado = operacion.division(a, b);
                if(resultado != 0){
                    System.out.println(a+"/"+b+"="+operacion.division(a,b));
                }else{
                    System.out.println("No se puede dividir por cero");
                }
                break;
            case 5:
                 System.out.println("Digite el primer numero");
                 a = input.nextDouble();
                System.out.println("Digite el segundo numero");
                b = input.nextDouble();
                System.out.println(a+"%"+b+"="+operacion.modulo(a,b));
                break;
            default:
                System.out.println("La opcion seleccionada no es válida2");
        }
    }
    
}
