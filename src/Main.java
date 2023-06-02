import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, old, tp, norm, real, disc;

        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz (km): ");
        km = inp.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        old = inp.nextInt();
        System.out.print("Yolculuk Tipini Saçiniz ( Tek Yön => 1 -- Gidiş-Dönüş => 2) : ");
        tp = inp.nextInt();

        norm = km * 0.10;

        if (tp == 1){
            if (old <= 12){
                real = norm - (norm*0.5);
            } else if ((old > 12) & (old <= 24)){
                real = norm - (norm*0.1);
            }else if (old >= 65){
                real = norm - (norm * 0.3);
            }else{
                real = norm;
            }
        }else{
            if (old <= 12){
                disc = (norm - (norm*0.5)) *2;
            } else if ((old > 12) & (old <= 24)){
                disc = (norm - (norm*0.1)) *2;
            }else if (old >= 65){
                disc = (norm - (norm * 0.3)) *2;
            }else{
                disc = (norm) *2;
            }
            real = disc - (disc*0.2);
        }
        System.out.println("\nToplam Yolculuk Ücreti : " + real + "TL");
    }
}