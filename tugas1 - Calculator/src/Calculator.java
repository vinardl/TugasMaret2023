import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka pertama: ");
            double angka1 = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            double angka2 = input.nextDouble();

            System.out.print("Masukkan operator (+, -, *, /): ");
            String operator = input.next();

            double hasil;

            if (operator.equals("+")) {
                hasil = angka1 + angka2;
            } else if (operator.equals("-")) {
                hasil = angka1 - angka2;
            } else if (operator.equals("*")) {
                hasil = angka1 * angka2;
            } else if (operator.equals("/")) {
                hasil = angka1 / angka2;
            } else {
                System.out.println("Operator yang dimasukkan tidak valid.");
                return;
            }

            System.out.println("Hasil: " + hasil);

        } catch (Exception e) {
        	e.printStackTrace();
			throw new Exception("Ini bukan angka");
            //System.out.println("Input yang dimasukkan tidak valid, harap masukkan angka.");
        }

        input.close();
    }
}