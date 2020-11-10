import java.util.Scanner;

public class bloclefor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero:");
        int a = sc.nextInt();
        System.out.println("Introduce un número entero:");
        int b = sc.nextInt();
        int menor = a;
        int mayor = b;
        if (a > b) {
            menor = b;
            mayor = a;
        }
        int suma = 0;
        for (int i = a; i <= b; i++) {
            suma = suma + 1;
            System.out.println(suma);
        }
    }
}
