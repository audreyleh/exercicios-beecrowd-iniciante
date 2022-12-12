
//exercicio alterado para realizar a leitura de várias coordenadas no mesmo programa;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int leitura = teclado.nextInt();

        for (int i = 1; i <= leitura; i++) {
                float x = teclado.nextFloat();
                float y = teclado.nextFloat();


                if (x == 0.0 && y == 0.0) {
                    System.out.println("Origem");

                } else if (x == 0) {
                    System.out.println("Eixo Y");

                } else if (y == 0) {
                    System.out.println("Eixo X");

                } else if (x > 0 && y > 0) {
                    System.out.println("Q1");

                } else if (x > 0 && y < 0) {
                    System.out.println("Q4");

                } else if (x < 0 && y > 0) {
                    System.out.println("Q2");

                } else if (x < 0 && y < 0) {
                    System.out.println("Q3");

                }
        }

    }


}


