import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalPrice, perKm = 0.10, ageDiscound12, ageDiscound24, ageDiscound65, ticket,
                price = 0, age, km;


        Scanner input = new Scanner(System.in);
        System.out.print("enter age of the passenger:");
        age = input.nextDouble();

        System.out.print("enter km of the passenger :");
        km = input.nextDouble();
        totalPrice = km * perKm;

        System.out.println(" choose 1 for one way or 2 for couple way");
        ticket = input.nextDouble();


        if (age < 12 && age >= 0) {
            if (ticket == 1) {
                ageDiscound12 = totalPrice * 0.5;
                price += totalPrice - ageDiscound12;

                System.out.println(price);

                System.out.print("you have %50 discound because of you are bellow than 12 years old ");

            } else if (ticket == 2) {
                price += ((totalPrice - (totalPrice * 0.5)) - (totalPrice - (totalPrice * 0.5)) * 0.2) * 2;
                System.out.println(price);

                System.out.println("you have %50 + % 20 discound because of you are bellow than 12 years old ");

            }else  {
                System.out.println(" false information  ");


            }

        } else if (age >= 12 && age <= 24) {
            if (ticket == 1) {

                ageDiscound24 = totalPrice * 0.1;
                price += totalPrice - ageDiscound24;

                System.out.println(price);

                System.out.println("you have %10 discound because of you are between  12 to 24 years old");
            } else if (ticket == 2) {

                price += ((totalPrice - (totalPrice * 0.1)) - (totalPrice - (totalPrice * 0.1)) * 0.2) * 2;

                System.out.println(price);
                System.out.println("you have %10  + % 20 discound because of you are between  12 to 24 years old %10 + %20 indirim uygulandı ");
            }else  {
                System.out.println(" false information  ");


            }
        } else if (age >= 65) {
            if (ticket == 1) {
                ageDiscound65 = totalPrice * 0.3;
                price += totalPrice - ageDiscound65;

                System.out.println(price);

                System.out.println("you have %30 discound because of you are above than 64 years old");
            } else if (ticket == 2) {
                price += ((totalPrice - (totalPrice * 0.3)) - (totalPrice -  totalPrice * 0.3) * 0.2) * 2;
                System.out.println(price);
                System.out.println("you have %30 + %20 discound because of you are above than 64 years old ");
            }else {
                System.out.println(" Check your information again  ");
            }


        }
    }
}
