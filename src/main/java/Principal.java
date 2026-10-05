import java.util.Scanner;
/**
 *
 * @author 10725213830
 */
public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0, num;
        String A;
        
        System.out.println("Escreva a Frase que queres que seja repetida:");
        A = sc.next();
        
                System.out.println("Escreva o numero de vezes que ela deve ser repetida:");

        num = sc.nextInt();
        
        do {
            System.out.println(i + "."+ " " + A);
            i++;
        } while (i <= num );
    }
}
