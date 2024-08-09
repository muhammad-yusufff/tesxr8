import java.util.Scanner;

public class tabung{
    public static void main(String[] args) throws InterruptedException {

        // diameter/radius check

        Scanner inYesNo = new Scanner(System.in);
        System.out.println("Apakah kamu mengetahui jari-jari tabung? (Y/N)");
        char yes = inYesNo.next().charAt(0);
        System.out.println("");

        // if radius is known

        Scanner inRadius = new Scanner(System.in);
        if (yes == 'Y' ) {
            System.out.println("Masukkan nilai jari-jari tabung. (Angka saja)");
        } else {
            System.out.println("Tidak apa-apa, masukkan saja nilai diameternya. (Angka saja)");
        }
        int radius = inRadius.nextInt();
        double diameter = Double.valueOf(radius);
        System.out.println("");
        
        // input height

        Scanner inHeight = new Scanner(System.in);
        System.out.println("Masukkan nilai tingginya. (Angka saja)");
        int height = inHeight.nextInt();
        System.out.println("");

        // math time

        if (yes != 'Y') {
            diameter = diameter / 2;
        }
        int volume = (int) (Math.PI * diameter * diameter * height);
        int luas = (int) (2 * Math.PI * diameter * (diameter + height));

        // display output

        System.out.println("Volume dari tabung adalah " + volume + " cm3.");
        System.out.println("Luas permukaan dari tabung adalah " + luas + " cm2.");
        System.out.println("Sekian, terimakasih.");
        System.out.println("");
    }
}
