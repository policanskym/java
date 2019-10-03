import java.util.Scanner;

public class scanner
{
    /***************************************************************************
     * Metoda, prostřednictvím níž se spouští celá aplikace.
     *
     * @param args Parametry příkazového řádku
     */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej text: ");
        String nacteno = sc.next();
        System.out.println("Napsal jsi: " + nacteno);
        System.out.println("Zadej číslo 1: ");
        int c1 = sc.nextInt();
        System.out.println("Načetl jsi: " + c1);
        System.out.println("Zadej číslo 2: ");
        int c2 = sc.nextInt();
        int soucet = c1 + c2;
        System.out.println("Součet je: " + soucet);
    }
}
