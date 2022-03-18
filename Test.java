
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // Degiskenler olustur
        int age,age1 ;


        Scanner input = new Scanner(System.in);
        System.out.println("Yıl giriniz : ");
        age = input.nextInt();
        age1 = age % 4;
            if (age1 == 0){
                System.out.println(age +" bir artık yıldır..");
            }else{
                System.out.println(age +" artık yıl degildir..");
            }








    }
}
