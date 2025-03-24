import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 AFN");
        System.out.println("2 USD");
        System.out.println("3 NZD");
        System.out.println("4 CHF");
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the currency code: ");
        int currency = sc.nextInt();
        System.out.println("Enter the amount to convert: ");
        double amount = sc.nextDouble();

        //switch case for each currency
        switch (currency) {
            case 1:
                AFN_to_ruppe(amount);
                break;
                case 2:
                    USD_to_ruppe(amount);
                    break;
                    case 3:
                        NZD_to_Ruppe(amount);
                        break;
                        case 4:
                            CHF_to_Ruppe(amount);
                            break;
                            default:
                                System.out.println("Invalid currency code");

        }
    }

    public static void AFN_to_ruppe(double amt){
        System.out.println("1  AFN=" +1.21+ "Rupees");
        System.out.println();

        System.out.println(+amt+ " AFN " +(amt*1.21)+ " Rupees");
        System.out.println();
    }
    public static void USD_to_ruppe(double amt) {
        System.out.println("1  USD=" +86.00+ "Rupees");
        System.out.println();

        System.out.println(+amt+ " USD " +(amt*86.00)+ " Rupees");
        System.out.println();
    }

    public static void NZD_to_Ruppe(double amt) {
        System.out.println("1  NZD=" +49.26+ "Rupees");
        System.out.println();

        System.out.println(+amt+ " NZD " +(amt*49.26)+ " Rupees");
        System.out.println();
    }

    public static void CHF_to_Ruppe(double amt) {
        System.out.println("1  CHF=" +96.94+ "Rupees");
        System.out.println();

        System.out.println(+amt+ " CHF " +(amt*96.94)+ " Rupees");
        System.out.println();
    }
}