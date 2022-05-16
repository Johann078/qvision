
public class MetodosBAsicos {

    public static void main (String[] args){

        String cadena = "";
        int entero = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca un numero :");
        entero = sc.nextInt();

        int Array[] = new int[entero];

        for (int i = 0; i < ArrayN.length; i++) {
            System.out.println("Introduzca número para el elemento " + (i + 1) + ": ");
            ArrayN[i] = sc.nextInt();
        }

     algo(Array);

    }
    static void algo(int ArrayN[]) {
        System.out.println("|-----------------------|");
        for (int i = 0; i < ArrayN.length; i++) {
            System.out.print(" Elemento " + (i + 1) + " -----> " + ArrayN[i] + "\n");
        }
        System.out.println("|-----------------------|");
    }


}




