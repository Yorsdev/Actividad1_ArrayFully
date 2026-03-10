import java.util.Scanner;

public class arraysAct1 {
    static int[] array1 = new int[7];
    static int[] array2 = new int[7];
    static int[] array3 = new int[7];

    static void main(String[] args) {
        int suma = 0;
        double promedio;
        Scanner sc = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("VAMOS A LLENAR EL PRIMER ARREGLO");
        System.out.println("*********************************");

        for(int i = 0; i <7; i++) {
            System.out.println("Ingresa el valor para la posición ["+i+"]");
            array1[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("*********************************");
        System.out.println("VAMOS A LLENAR EL SEGUNDO ARREGLO");
        System.out.println("*********************************");

        for(int j = 0; j <7; j++) {
            System.out.println("Ingresa el valor para la posición ["+j+"]");
            array2[j] = sc.nextInt();
        }

        System.out.println();
        System.out.println("************************************************************");
        System.out.println("LLENANDO EL TERCER ARREGLO CON LA DIFERENCIA DE LOS DOS ...");
        System.out.println("************************************************************");
        System.out.println();
        System.out.println("...");
        System.out.println();


        System.out.println("*************************************");
        System.out.println("***********TERCER ARREGLO************");
        System.out.println("*************************************");

        for(int k = 0; k < 7; k++) {
            array3[k] = array1[k] - array2[k];
            suma += array3[k];
            System.out.println("Arreglo 3 - Posición: ["+k+"] : "+array3[k]);
        }
        promedio = (double)suma / array3.length;
        System.out.println(" ");
        System.out.printf("El promedio de los datos del tercer arreglo es: %.2f", promedio);
        sc.close();
    }
}

